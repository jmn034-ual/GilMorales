package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;

import basededatos.iVer_perfil__Administrador_;

public class Ver_perfil_Administrador extends Ver_Perfil__2{

	public iVer_perfil__Administrador_ _iVer_perfil__Administrador_;
	public Ver_publicaciones_gustadas _ver_publicaciones_gustadas;
	public Bloquear_usuario _bloquear_usuario;
	public Lista_publicaciones_usuario _lista_publicaciones_usuario;
	iAdministrador bd = new BDPrincipal();


	public Ver_perfil_Administrador(Cabecera_TOP cabecera_top, UsuarioRegistrado ur) {
		super(cabecera_top);
		this.user = ur;
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getBotonSeguir().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(false);
		this.getBotonDenunciar().setVisible(false);
		this.getLabelUsuarioPrivado().setVisible(false);
		this.getBotonEditarPerfil().setVisible(false);
		this.getBotonModificarPerfil().setVisible(false);
		this.getLabelSiguiendo().setVisible(false);
		this.getLabelSeguidores().setVisible(false);
		if(this.user != null) {
			this.getNombreUsuario().setText(this.user.getNombreUsuario());
			this.getNombreYapellidos().setText(this.user.getNombre() + " " + this.user.getApellidos());
			this.getFotoPerfil1().setImage(this.user.getFoto());
			Ver_publicaciones_gustadas();
			Lista_publicaciones_usuario();
		}
	}
	
	public void Ver_publicaciones_gustadas() {
		_ver_publicaciones_gustadas = new Ver_publicaciones_gustadas(this);
		this.getBotonMeGustas().addClickListener(event -> {
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicaciones_gustadas);
		});
	}

	public void Bloquear_usuario() {
		this.getBotonBloquear().addClickListener(event ->{
			bd.bloquearUsuario(this.user.getID());
		});
	}

	public void Lista_publicaciones_usuario() {
		this._lista_publicaciones_usuario = new Lista_publicaciones_usuario(this.user, this);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_lista_publicaciones_usuario);
		this.getBotonVideos().addClickListener(event -> {
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}
}