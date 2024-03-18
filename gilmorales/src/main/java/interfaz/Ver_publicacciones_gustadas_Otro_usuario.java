package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerPublicacionesGustadasOtroUsuario;

public class Ver_publicacciones_gustadas_Otro_usuario extends VistaVerPublicacionesGustadasOtroUsuario{
	public Ver_perfil_publico _ver_perfil_publico;
	public Publicaciones_gustadas_usuario_publico _publicaciones_gustadas_usuario_publico;
	
	public Ver_publicacciones_gustadas_Otro_usuario() {
		publicaciones_gustadas_usuario_publico();
	}

	public void publicaciones_gustadas_usuario_publico() {
		_publicaciones_gustadas_usuario_publico = new Publicaciones_gustadas_usuario_publico();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_publicaciones_gustadas_usuario_publico);
	}
}