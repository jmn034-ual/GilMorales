package TikTok;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Lista_Publicaciones__Usuario_no_registrado_;
import interfaz.Lista_Publicaciones__Usuario_no_registrado__item;
import interfaz.Usuario_No_Registrado;
import interfaz.Ver_comentarios__Usuario_No_registrado_;

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
    	this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.setMargin(false);
    	this.setPadding(false);
    	Usuario_No_Registrado nr = new Usuario_No_Registrado();
    	add(nr);
//    	Iniciar_Sesion__4 ini = new Iniciar_Sesion__4();
//    	add(ini);
  	
    }

}
