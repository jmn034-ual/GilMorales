package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_publico_item extends Notificaciones_item {
	public Nuevos_seguidores _nuevos_seguidores;

	public Notificaciones_usuario_publico_item(UsuarioRegistrado ur, Notificaciones_usuario_publico interfaz) {
		super(ur, interfaz);
		Nuevos_seguidores();
	}
	public void Nuevos_seguidores() {
		this._nuevos_seguidores = new Nuevos_seguidores(user, this);
		this.getVaadinHorizontalLayout().add(this._nuevos_seguidores);
	}
}