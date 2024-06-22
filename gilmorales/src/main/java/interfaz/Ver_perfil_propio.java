package interfaz;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_perfil_propio extends Ver_tendencias {
	
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Ver_publicaciones_gustadas_Usuario_registrado publicaciones_gustadas ;
	public Ver_publicaciones_propias _ver_publicaciones_propias;
	public Ver_seguidores _ver_seguidores;
	public Ver_seguidos _ver_seguidos;
	public Editar_perfil _editar_perfil;
	public Configurar_perfil _configurar_perfil;
	public Eliminar_publicaciones _eliminar_publicaciones;
    private String imagenPerfil;	
	
	public Ver_perfil_propio(Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		this._cabecera_Usuario_Registrado = cabecera_top._cabecera_Usuario_Registrado;
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getBotonDenunciar().setVisible(false);
    	this.getBotonSeguir().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this.user.getNombreUsuario());
    	this.getNombreYapellidos().setText(this.user.getNombre() + " " + this.user.getApellidos());
    	this.getBotonBloquear().setVisible(false);
    	this.imagenPerfil = this.user.getFoto();
    	this.getFotoPerfil1().setImage(this.imagenPerfil);
    	this.getLabelDescripcion().setText(this.user.getDescripcion());
    	Ver_publicaciones_propias();
    	Ver_seguidores();
    	Ver_seguidos();
    	Editar_perfil();
    	Configurar_perfil();
    	Ver_publicaciones_gustadas__Usuario_registrado_();
    	Eliminar_publicaciones();
    	NumeroMeGusta();
    	NumeroSeguidores();
    	NumeroSeguidos();
    	NumeroMeGusta();

	}

	public void Ver_publicaciones_gustadas__Usuario_registrado_() {
		this.publicaciones_gustadas = new Ver_publicaciones_gustadas_Usuario_registrado();
		this.getBotonMeGustas().addClickListener(event ->{
			this.getListaMeGustas().setVisible(true);
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().as(VerticalLayout.class).add(publicaciones_gustadas);
		});
	}

	public void Ver_publicaciones_propias() {
		_ver_publicaciones_propias = new Ver_publicaciones_propias(this.user, this);
		this.getBotonVideos().addClickListener(event ->{
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_publicaciones_propias);
	}

	public void Ver_seguidores() {
		this.getVerSeguidores().addClickListener(event ->{
			_ver_seguidores = new Ver_seguidores(this.user, this);
			Dialog dialog = new Dialog();
			dialog.add(_ver_seguidores);
			dialog.setCloseOnEsc(true);
			dialog.setWidth("50%");
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			this._ver_seguidores.getBotonCerrar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Ver_seguidos() {
		this.getVerSiguiendos().addClickListener(event ->{
			_ver_seguidos = new Ver_seguidos(this.user, this);
			Dialog dialog = new Dialog();
			dialog.add(_ver_seguidos);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setCloseOnEsc(true);
			dialog.setWidth("50%");
			this._ver_seguidos.getBotonSalir().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Editar_perfil() {
		
		this.getBotonEditarPerfil().addClickListener(event ->{
			Dialog dialog = new Dialog();
			_editar_perfil = new Editar_perfil(this.user, dialog, this);
			dialog.add(_editar_perfil);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			this._editar_perfil.getBotonCancelar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Configurar_perfil() {
		this.getBotonModificarPerfil().addClickListener(event ->{
			Dialog dialog = new Dialog();
			_configurar_perfil = new Configurar_perfil(this.user, dialog, this);
			dialog.add(_configurar_perfil);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			this._configurar_perfil.getBotonCerrar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Eliminar_publicaciones() {
		_eliminar_publicaciones = new Eliminar_publicaciones(this.user);
		this.getBotonEliminarPublicacion().addClickListener(event ->{
			this._eliminar_publicaciones.setVisible(true);
			this.getLayoutTendencias().setVisible(false);
			this.getVaadinVerticalLayout1().setVisible(false);
			this.getVaadinHorizontalLayout().add(_eliminar_publicaciones);
		});
		this._eliminar_publicaciones.getBotonCancelar().addClickListener(event ->{
			this.getLayoutTendencias().setVisible(true);
			this.getVaadinVerticalLayout1().setVisible(true);
			this._ver_publicaciones_propias = new Ver_publicaciones_propias(this.user, this);
		});
	}

	public void NumeroSeguidores() {
//		this.getNumSeguidores().setVisible(false);
		this.getNumSeguidores().setText(this.user.seguidor.size()+"");
	}

	public void NumeroSeguidos() {
		this.getNumSiguiendo().setText(this.user.seguir.size()+"");
//		this.getNumSiguiendo().setVisible(false);
	}

	public void NumeroMeGusta() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());
		int numMeGustas = 0;
		for(Publicacion p : publicaciones) {
			numMeGustas += p.getNumMeGustas();
		}
		this.getNumMeGustas().setText(numMeGustas+"");
	}

}