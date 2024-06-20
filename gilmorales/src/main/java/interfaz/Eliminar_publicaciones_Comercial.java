package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioRegistrado;

public class Eliminar_publicaciones_Comercial extends Eliminar_publicaciones {
	
	public Usuario_comercial _usuario_comercial;
	
	public Eliminar_publicaciones_Comercial(Usuario_comercial interfaz) {
		this._usuario_comercial = interfaz;
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getCheckboxSelecionarTodas().setValue(false);
		this.getBotonCancelar().setText("Cancelar");
		_lista_publicaciones_propias = new Lista_publicaciones_propias_Eliminar(this._usuario_comercial);
    	Lista_publicaciones_propias();
    	Cancelar();
    	this.getBotonCancelar().addClickListener(event -> {
    		this._usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
    		this._usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Usuario_comercial(this._usuario_comercial.mainview, this._usuario_comercial.comercial.getID()));
    	});
	}
	
	
}