package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

import basededatos.iVer_perfil__Administrador_;

public class Ver_perfil_Administrador extends Ver_Perfil__2{

	public iVer_perfil__Administrador_ _iVer_perfil__Administrador_;
	public Ver_publicaciones_gustadas _ver_publicaciones_gustadas;
	public Bloquear_usuario _bloquear_usuario;
	public Lista_publicaciones_usuario _lista_publicaciones_usuario;
	BDPrincipal bd = new BDPrincipal();


	public Ver_perfil_Administrador(Cabecera_TOP cabecera_top, Object ur) {
		super(cabecera_top);
		if(ur instanceof UsuarioRegistrado) {
			this.user = (UsuarioRegistrado) ur;
			this.user = this.bd.cargarUsuarioRegistrado(this.user.getID());
			this.getNombreUsuario().setText(this.user.getNombreUsuario());
			this.getNombreYapellidos().setText(this.user.getNombre() + " " + this.user.getApellidos());
			this.getFotoPerfil1().setImage(this.user.getFoto());
			Ver_publicaciones_gustadas();
			 Bloquear_usuario();
		}else {
			this.comercial = (UsuarioComercial) ur;
			this.comercial = this.bd.cargarUsuarioComercial(this.comercial.getID());
			this.getNombreUsuario().setText(this.comercial.getNombreUsuarioComercial());
			this.getNombreYapellidos().setText(this.comercial.getNombreEmpresa());
			this.getFotoPerfil1().setImage(this.comercial.getFoto());
			this.getBotonMeGustas().setVisible(false);
		}
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getBotonSeguir().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(false);
		this.getBotonDenunciar().setVisible(false);
		this.getLabelUsuarioPrivado().setVisible(false);
		this.getBotonEditarPerfil().setVisible(false);
		this.getBotonModificarPerfil().setVisible(false);
		this.getBotonEliminarPublicacion().setVisible(false);
		Lista_publicaciones_usuario();
		NumeroSeguidores();
		NumeroSeguidos();
		NumeroMegustas();
	}
	
	public void Ver_publicaciones_gustadas() {
		_ver_publicaciones_gustadas = new Ver_publicaciones_gustadas(this);
		this.getBotonMeGustas().addClickListener(event -> {
			this.getBotonMeGustas().addThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getBotonVideos().removeThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getListaMeGustas().setVisible(true);
			this.getListaMeGustas().as(VerticalLayout.class).add(_ver_publicaciones_gustadas);
		});
	}

	public void Bloquear_usuario() {
		if(this.user.getPrivacidad() == 3)
			this.getBotonBloquear().setText("Desbloquear");
		this.getBotonBloquear().addClickListener(event ->{
			this.user = bd.bloquearUsuario(this.user.getID());
			if(this.user.getPrivacidad() == 3)
				this.getBotonBloquear().setText("Desbloquear");
			else
				this.getBotonBloquear().setText("Bloquear");

		});
	}

	public void Lista_publicaciones_usuario() {
		if(this.user != null)
			this._lista_publicaciones_usuario = new Lista_publicaciones_usuario(this.user, this);
		else
			this._lista_publicaciones_usuario = new Lista_publicaciones_usuario(this.comercial, this);
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(_lista_publicaciones_usuario);
		this.getBotonVideos().addClickListener(event -> {
			this.getBotonVideos().addThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getBotonMeGustas().removeThemeVariants(ButtonVariant.LUMO_PRIMARY);
			this.getListaMeGustas().setVisible(false);
			this.getLayoutListaPublicaciones().setVisible(true);
		});
	}
	
	public void NumeroSeguidores() {
		if(this.user != null)
			this.getNumSeguidores().setText(this.user.seguidor.size()+"");
	}

	public void NumeroSeguidos() {
		if(this.user != null)
			this.getNumSiguiendo().setText(this.user.seguir.size()+"");
	}
	
	public void NumeroMegustas() {
		int total = 0;
		List<Publicacion> publicaciones = null;
		if(this.user != null)
			publicaciones = new ArrayList<Publicacion>(this.user.publica.getCollection());
		else
			publicaciones = new ArrayList<Publicacion>(this.comercial.publica.getCollection());

		for(Publicacion p : publicaciones) {
			total += p.getNumMeGustas();
		}
		this.getNumMeGustas().setText(total + "");
	}
}