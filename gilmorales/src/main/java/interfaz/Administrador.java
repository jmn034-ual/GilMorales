package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

//import basededatos.iAdministrador;
import vistas.VistaAdministradorPrincipal;

public class Administrador extends VistaAdministradorPrincipal {
	//public iAdministrador _iAdministrador;
	public Lista_Publicaciones__Administrador_ _lista_Publicaciones__Administrador_= new Lista_Publicaciones__Administrador_();
	public Cabecera_Administrador _cabecera_Administrador = new Cabecera_Administrador();
	public Cabecera_TOP top = new Cabecera_TOP();
	public Element cabeceraTop = top.getCabeceraTop();
	//public Gestionar_denuncias denuncias = new Gestionar_denuncias("Cristian Gil García","27/05/2002","123456","icons/icon.png");
	
	Lista_Publicaciones__Administrador__item item1= new Lista_Publicaciones__Administrador__item("Cristian", "Almería", "hola", "icons/icon.png", "videos/tiktok1.mp4",this);

	public Administrador() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.Cabecera_Administrador();
		this._lista_Publicaciones__Administrador_.anadirPublicacion(item1);
		top.getLayoutListaResultadoBusqueda().setVisible(false);
		this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(top);
		this.Lista_Publicaciones__Administrador_();
		
		this.top.getBotonVerListaHashtag().addClickListener(event->{
			this.getLayoutPublicaciones().as(VerticalLayout.class).removeAll();
		});
		
		this.top.getBotonVerListaUsuarios().addClickListener(event->{
			this.getLayoutPublicaciones().as(VerticalLayout.class).removeAll();
		});
		
//		this.top.tui.getNombreUsuario().addClickListener(event->{
//			this.getVaadinHorizontalLayout().removeAll();
//			this.getVaadinHorizontalLayout().add(this._lista_Publicaciones__Administrador_.p._ver_perfil_administrador_);
//		
//		});
		
		
		this.top._ver_lista_usuarios_registrados.u1.getBotonNombreUsuario().addClickListener(event->{
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(this._lista_Publicaciones__Administrador_.p._ver_perfil_administrador_);
			
		});
		
		this.top._ver_lista_usuarios_registrados.u2.getBotonNombreUsuario().addClickListener(event->{
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(this._lista_Publicaciones__Administrador_.p._ver_perfil_administrador_);
		});
	}
	
	public void Lista_Publicaciones__Administrador_() {
		this.getLayoutPublicaciones().as(VerticalLayout.class).add(_lista_Publicaciones__Administrador_);
	}

	public void Cabecera_Administrador() {
		this.getLayoutCabeceraAdmin().add(_cabecera_Administrador);
		this._cabecera_Administrador.getGestionarDenunciasB().addClickListener(event->{
//			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			//this.getVaadinHorizontalLayout().removeAll();
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).setVisible(false);
//			this.getLayoutPublicaciones().as(VerticalLayout.class).setVisible(false);
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(this._cabecera_Administrador.denuncias);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).setVisible(false);
		});
		
		this._cabecera_Administrador.getInicio().addClickListener(event->{
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).setVisible(false);
//			this.getLayoutPublicaciones().as(VerticalLayout.class).setVisible(false);
//			this.getLayoutCabeceraAdmin().setVisible(false);
			this.getVaadinHorizontalLayout().removeAll();
			this.getLayoutCabeceraAdmin().setVisible(false);
			this._cabecera_Administrador.denuncias.setVisible(false);
			this.getVaadinHorizontalLayout().add(this._cabecera_Administrador._administrador);
		});
		}
}