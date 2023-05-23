package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class Ver_perfil_propio extends Ver_tendencias {
	private IronIcon _fotoPerfil;
	private Label _nombreUsuarioL;
	private Label _nombreApellidosL;
	private Button _editarPerfilB;
	private int _numeroSiguiendo;
	private int _numeroSeguidores;
	private int _numerMeGusta;
	private Label _siguiendoL;
	private Label _seguidoresL;
	private Label _meGustaL;
	private TextArea _descripcionTA;
	private Button _videosB;
	private Button _meGustaB;
	private Button _modificarPerfilB;
	private Button _eliminarPubliacionB;
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	public Ver_publicaciones_gustadas__Usuario_registrado_ _ver_publicaciones_gustadas__Usuario_registrado_;
	public Ver_publicaciones_propias _ver_publicaciones_propias = new Ver_publicaciones_propias();
	public Ver_seguidores _ver_seguidores;
	public Ver_seguidos _ver_seguidos;
	public Editar_perfil _editar_perfil;
	public Configurar_perfil _configurar_perfil;
	public Eliminar_publicaciones _eliminar_publicaciones;
	
	public Ver_perfil_propio() {
		super();
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getBotonDenunciar().setVisible(false);
    	this.getBotonSeguir().setVisible(false);
    	this.getLabelUsuarioPrivado().setVisible(false);
    	this.getBotonPeticionAmistad().setVisible(false);
    	Ver_publicaciones_propias();
		
	}

	public void Ver_publicaciones_gustadas__Usuario_registrado_() {
		throw new UnsupportedOperationException();
	}

	public void Ver_publicaciones_propias() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_ver_publicaciones_propias);
	}

	public void Ver_seguidores() {
		throw new UnsupportedOperationException();
	}

	public void Ver_seguidos() {
		throw new UnsupportedOperationException();
	}

	public void Editar_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Configurar_perfil() {
		throw new UnsupportedOperationException();
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