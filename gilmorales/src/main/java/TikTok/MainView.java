package TikTok;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfaz.Lista_Publicaciones__Usuario_no_registrado_;
import interfaz.Lista_Publicaciones__Usuario_no_registrado__item;
import interfaz.Usuario_No_Registrado;
import interfaz.Ver_comentarios__Usuario_No_registrado_;
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
//    	this.setMargin(false);
//    	this.setPadding(false);
//    	Usuario_No_Registrado nr = new Usuario_No_Registrado();
//    	add(nr);
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
<<<<<<< HEAD

=======
>>>>>>> branch 'prototipado' of git@github.com:jmn034-ual/GilMorales.git
//    	Recuperar_password rec = new Recuperar_password();
//    	ini.getRecuperarContrasenaB().addClickListener(event->{remove(ini); add(rec);});
//    	
//    	
//    	Registrar reg = new Registrar();
//    	ini.getRegistrarB().addClickListener(event->{remove(ini);add(reg);});
//    	reg.getDescartar().addClickListener(event->{remove(reg); add(ini);});
//    	rec.getRegistrarseB().addClickListener(event->{remove(rec);add(reg);});
//    	
//    	Iniciar_sesion_otras_plataformas isop = new Iniciar_sesion_otras_plataformas();
//    	ini.getFacebookB().addClickListener(event->{remove(ini);add(isop);});
//    	ini.getGoogleB().addClickListener(event->{remove(ini);add(isop);});
//    	ini.getInstagramB().addClickListener(event->{remove(ini);add(isop);});
//    	ini.getTwitterB().addClickListener(event->{remove(ini);add(isop);});
//    	
//    	Usar_otra_cuenta uoc = new Usar_otra_cuenta();
//    	isop.getBotonUsarOtraCuenta().addClickListener(event->{remove(isop); add(uoc);});
//    	uoc.getCancelarB().addClickListener(event->{remove(uoc); add(isop);});

<<<<<<< HEAD
    	Administrador admin = new Administrador();
    	Lista_Publicaciones__Administrador__item itemA = new Lista_Publicaciones__Administrador__item();
    	Lista_Publicaciones__Administrador_ ls = new Lista_Publicaciones__Administrador_();
    	ls.anadirPublicacion(itemA);
    	
    	admin.getLayoutPublicaciones().as(VerticalLayout.class).add(ls);
    	add(admin);
=======
//    	Administrador admin = new Administrador();
//    	Lista_Publicaciones__Administrador__item itemA = new Lista_Publicaciones__Administrador__item();
//    	Lista_Publicaciones__Administrador_ ls = new Lista_Publicaciones__Administrador_();
//    	
//    	admin.getLayoutPublicaciones().as(VerticalLayout.class).add(ls);
//    	add(admin);
//    	Registrar reg = new Registrar();
//    	ini.getRegistrarB().addClickListener(event->{remove(ini);add(reg);});
//    	
//    	Iniciar_sesion_otras_plataformas isop = new Iniciar_sesion_otras_plataformas();
//    	ini.getFacebookB().addClickListener(event->{remove(ini);add(isop);});
//    	
//    	Usar_otra_cuenta uoc = new Usar_otra_cuenta();
//    	isop.getBotonUsarOtraCuenta().addClickListener(event->{remove(isop); add(uoc);});
    	
>>>>>>> branch 'prototipado' of git@github.com:jmn034-ual/GilMorales.git

    }

}
