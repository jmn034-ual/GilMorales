package interfaz;

import java.util.ArrayList;

import com.vaadin.flow.component.notification.Notification;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import basededatos.iVer_perfil_privado;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;

public class Ver_perfil_privado extends Ver_Perfil__2 {

	public iVer_perfil_privado _iVer_perfil_privado;
	UsuarioRegistrado userAver;
	BDPrincipal bd = new BDPrincipal();
	boolean click = false;

	public Ver_perfil_privado(UsuarioRegistrado userAver, Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.userAver = userAver;
		this.getBotonSeguir().setVisible(false);
		this.getBotonEditarPerfil().setVisible(false);
		this.getBotonEliminarPublicacion().setVisible(false);
		this.getBotonModificarPerfil().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(true);
		this.getLabelUsuarioPrivado().setVisible(true);
		if (cabecera_TOP._cabecera_Usuario_No_Registrado != null) {
			this.getVaadinVerticalLayout3().setVisible(false);
			this.getBotonPeticionAmistad().setVisible(false);
		} else if (cabecera_TOP._cabecera_Usuario_Registrado != null)
			this.getBotonBloquear().setVisible(false);
		this.getListaMeGustas().setVisible(false);
		this.getNombreUsuario().setText(this.userAver.getNombreUsuario());
		this.getNombreYapellidos().setText(this.userAver.getNombre() + " " + this.userAver.getApellidos());
		NumeroSeguidores();
		NumeroSeguidos();
		NumeroMeGusta();
		Enviar_peticion_amistad();
	}

	public void Enviar_peticion_amistad() {
		this.getBotonPeticionAmistad().addClickListener(event -> {
			click = !click;
			if (click) {
				this.bd.enviarSolicitud(this.user.getID(), this.userAver.getID());
				this.getBotonPeticionAmistad().setText("Petición envida");
				Notification.show("Petición de amistad enviada.");
			} else
				this.getBotonPeticionAmistad().setText("Enviar petición de amistad");

		});

	}

	public void NumeroSeguidores() {
		if (this.userAver.seguidor.size() > 0)
			this.getNumSeguidores().setText(this.userAver.seguidor.size() + "");
	}

	public void NumeroSeguidos() {
		if (this.userAver.seguir.size() > 0)
			this.getNumSiguiendo().setText(this.userAver.seguir.size() + "");
	}

	public void NumeroMeGusta() {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>(this.userAver.publica.getCollection());
		int numMeGustas = 0;
		if (publicaciones.size() > 0) {
			for (Publicacion p : publicaciones) {
				numMeGustas += p.getNumMeGustas();
			}
			this.getNumMeGustas().setText(numMeGustas + "");
		}
	}
}