package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaEliminarPublicaciones;

public class Eliminar_publicaciones extends VistaEliminarPublicaciones{
	public Ver_perfil_propio _ver_perfil_propio;
	public Lista_publicaciones_propias_Eliminar _lista_publicaciones_propias;
	UsuarioRegistrado user;
	UsuarioComercial comercial;
	Usuario_comercial comercialInterfaz;
	public Eliminar_publicaciones() {}
	public Eliminar_publicaciones(Ver_perfil_propio interfaz) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.getCheckboxSelecionarTodas().setValue(false);
    	Cancelar();
    	this._ver_perfil_propio = interfaz;
    	this.user = this._ver_perfil_propio.user;
    	Lista_publicaciones_propias(this.user);
	}

	public void Lista_publicaciones_propias(Object user) {
    	this.getLayoutLista().getStyle().set("width", "80%");
		if(user instanceof UsuarioRegistrado)
			_lista_publicaciones_propias = new Lista_publicaciones_propias_Eliminar(this.user, this);
		else {
			 this.comercialInterfaz = (Usuario_comercial) user;
			this.comercial = comercialInterfaz.comercial;
			_lista_publicaciones_propias = new Lista_publicaciones_propias_Eliminar(this.comercial, this);
		}

		this.getLayoutLista().as(VerticalLayout.class).add(_lista_publicaciones_propias);
		this.getCheckboxSelecionarTodas().addClickListener(event -> {
			this._lista_publicaciones_propias.Seleccionar_todas(this.getCheckboxSelecionarTodas().getValue());
			
		});
		this.getBotonEliminar().addClickListener(event ->{
			this._lista_publicaciones_propias.Eliminar_seleccion();
			this.getCheckboxSelecionarTodas().setValue(false);
			if(this._ver_perfil_propio != null)
				this._ver_perfil_propio._cabecera_Usuario_Registrado.getBotonPerfil().click();
			else if(this.comercialInterfaz != null) {
				this.comercialInterfaz.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				this.comercialInterfaz.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Usuario_comercial(this.comercialInterfaz.mainview, this.comercialInterfaz.comercial.getID()));
			}	
		});
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.getCheckboxSelecionarTodas().setValue(false);
			this._lista_publicaciones_propias.Seleccionar_todas(this.getCheckboxSelecionarTodas().getValue());
			this._ver_perfil_propio._cabecera_Usuario_Registrado.getBotonPerfil().click();
		});
	}
}