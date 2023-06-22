package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminarPublicaciones;

public class Eliminar_publicaciones extends VistaEliminarPublicaciones{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_publicaciones_propias__Eliminar_ _lista_publicaciones_propias = new Lista_publicaciones_propias__Eliminar_();

	public Eliminar_publicaciones() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	Cancelar();
    	Lista_publicaciones_propias();
	}

	public void Lista_publicaciones_propias() {
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_publicaciones_propias);
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.setVisible(false);
		});
	}
}