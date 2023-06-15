package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class Ver_perfil_propio extends Ver_tendencias {
	
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Ver_publicaciones_gustadas__Usuario_registrado_ _ver_publicaciones_gustadas__Usuario_registrado_;
	public Ver_publicaciones_propias _ver_publicaciones_propias = new Ver_publicaciones_propias();
	public Ver_seguidores _ver_seguidores = new Ver_seguidores();
	public Ver_seguidos _ver_seguidos = new Ver_seguidos();
	public Editar_perfil _editar_perfil = new Editar_perfil();
	public Configurar_perfil _configurar_perfil = new Configurar_perfil();
	public Eliminar_publicaciones _eliminar_publicaciones;
	
	public Ver_perfil_propio() {
		super();
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getLabelSiguiendo().setVisible(false);
    	this.getLabelSeguidores().setVisible(false);
    	this.getBotonDenunciar().setVisible(false);
    	this.getBotonSeguir().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	Ver_publicaciones_propias();
    	Ver_seguidores();
    	Ver_seguidos();
    	Editar_perfil();
    	Configurar_perfil();
	}

	public void Ver_publicaciones_gustadas__Usuario_registrado_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_publicaciones_propias() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_publicaciones_propias);
	}

	public void Ver_seguidores() {
		this.getVerSeguidores().addClickListener(event ->{
			this._ver_seguidores.setVisible(true);
			this._ver_seguidos.setVisible(false);
			this._editar_perfil.setVisible(false);
		});
	}

	public void Ver_seguidos() {
		this.getVerSiguiendos().addClickListener(event ->{
			this._ver_seguidos.setVisible(true);
			this._ver_seguidores.setVisible(false);
			this._editar_perfil.setVisible(false);
		});
	}

	public void Editar_perfil() {
		this.getBotonEditarPerfil().addClickListener(event ->{
			this._editar_perfil.setVisible(true);
			this._ver_seguidores.setVisible(false);
			this._ver_seguidos.setVisible(false);
		});
	}

	public void Configurar_perfil() {
		this.getBotonModificarPerfil().addClickListener(event ->{
			this._configurar_perfil.setVisible(true);
		});
	}

	public void Eliminar_publicaciones() {
		throw new UnsupportedOperationException();
	}

	public void NumeroSeguidores() {
		throw new UnsupportedOperationException();
	}

	public void NumeroSeguidos() {
		throw new UnsupportedOperationException();
	}

	public void NumeroMeGusta() {
		throw new UnsupportedOperationException();
	}
}