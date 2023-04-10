package TikTok;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Iniciar_Sesion__4;
import interfaz.Iniciar_sesion__3;
import interfaz.Iniciar_sesion_otras_plataformas;
import interfaz.Lista_Publicaciones__Usuario_no_registrado_;
import interfaz.Lista_Publicaciones__Usuario_no_registrado__item;
import interfaz.Usar_otra_cuenta;
import interfaz.Usuario_No_Registrado;
import interfaz.Usuario_Registrado;

import org.springframework.beans.factory.annotation.Autowired;

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

    	Usuario_No_Registrado nr = new Usuario_No_Registrado();
		nr.getStyle().set("width", "100%");
		nr.getStyle().set("height", "100%");
		
		Lista_Publicaciones__Usuario_no_registrado__item item = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
				"icons/luffy.jpg", "videos/tiktok1.mp4");
		Lista_Publicaciones__Usuario_no_registrado_ lp = new Lista_Publicaciones__Usuario_no_registrado_();
		lp.anadirPublicacion(item);
		nr.getLayoutListaPublicaciones().as(VerticalLayout.class).add(lp);
    	add(nr);
    	
//    	Iniciar_Sesion__4 is = new Iniciar_Sesion__4();
//    	is.getStyle().set("width", "100%");
//    	is.getStyle().set("height", "100%");
//    	add(is);
//    	is.Iniciar_sesion_otras_plataformas();
//    	is.Recuperar_password();
//    	is.Registrar();
//    	is._iniciar_sesion_otras_plataformas.Usar_otra_cuenta();
    	
    	
    }

}
