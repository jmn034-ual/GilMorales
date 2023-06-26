package TikTok;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;
import interfaz.*;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
shortName = "Vaadin App",
description = "This is an example Vaadin application.",
enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

	/**
	 * Construct a new Vaadin view.
	 * <p>
	 * Build the initial UI state for the user accessing the application.
	 *
	 * @param service The message service. Automatically injected Spring managed bean.
	 */
	public MainView() {

		//    	this.getStyle().set("background-color", "#000000");
		//    	this.getStyle().set("width", "100%");
		//    	this.getStyle().set("height", "100%");
		this.setSizeFull();
		this.setMargin(false);
		this.setPadding(false);
		BDPrincipal bd = new BDPrincipal();

		Usuario_No_Registrado unr = new Usuario_No_Registrado(bd);
		add(unr);
		
		unr.cabeceraUNR.getBotonRegistrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {


			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				removeAll();
				Registrar registro = new Registrar(bd);
				add(registro);
				registro.getConfirmar().addClickListener(event2 ->{
					removeAll();
					UsuarioRegistrado usuario = bd.cargarUsuarioRegistrado(registro.getNombreDeUsuarioTF().getValue(), registro.getContrasenaTF().getValue());
					Usuario_Registrado ur = new Usuario_Registrado(usuario, bd);
					add(ur);
				});
			}
		});

		unr.cabeceraUNR.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				removeAll();
				Iniciar_Sesion__4 login = new Iniciar_Sesion__4(bd);
				add(login);
				login.getIniciarSesionB().addClickListener(event2 ->{
					removeAll();
					UsuarioRegistrado usuario = bd.cargarUsuarioRegistrado(login.getUsuarioTF().getValue(), login.getContrasenaTF().getValue());
					Usuario_Registrado ur2 = new Usuario_Registrado(usuario, bd);
					add(ur2);
				});
			}
		});
			
		
	}

}
