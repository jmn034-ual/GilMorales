package interfaz;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaNuevosSeguirdoresItem;

public class Nuevos_seguidores_item extends VistaNuevosSeguirdoresItem{

	public Nuevos_seguidores _nuevos_seguidores;
	UsuarioRegistrado nuevoSeguidor;
	UsuarioRegistrado usuario;
	iUsuario_Registrado bd = new BDPrincipal();

	public Nuevos_seguidores_item() {
		this.getPrivado().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getBotonDejarDeSeguir().setVisible(false);
		this.getBotonEnviarSolicitud().setVisible(false);
		this.getFotoPerfil().setVisible(false);
		this.getNuevoSeguidor().add(new Label("No tienes notificaciones"));
	}
	public Nuevos_seguidores_item(UsuarioRegistrado usuario, UsuarioRegistrado nuevoSeguidor) {
		this.nuevoSeguidor = nuevoSeguidor;
		this.usuario = usuario;
		Avatar avatar = new Avatar();
		avatar.setImage(nuevoSeguidor.getFoto());
		Button boton = new Button(nuevoSeguidor.getNombreUsuario());
		this.getFotoPerfil().add(avatar);
		this.getFotoPerfil().add(boton);
		Seguir();
		Enviar_peticion_amistad();
		Dejar_de_seguir();
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event ->{
			this.bd.seguirUsuario( this.usuario.getID(), this.nuevoSeguidor.getID());
		});
	}

	public void Enviar_peticion_amistad() {
		this.getBotonEnviarSolicitud().addClickListener(event ->{
			
		});
	}

	public void Dejar_de_seguir() {
		this.getBotonDejarDeSeguir().addClickListener(event ->{
			this.bd.dejarSeguirUsuario( this.usuario.getID(), this.nuevoSeguidor.getID());
		});
	}
}