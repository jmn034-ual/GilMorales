package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_comentarios_Usuario_Registrado extends Ver_comentarios {
	
	public Ver_publicacion_propia verPropia;
	public Ver_publicacion_ajena verAjena;
	public Lista_publicaciones_Usuario_Registrado_item publicacionItem;
	public Lista_comentarios_Usuario_registrado _lista_comentarios__Usuario_registrado_;
	UsuarioRegistrado user;
	boolean gusta = false;
	Icon icono = null;
	public Ver_me_gustas_publicacion _ver_me_gustas_publicacion;
	public Dialog dialog;
	public Cabecera_TOP top;
	
	public Ver_comentarios_Usuario_Registrado(Publicacion publicacion, Object interfaz, UsuarioRegistrado user) {
		super(publicacion);
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.user = bd.cargarUsuarioRegistrado(user.getID());
		if(interfaz instanceof Lista_publicaciones_Usuario_Registrado_item) {			
			this.publicacionItem = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
			this.top = this.publicacionItem._lista_publicaciones__Usuario_Registrado_.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP;
		}else if(interfaz instanceof Ver_publicacion_propia){
			this.verPropia = (Ver_publicacion_propia) interfaz;
			this.top = this.verPropia.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP;
		}else if(interfaz instanceof Ver_publicacion_ajena){
			this.verAjena = (Ver_publicacion_ajena) interfaz;
			this.top = this.verAjena.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP;
		}
		if (this.publicacion.getPerteneceA() != null) {
			if(this.publicacion.getPerteneceA().getID() == this.user.getID()) {
				this.getBotonSeguir().setVisible(false);
				Ver_me_gustas_publicacion();
			}else {
				Seguir();
				Dar_me_gusta_publicacion();
			}
			this.Ver_perfil(this);
		} else {
			this.getBotonNombreUsuario().setDisableOnClick(false);
			this.getBotonSeguir().setVisible(false);
			Dar_me_gusta_publicacion();
		}
		this.getBotonEliminarAdmi().setVisible(false);
		Lista_comentarios__Usuario_registrado_();
		Comentar();
	}

	public void Lista_comentarios__Usuario_registrado_() {
		_lista_comentarios__Usuario_registrado_ = new Lista_comentarios_Usuario_registrado(this.publicacion, this);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Usuario_registrado_);
	}

	public void Dar_me_gusta_publicacion() {
		gusta = this.publicacion.gustaA.contains(this.user);
		if(gusta) {
			icono = new Icon(VaadinIcon.HEART);
			icono.setSize("30px");
			this.getBotonMeGusta().setIcon(icono);
		}else {
			icono = new Icon(VaadinIcon.HEART_O);
			icono.setSize("30px");
			this.getBotonMeGusta().setIcon(icono);
		}
		this.getBotonMeGusta().addClickListener(event -> {
			gusta = !(gusta);

			this.publicacion = this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.getNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
			if(gusta) {
				icono = new Icon(VaadinIcon.HEART);
				icono.setSize("30px");
				this.getBotonMeGusta().setIcon(icono);
			}else {
				icono = new Icon(VaadinIcon.HEART_O);
				icono.setSize("30px");
				this.getBotonMeGusta().setIcon(icono);
			}
		});	
	}

	public void Seguir() {
		if(this.user.seguir.contains(this.publicacion.getPerteneceA()))
			this.getBotonSeguir().setText("Dejar de Seguir");

		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.user.getID(), this.publicacion.getPerteneceA().getID());
			this.user = this.bd.cargarUsuarioRegistrado(this.user.getID());
			if(this.getBotonSeguir().getText().equals("Dejar de Seguir")) {
				this.getBotonSeguir().setText("Seguir");
				NumeroSeguidores();
			}else
				this.getBotonSeguir().setText("Dejar de Seguir");
		});
	}
	
	public void Comentar() {
		this.getBotonComentar().addClickListener(event -> {
			this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(),
					this.getTextFieldCmentario().getValue());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
			this.getLayoutListaComentarios().as(VerticalLayout.class).removeAll();
			Lista_comentarios__Usuario_registrado_();
			this.getTextFieldCmentario().setValue("");
		});
	}
	
	public void Ver_me_gustas_publicacion() {
		this.getBotonMeGusta().getStyle().set("color", "black");
		this.getBotonMeGusta().setIcon(new Icon(VaadinIcon.HEART));
		_ver_me_gustas_publicacion = new Ver_me_gustas_publicacion(this.publicacion, this);
		this.getBotonMeGusta().addClickListener(event ->{
			dialog = new Dialog(_ver_me_gustas_publicacion);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("30%");
			this._ver_me_gustas_publicacion.getBotonCerrar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}
}