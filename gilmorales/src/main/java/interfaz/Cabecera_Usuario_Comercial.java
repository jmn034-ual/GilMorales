package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioComercial;

public class Cabecera_Usuario_Comercial extends Comun_Comercial_y_Usuario_Registrado {
	public Usuario_comercial _usuario_comercial;
	UsuarioComercial comercial;
	
	public Cabecera_Usuario_Comercial(Usuario_comercial comercialInterfaz, UsuarioComercial uc) {
		this._usuario_comercial = comercialInterfaz;
		this.comercial = uc;
		this.getBotonNotificaciones().setVisible(false);
		this.getBotonPerfil().setVisible(false);
		this.Add_publicacion();
	}
	
	public void Add_publicacion() {
		this.getBotonAniadir().addClickListener(event->{
			this.addPubli = new Add_publicacion(this.comercial, _usuario_comercial);
			this.getBotonAniadir().setVisible(false);
			this.getBotonPerfil().setVisible(true);
			this.getBotonNotificaciones().setVisible(true);
			if(_usuario_comercial.getVaadinHorizontalLayout().getComponentCount() != 0) {
				_usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_usuario_comercial.getVaadinHorizontalLayout().getComponentAt(0));
			}
			_usuario_comercial.getVaadinVerticalLayout1().setVisible(false);
			_usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).add(_usuario_comercial._cabecera_Usuario_Comercial.addPubli);
		});
	}
}