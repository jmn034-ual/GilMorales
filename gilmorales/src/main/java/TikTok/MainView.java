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
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileBuffer;
import com.vaadin.flow.component.upload.receivers.FileData;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.component.upload.receivers.MultiFileBuffer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import basededatos.BDPrincipal;
import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.UsuarioComercial;
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

		this.getStyle().set("background-color", "#423F3F");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.setSizeFull();
		this.setMargin(false);
		this.setPadding(false);
		BDPrincipal bd = new BDPrincipal();

//		Registrar registro = new Registrar(unr);
//		add(registro);
		
//
				Usuario_Registrado ur = new Usuario_Registrado(2);
				add(ur);
		
//		Usuario_No_Registrado unr = new Usuario_No_Registrado();
//		add(unr);
//
//		unr.cabeceraUNR.getBotonRegistrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//
//
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				// TODO Auto-generated method stub
//				removeAll();
//				Registrar registro = new Registrar(unr);
//				add(registro);
//				registro.getConfirmar().addClickListener(event2 ->{
//					if(registro.getValido()) {
//						removeAll();
//						UsuarioRegistrado user = (UsuarioRegistrado) bd.iniciarSesion(registro.getNombreDeUsuarioTF().getValue(), registro.getContrasenaTF().getValue());
//						Usuario_Registrado ur = new Usuario_Registrado(user.getID());
//						add(ur);
//					}else {
//						removeAll();
//						UsuarioComercial uc = (UsuarioComercial) bd.iniciarSesion(registro.getNombreDeUsuarioTF().getValue(), registro.getContrasenaTF().getValue());
//						Usuario_comercial comercial = new Usuario_comercial(uc.getID());
//						add(comercial);
//					}
//				});
//			}
//		});
//
//		unr.cabeceraUNR.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				unr.inicioSesion.getIniciarSesionB().addClickListener(event2 ->{
//					Object usuarioValidado =  unr.inicioSesion.Validar_datos();
//					if(usuarioValidado == null) {
//						// Manejar el caso en el que no se encontró ningún usuario con el nombre especificado
//						Notification.show("Usuario y/o contraseña incorrecta.");
//					}
//					else {
//					 switch (usuarioValidado.getClass().getSimpleName()) {
//				        case "UsuarioRegistrado":
//				            UsuarioRegistrado ur2 = (UsuarioRegistrado) usuarioValidado;
//				                removeAll();
//				                Usuario_Registrado urInterfaz = new Usuario_Registrado(ur2.getID());
//				                add(urInterfaz);
//				                urInterfaz._cabecera_Usuario_Registrado.getBotonCerrarSesion().addClickListener(event3 ->{
//				                    removeAll();
//				                    add(unr);
//				                });
////				            }
//				            break;
//				        case "UsuarioComercial":
//				            UsuarioComercial com = (UsuarioComercial) usuarioValidado;
//				                Usuario_comercial comercial = new Usuario_comercial(com.getID());
//				                removeAll();
//				                add(comercial);
//				                comercial._cabecera_Usuario_Comercial.getBotonCerrarSesion().addClickListener(event4 ->{
//				                    removeAll();
//				                    add(unr);
//				                });
////				            }
//				            break;
//				        default:
//							Notification.show("Usuario y/o contraseña incorrecta.");
//				            break;
//				    }
//					}
//				});
//			}
//		});


	}
}
