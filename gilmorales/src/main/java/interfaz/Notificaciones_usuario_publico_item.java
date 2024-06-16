package interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.Notificacion;
import bd_dcl.UsuarioRegistrado;

public class Notificaciones_usuario_publico_item extends Notificaciones_item {
	public Notificaciones_usuario_publico _notificaciones_usuario_publico;
	public Nuevos_seguidores _nuevos_seguidores;
	public Nuevos_seguidores nuevasMenciones;
	private List<Notificacion> notificaciones;
	private UsuarioRegistrado ur;

	public Notificaciones_usuario_publico_item(UsuarioRegistrado ur) {
		this.ur = ur;
		this.notificaciones = new ArrayList<Notificacion>(this.ur.recibe.getCollection());
		
		if(notificaciones.isEmpty()) {
			this._nuevos_seguidores = new Nuevos_seguidores();
			this._me_gustas = new Me_gustas();
			this._notificaciones_comentarios = new Notificaciones_comentarios();
			this.nuevasMenciones = new Nuevos_seguidores();
		}else {
			Nuevos_seguidores();
			this._me_gustas = new Me_gustas(this.ur);
			this.getNotificaciones().as(VerticalLayout.class).add(_me_gustas);

			this._notificaciones_comentarios = new Notificaciones_comentarios(this.ur);
			this.getNotificaciones().as(VerticalLayout.class).add(_notificaciones_comentarios);

			this.nuevasMenciones = new Nuevos_seguidores(this.ur);
			this.getNotificaciones().as(VerticalLayout.class).add(nuevasMenciones);
			
			/*Cargamos las listas de notificaciones */
			for(int i = 0; i < notificaciones.size(); i++) {
				int tipo = notificaciones.get(i).getTipoNotificacion();
				switch(tipo) {
				case 0: //Nuevos seguidores													
					_nuevos_seguidores.addNuevoSeguidor(notificaciones.get(i));
					break;
				case 1:  //Me gustas
					this._me_gustas.addNuevoMeGusta(notificaciones.get(i));
					break;
				case 2: //Comentarios
					this._notificaciones_comentarios.addNuevoComentario(notificaciones.get(i));
					break;
				case 3: //Menciones
					this.nuevasMenciones.addNuevaMencion(notificaciones.get(i));
					break;
				default:
					break;

				}
			}
		}
	}
	public void Nuevos_seguidores() {
		this._nuevos_seguidores = new Nuevos_seguidores(ur);
		this.getNotificaciones().as(VerticalLayout.class).add(_nuevos_seguidores);
	}
}