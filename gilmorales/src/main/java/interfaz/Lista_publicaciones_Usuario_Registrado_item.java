package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
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
	BDPrincipal bd = new BDPrincipal();
	UsuarioRegistrado user;
	boolean gusta = false;
	Icon icono = null;
	public Ver_me_gustas_publicacion _ver_me_gustas_publicacion;
	public Dialog dialog;

	public Lista_publicaciones_Usuario_Registrado_item(Publicacion publicacion,	Lista_publicaciones_Usuario_Registrado interfaz) {
		this.publicacion = bd.cargarPublicacion(publicacion.getIdPublicacion());
		this._lista_publicaciones__Usuario_Registrado_ = interfaz;
		this.user = bd.cargarUsuarioRegistrado(interfaz.urInterfaz.ur.getID());
		mostrarDatosPublicacion();
		mostrarDatosUsuario();
		this.getLayoutBotonesUsuarioR().setVisible(true);
		this.getVaadinButton().setEnabled(true);
		this.getLayoutComentar().setVisible(true);
		if (this.publicacion.getPerteneceA() != null) {
			if(this.publicacion.getPerteneceA().getID() == this.user.getID()) {
				this.getBotonSeguir().setVisible(false);
				this.getBotonDenunciar().setVisible(false);
				Ver_me_gustas_publicacion();
			}else {
				Seguir();
				Dar_me_gusta_publicacion();
				Denunciar_publicacion();
			}
			Ver_perfil();
		} else {
			this.getBotonNombreUsuario().setDisableOnClick(false);
			this.getBotonSeguir().setVisible(false);
			Dar_me_gusta_publicacion();
		}
		Ver_comentarios__Usuario_Registrado_();
		Ver_publicacion_ajena();
		Comentar();
	}

	public void Ver_comentarios__Usuario_Registrado_() {
		this.getBotonVerComentarios().addClickListener(event -> {
			verComentarios = new Ver_comentarios_Usuario_Registrado(this.publicacion, this, this.user);
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().removeAll();
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().add(verComentarios);
		});
	}

	@Override
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(this.publicacion.getPerteneceA(), this, this._lista_publicaciones__Usuario_Registrado_.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
		this.getBotonNombreUsuario().addClickListener(event -> {
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().removeAll();
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
		});
	}

	public void Ver_me_gustas_publicacion() {
		this.getVaadinButton().getStyle().set("color", "black");
		this.getVaadinButton().setIcon(new Icon(VaadinIcon.HEART));
		this.getVaadinButton().addClickListener(event ->{
			_ver_me_gustas_publicacion = new Ver_me_gustas_publicacion(this.publicacion, this);
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
	
	public void Ver_publicacion_ajena() {
		this.getLayoutVideo().as(VerticalLayout.class).addClickListener(event -> {
			this._ver_publicacion_ajena = new Ver_publicacion_ajena(publicacion, this.user, this);
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().removeAll();
			_lista_publicaciones__Usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().add(_ver_publicacion_ajena);
		});
	}

	public void Seguir() {
		if (this.user.seguir.contains(this.publicacion.getPerteneceA())) {
			this.getBotonSeguir().setText("Dejar de Seguir");
		} 
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.user.getID(), this.publicacion.getPerteneceA().getID());
			this.user = this.bd.cargarUsuarioRegistrado(this.user.getID());
			if(this.getBotonSeguir().getText().equals("Dejar de Seguir"))
				this.getBotonSeguir().setText("Seguir");
			else
				this.getBotonSeguir().setText("Dejar de Seguir");
		});
	}

	public void Dar_me_gusta_publicacion() {
		gusta = this.publicacion.gustaA.contains(this.user);
		if(gusta) {
			icono = new Icon(VaadinIcon.HEART);
			icono.setSize("30px");
			this.getVaadinButton().setIcon(icono);
		}else {
			icono = new Icon(VaadinIcon.HEART_O);
			icono.setSize("30px");
			this.getVaadinButton().setIcon(icono);
		}		
		this.getVaadinButton().addClickListener(event -> {
			gusta = !(gusta);
			this.publicacion = this.bd.meGustaPublicacion(this.publicacion.getIdPublicacion(), this.user.getID());
			this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas() + "");
			if(gusta) {
				icono = new Icon(VaadinIcon.HEART);
				icono.setSize("30px");
				this.getVaadinButton().setIcon(icono);
			}else {
				icono = new Icon(VaadinIcon.HEART_O);
				icono.setSize("30px");
				this.getVaadinButton().setIcon(icono);
			}	
		});
	}

	public void Denunciar_publicacion() {
		_denunciar_publicacion = new Denunciar_publicacion(this.publicacion, this);
		this.getBotonDenunciar().addClickListener(event -> {
			dialog = new Dialog(_denunciar_publicacion);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			this._denunciar_publicacion.getBotonCancelar().addClickListener(event2 -> {
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Comentar() {
		this.getBotonComentar().addClickListener(event -> {
			this.bd.comentarPublicacion(this.publicacion.getIdPublicacion(), this.user.getID(),
					this.getTextFieldComentario().getValue());
			this.publicacion = this.bd.cargarPublicacion(this.publicacion.getIdPublicacion());
			this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
			this.getTextFieldComentario().setValue("");
		});
	}
}