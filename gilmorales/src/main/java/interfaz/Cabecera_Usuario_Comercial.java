package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioComercial;

public class Cabecera_Usuario_Comercial extends Comun_Comercial_y_Usuario_Registrado {
	public Usuario_comercial _usuario_comercial;
	UsuarioComercial comercial;
	
	public Cabecera_Usuario_Comercial(Usuario_comercial comercialInterfaz, UsuarioComercial uc) {
		super();
		this._usuario_comercial = comercialInterfaz;
		this.comercial = uc;
		this.getBotonNotificaciones().setVisible(false);
		this.getBarraBusqueda().setVisible(false);
		this.Add_publicacion();
		Inicio();
		Cerrar_sesion(this);
	}
	
	public void Inicio() {
		this.getBotonPerfil().addClickListener(event ->{
			this._usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this._usuario_comercial.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Usuario_comercial(this._usuario_comercial.mainview, this._usuario_comercial.comercial.getID()));
		});
	}
	
	public void Add_publicacion() {
		this.addPubli = new Add_publicacion(this.comercial, _usuario_comercial);
		this.getBotonAniadir().addClickListener(event->{
			this._usuario_comercial.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
			this._usuario_comercial.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this.addPubli);
		});
	}
}