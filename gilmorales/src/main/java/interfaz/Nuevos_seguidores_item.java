package interfaz;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaNuevosSeguirdoresItem;

public class Nuevos_seguidores_item extends VistaNuevosSeguirdoresItem{

	public Nuevos_seguidores _nuevos_seguidores;
	
	public Nuevos_seguidores_item() {
		this.getPrivado().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getBotonDejarDeSeguir().setVisible(false);
		this.getBotonEnviarSolicitud().setVisible(false);
		this.getFotoPerfil().setVisible(false);
		this.getNuevoSeguidor().add(new Label("No tienes notificaciones"));
	}
	public Nuevos_seguidores_item(UsuarioRegistrado ur) {
		Avatar avatar = new Avatar();
		avatar.setImage(ur.getFoto());
		Button boton = new Button(ur.getNombreUsuario());
		this.getFotoPerfil().add(avatar);
		this.getFotoPerfil().add(boton);
	}

	public void Seguir() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_peticion_amistad() {
		throw new UnsupportedOperationException();
	}

	public void Dejar_de_seguir() {
		throw new UnsupportedOperationException();
	}
}