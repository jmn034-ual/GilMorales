package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Publicacion;
import vistas.VistaVerPublicacionUsuarioNoRegistrado;

public class Ver_publicacion_Usuario_No_Registrado extends VistaVerPublicacionUsuarioNoRegistrado{
	public Lista_Publicaciones_Usuario_no_registrado_item _publicaciones__Usuario_no_registrado_;
	public Ver_comentarios_Usuario_No_registrado _ver_comentarios__Usuario_No_registrado_;
	public Lista_Top_Comentarios_Usuario_No_Registrado _lista_Top_Comentarios__Usuario_No_Registrado_;
	public Ver_Perfil__2 ver_perfil;
	Publicacion p;
	Usuario_No_Registrado unr;
	
	public Ver_publicacion_Usuario_No_Registrado(Publicacion p, Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.p = p;
		this.unr = unr;
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
		if(this.p.getPerteneceA().getPrivacidad() == 0)
			this.ver_perfil = new Ver_perfil_publico(this.p.getPerteneceA());
		else 
			this.ver_perfil = new Ver_perfil_privado(this.p.getPerteneceA());
		
		this.getVerPerfil().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.getLayoutCabeceraTop().setVisible(false);
//			unr.getVaadinHorizontalLayout().remove(null)
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
	
	public void Ver_comentarios__Usuario_No_registrado_() {
		_ver_comentarios__Usuario_No_registrado_ = new Ver_comentarios_Usuario_No_registrado(this.p, unr);
		this.getBotonVerComentario().addClickListener(event -> {
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinVerticalLayout2().as(VerticalLayout.class).add(_ver_comentarios__Usuario_No_registrado_);
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