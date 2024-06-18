package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaEliminarPublicaciones;

public class Eliminar_publicaciones extends VistaEliminarPublicaciones{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_publicaciones_propias_Eliminar _lista_publicaciones_propias;
	UsuarioRegistrado user;
	public Eliminar_publicaciones() {}
	public Eliminar_publicaciones(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getCheckboxSelecionarTodas().setValue(false);
		this.getBotonCancelar().setText("Cancelar");
    	Cancelar();
    	this.user = ur;
		_lista_publicaciones_propias = new Lista_publicaciones_propias_Eliminar(ur);
    	Lista_publicaciones_propias();
	}

	public void Lista_publicaciones_propias() {
		this.getLayoutLista().as(VerticalLayout.class).add(_lista_publicaciones_propias);
		this.getCheckboxSelecionarTodas().addClickListener(event -> {
			this._lista_publicaciones_propias.Seleccionar_todas(this.getCheckboxSelecionarTodas().getValue());
			
		});
		this.getBotonEliminar().addClickListener(event ->{
			this._lista_publicaciones_propias.Eliminar_seleccion();
			this.getCheckboxSelecionarTodas().setValue(false);
			this.getBotonCancelar().setText("Atras");
		});
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.getCheckboxSelecionarTodas().setValue(false);
			this._lista_publicaciones_propias.Seleccionar_todas(this.getCheckboxSelecionarTodas().getValue());
			this.setVisible(false);
		});
	}
}