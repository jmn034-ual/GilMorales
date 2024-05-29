package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaVerPublicacionUsuarioNoRegistrado;

public class Ver_publicacion_Usuario_No_Registrado extends VistaVerPublicacionUsuarioNoRegistrado{
	public Lista_Publicaciones_Usuario_no_registrado_item _publicaciones__Usuario_no_registrado_;
	public Publicaciones_hashtag_item hashtag;
	public Lista_usuarios_registrados_item userRegistradoItem;
	public Ver_comentarios_Usuario_No_registrado _ver_comentarios__Usuario_No_registrado_;
	public Lista_Top_Comentarios_Usuario_No_Registrado _lista_Top_Comentarios__Usuario_No_Registrado_;
	public Ver_Perfil__2 ver_perfil;
	Publicacion p;
	Usuario_No_Registrado unr;
	
	public Ver_publicacion_Usuario_No_Registrado(Publicacion p, Object interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.p = p;
		if(interfaz instanceof Lista_Publicaciones_Usuario_no_registrado_item) {
			this._publicaciones__Usuario_no_registrado_ = (Lista_Publicaciones_Usuario_no_registrado_item) interfaz;
			this.unr = this._publicaciones__Usuario_no_registrado_._publicaciones__Usuario_no_registrado_.unr;
		}else if(interfaz instanceof Publicaciones_hashtag_item) {
			this.hashtag = (Publicaciones_hashtag_item) interfaz;
			this.unr = this.hashtag.userNoRegistrado;
		}else {
			this.userRegistradoItem = (Lista_usuarios_registrados_item) interfaz;
			this.unr = this.userRegistradoItem._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_No_Registrado.unr;
		}
			
		this.getVideo().add(new Video(p.getVideo()));
		this.getDescripcion().setText(p.getDescripcion());
		Comentarios();
		Lista_Top_Comentarios__Usuario_No_Registrado_();
		NumeroVisualizaciones();
		NumeroMeGustas();
		Ver_comentarios__Usuario_No_registrado_();
		mostrarDatosUsuario();
		if(this.p.getPerteneceA() != null) {
			Ver_perfil();	
		}else {
			this.getVerPerfil().setDisableOnClick(false);
		}
	}
	public void mostrarDatosUsuario() {
		if(this.p.getPerteneceA() != null) {
			this.getAvatar().setImage(this.p.getPerteneceA().getFoto());
			this.getVerPerfil().setText(this.p.getPerteneceA().getNombreUsuario());
		}else{
			this.getAvatar().setImage(this.p.getEsPublicada().getFoto());
			this.getVerPerfil().setText(this.p.getEsPublicada().getNombreUsuarioComercial());
		}

	}
	
	public void Ver_perfil() {
		if(this.p.getPerteneceA().getPrivacidad() == 0) {
			if(this._publicaciones__Usuario_no_registrado_ != null)
				this.ver_perfil = new Ver_perfil_publico(this.p.getPerteneceA(), this, this.unr.cabeceraUNR._cabecera_TOP);
			else if(this.hashtag != null)
				this.ver_perfil = new Ver_perfil_publico(this.p.getPerteneceA(), this, this.unr.cabeceraUNR._cabecera_TOP);
			else
				this.ver_perfil = new Ver_perfil_publico(this.p.getPerteneceA(), this, this.unr.cabeceraUNR._cabecera_TOP);
		}else {
			if(this._publicaciones__Usuario_no_registrado_ != null)
				this.ver_perfil = new Ver_perfil_privado(this.p.getPerteneceA(), this.unr.cabeceraUNR._cabecera_TOP);
			else if(this.hashtag != null)
				this.ver_perfil = new Ver_perfil_privado(this.p.getPerteneceA(), this.unr.cabeceraUNR._cabecera_TOP);
			else
				this.ver_perfil = new Ver_perfil_privado(this.p.getPerteneceA(), this.unr.cabeceraUNR._cabecera_TOP);

		}
		
		this.getVerPerfil().addClickListener(event ->{

			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		_ver_comentarios__Usuario_No_registrado_ = new Ver_comentarios_Usuario_No_registrado(this.p, unr);
		this.getBotonVerComentario().addClickListener(event -> {
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(_ver_comentarios__Usuario_No_registrado_);
		});	}

	public void Lista_Top_Comentarios__Usuario_No_Registrado_() {
		_lista_Top_Comentarios__Usuario_No_Registrado_ = new Lista_Top_Comentarios_Usuario_No_Registrado(p);
		this.getVaadinVerticalLayout5().as(VerticalLayout.class).add(_lista_Top_Comentarios__Usuario_No_Registrado_);
	}

	public void NumeroMeGustas() {
		this.getNumMeGustas().setText(this.p.getNumMeGustas()+"");
	}

	public void Comentarios() {
		this.getNumComentarios().setText(this.p.getNumComentarios()+"");
	}

	public void NumeroVisualizaciones() {
		this.p.setNumVisualizaciones(this.p.getNumVisualizaciones()+1);
		this.getNumVisualizaciones().setText(this.p.getNumVisualizaciones()+"");
	}
}