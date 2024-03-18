package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioRegistrado;

public class Lista_publicaciones_Usuario_Registrado_item extends Lista_Publicaciones_Usuario_no_registrado_item {

	public Lista_publicaciones_Usuario_Registrado _lista_publicaciones__Usuario_Registrado_;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Denunciar_publicacion _denunciar_publicacion;
	public Ver_comentarios_Usuario_Registrado verComentarios;
	Usuario_Registrado urinterfaz;
	BDPrincipal bd = new BDPrincipal();
	UsuarioRegistrado user;

	public Lista_publicaciones_Usuario_Registrado_item(Publicacion publicacion, Usuario_Registrado urinterfaz, UsuarioRegistrado user) {
		super(publicacion);
		this.urinterfaz = urinterfaz;
		this.user = user;
		this.getLayoutBotonesUsuarioR().setVisible(true);
		this.getLabelGeolocalizacion().setText(publicacion.getLocalizacion());
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(this.publicacion.getVideo()));
		this.getVaadinButton().setVisible(true);
		this.getLabelMeGustas().setVisible(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getLayoutComentar().setVisible(true);
		Ver_comentarios__Usuario_Registrado_();
		mostrarDatosUsuario();
		if(this.publicacion.getPerteneceA() != null) {
			Ver_perfil();	
			Seguir();
		}else {
			this.getBotonNombreUsuario().setDisableOnClick(false);
		}
		Dar_me_gusta_publicacion();
		Ver_publicacion_ajena();
		Denunciar_publicacion();
		Comentar();
		
	}
	
	public void Ver_comentarios__Usuario_Registrado_() {
		verComentarios = new Ver_comentarios_Usuario_Registrado(this.publicacion, urinterfaz, user);
		this.getBotonVerComentarios().addClickListener(event -> {
			urinterfaz.getListaPublicaciones().setVisible(false);
			urinterfaz.getCabeceraTop().setVisible(false);
			urinterfaz.getVaadinHorizontalLayout().add(verComentarios);
		});
	}
	@Override
	public void Ver_perfil() {
//		this.ver_perfil = new Ver_perfil_publico(publicacion.getPerteneceA());
		this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA());
		this.getBotonNombreUsuario().addClickListener(event ->{
			urinterfaz.getListaPublicaciones().setVisible(false);
			urinterfaz._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(false);
			urinterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}
	
	public void Ver_publicacion_ajena() {
		this._ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.user, this.urinterfaz);
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event ->{
			urinterfaz.getListaPublicaciones().setVisible(false);
			urinterfaz._cabecera_Usuario_Registrado._cabecera_TOP.setVisible(false);
			urinterfaz.getVaadinHorizontalLayout().add(_ver_publicacion_ajena);
			});
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.user.getID(), this.publicacion.getPerteneceA().getID());
		});
	}

	public void Dar_me_gusta_publicacion() {
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		this.getVaadinButton().addClickListener(event -> {
			this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
		});
	}

	public void Denunciar_publicacion() {
		_denunciar_publicacion = new Denunciar_publicacion(this.publicacion.getPerteneceA(), this.user);
		this.getBotonDenunciar().addClickListener(event ->{
			Dialog dialog = new Dialog(_denunciar_publicacion);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("70%");
			dialog.setWidth("61%");
			this._denunciar_publicacion.getBotonCancelar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Comentar() {
		this.getBotonComentar().addClickListener(event -> {
			 this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(), this.getTextFieldComentario().getValue());
		});
	}
}