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
    	this.getLabelSiguiendo().setVisible(false);
    	this.getLabelSeguidores().setVisible(false);
    	this.getBotonDenunciar().setVisible(false);
    	this.getBotonSeguir().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	this.getListaMeGustas().setVisible(false);
    	this.getNombreUsuario().setText(this._cabecera_Usuario_Registrado.urInterfaz.ur.getNombreUsuario());
    	this.getNombreYapellidos().setText(this._cabecera_Usuario_Registrado.urInterfaz.ur.getNombre() + " " + this._cabecera_Usuario_Registrado.urInterfaz.ur.getApellidos());
    	this.getBotonBloquear().setVisible(false);
    	this.imagenPerfil = this._cabecera_Usuario_Registrado.urInterfaz.ur.getFoto();
    	this.getFotoPerfil1().setImage(this.imagenPerfil);
    	Ver_publicaciones_propias();
    	Ver_seguidores();
    	Ver_seguidos();
    	Editar_perfil();
    	Configurar_perfil();
    	Ver_publicaciones_gustadas__Usuario_registrado_();
    	Eliminar_publicaciones();
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
		_ver_publicaciones_propias = new Ver_publicaciones_propias(this.cabecera_top._cabecera_Usuario_Registrado.urInterfaz.ur, this);
		this.getBotonVideos().addClickListener(event ->{
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_publicaciones_propias);
	}

	public void Ver_seguidores() {
		_ver_seguidores = new Ver_seguidores(this._cabecera_Usuario_Registrado.urInterfaz.ur);
		this.getVerSeguidores().addClickListener(event ->{
			this._ver_seguidores.setVisible(true);
			this._ver_seguidos.setVisible(false);
			this._editar_perfil.setVisible(false);
			this._configurar_perfil.setVisible(false);
			Dialog dialog = new Dialog(_ver_seguidores);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("70%");
			dialog.setWidth("61%");
			this._ver_seguidores.getBotonCerrar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Ver_seguidos() {
		_ver_seguidos = new Ver_seguidos(this._cabecera_Usuario_Registrado.urInterfaz.ur);
		this.getVerSiguiendos().addClickListener(event ->{
			this._ver_seguidos.setVisible(true);
			this._ver_seguidores.setVisible(false);
			this._editar_perfil.setVisible(false);
			this._configurar_perfil.setVisible(false);
			Dialog dialog = new Dialog(_ver_seguidos);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("70%");
			dialog.setWidth("61%");
			this._ver_seguidos.getBotonSalir().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}

	public void Editar_perfil() {
		_editar_perfil = new Editar_perfil(this._cabecera_Usuario_Registrado.urInterfaz.ur);
		this.getBotonEditarPerfil().addClickListener(event ->{
			this._editar_perfil.setVisible(true);
			this._ver_seguidores.setVisible(false);
			this._ver_seguidos.setVisible(false);
			this._configurar_perfil.setVisible(false);
			Dialog dialog = new Dialog(_editar_perfil);
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
		_configurar_perfil = new Configurar_perfil(this._cabecera_Usuario_Registrado.urInterfaz.ur);
		this.getBotonModificarPerfil().addClickListener(event ->{
			this._configurar_perfil.setVisible(true);
			this._ver_seguidores.setVisible(false);
			this._ver_seguidos.setVisible(false);
			this._editar_perfil.setVisible(false);
			Dialog dialog = new Dialog(_configurar_perfil);
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
		_eliminar_publicaciones = new Eliminar_publicaciones(this._cabecera_Usuario_Registrado.urInterfaz.ur);
		this.getBotonEliminarPublicacion().addClickListener(event ->{
			this._eliminar_publicaciones.setVisible(true);
			this.getLayoutTendencias().setVisible(false);
			this.getVaadinVerticalLayout1().setVisible(false);
			this.getVaadinHorizontalLayout().add(_eliminar_publicaciones);
		});
		this._eliminar_publicaciones.getBotonCancelar().addClickListener(event ->{
			this.getLayoutTendencias().setVisible(true);
			this.getVaadinVerticalLayout1().setVisible(true);
			this._ver_publicaciones_propias = new Ver_publicaciones_propias(this._cabecera_Usuario_Registrado.urInterfaz.ur, this);
		});
	}

	public void NumeroSeguidores() {
		this.getNumSeguidores().setText(this._cabecera_Usuario_Registrado.urInterfaz.ur.seguidor.size()+"");
	}

	public void NumeroSeguidos() {
		this.getNumSiguiendo().setText(this._cabecera_Usuario_Registrado.urInterfaz.ur.seguir.size()+"");
	}

	public void NumeroMeGusta() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this._cabecera_Usuario_Registrado.urInterfaz.ur.publica.getCollection());
		int numMeGustas = 0;
		for(Publicacion p : publicaciones) {
			numMeGustas += p.getNumMeGustas();
		}
		this.getNumMeGustas().setText(numMeGustas+"");
	}

}