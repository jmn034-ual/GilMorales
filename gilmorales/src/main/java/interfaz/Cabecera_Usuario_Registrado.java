package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

import bd_dcl.UsuarioRegistrado;

public class Cabecera_Usuario_Registrado extends Comun__Comercial_y_Usuario_Registrado_ {

	public Usuario_Registrado _usuario_Registrado;
	public Ver_notificaciones _ver_notificaciones = new Ver_notificaciones();
	public Ver_perfil_propio _ver_perfil_propio = new Ver_perfil_propio();
;
	public Realizar_busqueda _realizar_busqueda;
	public Cabecera_TOP _cabecera_TOP = new Cabecera_TOP();
	private UsuarioRegistrado ur;
	private Usuario_Registrado urInterfaz;
	
	public Cabecera_Usuario_Registrado(UsuarioRegistrado ur, Usuario_Registrado urInterfaz) {
		super();
		this.ur = ur;
		this.urInterfaz = urInterfaz; 
		this.getVaadinVerticalLayout1().setVisible(false);
    	Cabecera_TOP();  
//    	this.Add_publicacion();
    	volverInicio();
//    	Ver_perfil_propio();
//    	Ver_notificaciones();
    	Realizar_busqueda();
	}
	@Override
	public void Add_publicacion() {
		this.addPubli = new Add_publicacion(ur, urInterfaz);
		this.getBotonAniadir().addClickListener(event->{
			this.getBotonAniadir().setVisible(false);
			this._realizar_busqueda.setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this._ver_notificaciones.setVisible(false);
			this.addPubli.setVisible(true);
			this._ver_perfil_propio.setVisible(false);
			this._ver_perfil_propio._ver_seguidores.setVisible(false);
			this._ver_perfil_propio._ver_seguidos.setVisible(false);
    		this._cabecera_TOP.getCabeceraTop().setVisible(false);
    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonPerfil().setVisible(true);
		});
	}
	
//	public void Ver_notificaciones() {
//		this.getBotonNotificaciones().addClickListener(event -> {
//			_ver_notificaciones = new Ver_notificaciones(ur);
//			this._ver_notificaciones.setVisible(true);
////			this.getVaadinVerticalLayout1().as(VerticalLayout.class).setVisible(true);
//			this._ver_perfil_propio._ver_lista_Hashtag.setVisible(false);
//			this._ver_perfil_propio._ver_lista_Hashtag.setVisible(false);
//			this._ver_perfil_propio._ver_seguidores.setVisible(false);
//			this._ver_perfil_propio._ver_seguidos.setVisible(false);
//			this._cabecera_TOP.getCabeceraTop().setVisible(false);
//    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
//			this._ver_perfil_propio.setVisible(false);
//			this.addPubli.setVisible(false);
//			this.getBotonPerfil().setVisible(true);
//			this.getBotonAniadir().setVisible(true);
////			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
////			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(_ver_notificaciones);
//			urInterfaz.getListaPublicaciones().setVisible(false);
//			urInterfaz.getVaadinHorizontalLayout().add(_ver_notificaciones);
//		});
//	}

//	public void Ver_perfil_propio() {
//		this.getBotonPerfil().addClickListener(event -> {
//			_ver_perfil_propio =  new Ver_perfil_propio(ur);
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this._ver_perfil_propio._eliminar_publicaciones.setVisible(false);
//			this._ver_perfil_propio.getLayoutTendencias().setVisible(true);
//			this._ver_notificaciones.setVisible(false);
//			this._ver_perfil_propio.getVaadinVerticalLayout1().setVisible(true);
//			this._ver_perfil_propio.setVisible(true);
//			this._cabecera_TOP.getCabeceraTop().setVisible(false);
//    		this._cabecera_TOP.getLayoutAyuda().setVisible(false);
//			this.getBotonPerfil().setVisible(false);
//			this.getBotonAniadir().setVisible(true);
//			this.getBotonNotificaciones().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(_ver_perfil_propio);
//		});
//		this._ver_perfil_propio.getBotonVerListaHashtags().addClickListener(event -> {
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this.getBotonPerfil().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_perfil_propio._ver_lista_Hashtag);
//		});
//		this._ver_perfil_propio.getVerSeguidores().addClickListener(event->{
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_perfil_propio._ver_seguidores);
//		});
//		this._ver_perfil_propio.getVerSiguiendos().addClickListener(event->{
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_perfil_propio._ver_seguidos);
//		});
//		this._ver_perfil_propio.getBotonEditarPerfil().addClickListener(event ->{
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_perfil_propio._editar_perfil);
//		});
//		this._ver_perfil_propio.getBotonModificarPerfil().addClickListener(event ->{
//			this.getVaadinVerticalLayout1().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._ver_perfil_propio._configurar_perfil);
//		});
//	}

	public void Realizar_busqueda() {
		_realizar_busqueda = new Realizar_busqueda();
		this.getBotonBuscar().addClickListener(event ->{
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			this._realizar_busqueda.setVisible(true);
			this._cabecera_TOP.setVisible(false);
			this.getVaadinVerticalLayout1().setVisible(true);
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this._realizar_busqueda);
		});
	}
	public void Cabecera_TOP() {
		_cabecera_TOP.getLayoutListaResultadoBusqueda().setVisible(false);
    	this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_cabecera_TOP);
	}
	public void volverInicio() {
		this.getInicio().addClickListener(event -> {
			_realizar_busqueda = new Realizar_busqueda();
			this._ver_perfil_propio.setVisible(false);
			this._cabecera_TOP.getCabeceraTop().setVisible(true);
			this._cabecera_TOP.getLayoutAyuda().setVisible(false);
			this.getBotonNotificaciones().setVisible(true);
			this.getBotonPerfil().setVisible(true);
			this.getBotonAniadir().setVisible(true);
			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			Cabecera_TOP();
		});
	}
}