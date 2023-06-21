package TikTok;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

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
    	this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.setMargin(false);
    	this.setPadding(false);

    	Usuario_No_Registrado unr = new Usuario_No_Registrado();
    	add(unr);

//    	Usuario_Registrado ur = new Usuario_Registrado();
//    	add(ur);

    	


//
//    	Administrador admin = new Administrador();
//    	add(admin);
//    	
//    	
//    	Ver_denuncias denuncia = new Ver_denuncias();
//    	Gestionar_denuncias ges = new Gestionar_denuncias("Cristian Gil García","27/05/2002","123456","icons/icon.png",denuncia);
//    	admin._cabecera_Administrador.getGestionarDenunciasB().addClickListener(event->{remove(admin);add(ges);});
    	
    }

}
