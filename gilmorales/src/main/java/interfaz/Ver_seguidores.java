package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerSeguidores;

public class Ver_seguidores extends VistaVerSeguidores{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_de_seguidores _lista_de_seguidores ;
	
	public Ver_seguidores(UsuarioRegistrado ur, Ver_perfil_propio interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_perfil_propio = interfaz;
		BotonCerrar();
		Lista_de_seguidores();
	}

	public void Lista_de_seguidores() {
		this._lista_de_seguidores = new Lista_de_seguidores(this);
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_de_seguidores);
	}
	
	public void BotonCerrar() {
		this.getBotonCerrar().addClickListener(event->{
			this.setVisible(false);
		});
	}
}