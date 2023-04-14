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
    	Usuario_No_Registrado nr = new Usuario_No_Registrado();
    	add(nr);
//
//
//		
//		Lista_Publicaciones__Usuario_no_registrado__item item1 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
//				"icons/icon.png", "videos/tiktok1.mp4");
//		Lista_Publicaciones__Usuario_no_registrado__item item2 = new Lista_Publicaciones__Usuario_no_registrado__item("usuario1", "Nijar", "Una publicacion de prueba",
//				"icons/luffy.jpg", "videos/tiktok1.mp4");
//		Lista_Publicaciones__Usuario_no_registrado_ lp = new Lista_Publicaciones__Usuario_no_registrado_();
//		lp.anadirPublicacion(item1);
//		lp.anadirPublicacion(item2);
//
//		nr.getLayoutListaPublicaciones().as(VerticalLayout.class).add(lp);
//    	add(nr);
//    	Ver_comentarios__Usuario_No_registrado_ vcnr = new Ver_comentarios__Usuario_No_registrado_(item1);
//    	add(vcnr);
    	
//    	Iniciar_Sesion__4 ini = new Iniciar_Sesion__4();
//    	add(ini);
//    	

    	
//    	Lista_Publicaciones__Administrador_ ls = new Lista_Publicaciones__Administrador_();
//    	Lista_Publicaciones__Administrador__item item1 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//    	Lista_Publicaciones__Administrador__item item2 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//
//    	ls.anadirPublicacion(item1);
//    	ls.anadirPublicacion(item2);
//    	Administrador admin = new Administrador(ls);
//    	add(admin);
//    	Usuario_Registrado usuario = new Usuario_Registrado();
//    	
//    	Lista_denuncias lsd = new Lista_denuncias();
//    	
//    	Lista_denuncias_pendientes_item itemC = new Lista_denuncias_pendientes_item();
//    	
//    	lsd.anadirDenuncia(itemC);
//    	Ver_denuncias denuncia = new Ver_denuncias(lsd);
//    	Lista_denuncias_item itemB= new Lista_denuncias_item(usuario,denuncia);
//    	lsd.anadirDenuncia(itemB);
//    	Gestionar_denuncias ges = new Gestionar_denuncias("Cristian Gil García","27/05/2002","123456","icons/icon.png",denuncia);
//    	admin._cabecera_Administrador.getGestionarDenunciasB().addClickListener(event->{remove(admin);add(ges);});
    	
    	
    	
//    	Lista_publicaciones__Comercial_ lsc = new Lista_publicaciones__Comercial_();
//    	Lista_publicaciones__Comercial__item itemComercial = new Lista_publicaciones__Comercial__item("videos/tiktok1.mp4");
//    	Lista_publicaciones__Comercial__item item2 = new Lista_publicaciones__Comercial__item("videos/tiktok1.mp4");
//    	lsc.anadirPublicacion(itemComercial);
//    	lsc.anadirPublicacion(item2);
//    	Usuario_comercial uc = new Usuario_comercial(lsc,"icons/logo.png","Cristian Gil García","GilGarcíaSL","La mejor empresa del mundo","737");
//    	add(uc);

//    	
//    	Lista_Publicaciones__Administrador_ ls = new Lista_Publicaciones__Administrador_();
//    	Lista_Publicaciones__Administrador__item item1 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//    	Lista_Publicaciones__Administrador__item item2 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//
//    	ls.anadirPublicacion(item1);
//    	ls.anadirPublicacion(item2);
//    	Administrador admin = new Administrador(ls);
//    	add(admin);
//    	
//    	Lista_denuncias_item itemB= new Lista_denuncias_item();
//    	Lista_denuncias lsd = new Lista_denuncias();
//    	lsd.anadirDenuncia(itemB);
//    	Ver_denuncias denuncia = new Ver_denuncias(lsd);
//    	Gestionar_denuncias ges = new Gestionar_denuncias("Cristian Gil García","27/05/2002","123456","icons/icon.png",denuncia);
//    	admin._cabecera_Administrador.getGestionarDenunciasB().addClickListener(event->{remove(admin);add(ges);});
//    	Usuario_Registrado ur = new Usuario_Registrado();
//    	add(ur);
//
//    	
//    	Lista_Publicaciones__Administrador_ ls = new Lista_Publicaciones__Administrador_();
//    	Lista_Publicaciones__Administrador__item item1 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//    	Lista_Publicaciones__Administrador__item item2 = new Lista_Publicaciones__Administrador__item("videos/tiktok1.mp4");
//
//    	ls.anadirPublicacion(item1);
//    	ls.anadirPublicacion(item2);
//    	Administrador admin = new Administrador(ls);
//    	add(admin);
//    	Usuario_Registrado usuario = new Usuario_Registrado();
//    	
//    	Lista_denuncias lsd = new Lista_denuncias();
//    	
//    	Lista_denuncias_pendientes_item itemC = new Lista_denuncias_pendientes_item();
//    	
//    	lsd.anadirDenuncia(itemC);
//    	Ver_denuncias denuncia = new Ver_denuncias(lsd);
//    	Lista_denuncias_item itemB= new Lista_denuncias_item(usuario,denuncia);
//    	lsd.anadirDenuncia(itemB);
//    	Gestionar_denuncias ges = new Gestionar_denuncias("Cristian Gil García","27/05/2002","123456","icons/icon.png",denuncia);
//    	admin._cabecera_Administrador.getGestionarDenunciasB().addClickListener(event->{remove(admin);add(ges);});

    	
    }

}
