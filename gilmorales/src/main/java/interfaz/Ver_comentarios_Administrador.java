package interfaz;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;

public class Ver_comentarios_Administrador extends Ver_comentarios{

	public Lista_Publicaciones_Administrador_item _lista_Publicaciones__Administrador_;
	public Ver_publicacion_Administrador _ver_publicacion__Administrador_;
	public Lista_comentarios_Administrador _lista_comentarios__Administrador_;
	BDPrincipal bd = new BDPrincipal();
	
	public Ver_comentarios_Administrador(Publicacion publicacion, Object interfaz) {
		super(publicacion);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		if(interfaz instanceof Lista_Publicaciones_Administrador_item) {
			this._lista_Publicaciones__Administrador_ = (Lista_Publicaciones_Administrador_item) interfaz;
		}else {
			this._ver_publicacion__Administrador_ = (Ver_publicacion_Administrador) interfaz;
		}
		this.getBotonComentar().setVisible(false);
		this.getBotonEliminarAdmi().setVisible(true);
		this.getBotonMeGusta().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getLayoutComentar().setVisible(false);
		Lista_comentarios__Administrador_();
		EliminarPublicacio();
		Ver_perfil(this);
	} 

	public void Lista_comentarios__Administrador_() {
		_lista_comentarios__Administrador_ = new Lista_comentarios_Administrador(this.publicacion, this);
		this.getLayoutListaComentarios().as(VerticalLayout.class).add(_lista_comentarios__Administrador_);
	}

	public void EliminarPublicacio() {
		this.getBotonEliminarAdmi().addClickListener(event -> {		
			if(this._lista_Publicaciones__Administrador_ != null) {
				this._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._iAdministrador.eliminarPublicacion(this.publicacion.getIdPublicacion());
				this._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._cabecera_Administrador.getInicio().click();
			}else if(this._ver_publicacion__Administrador_ != null){
				if(this._ver_publicacion__Administrador_._lista_Publicaciones__Administrador_ != null) {
					this._ver_publicacion__Administrador_._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._iAdministrador.eliminarPublicacion(this.publicacion.getIdPublicacion());
					this._ver_publicacion__Administrador_._lista_Publicaciones__Administrador_._lista_Publicaciones__Administrador_._administrador._cabecera_Administrador.getInicio().click();
				}else if(this._ver_publicacion__Administrador_._lista_publicaciones_gustadas != null) {
					this.getVaadinHorizontalLayout().removeAll();
					this.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador( this._ver_publicacion__Administrador_.admin._cabecera_Administrador.cabeceraTOP,
							this.publicacion.getPerteneceA()));
					this.bd.eliminarPublicacion(this.publicacion.getIdPublicacion());
				}else {
					this.getVaadinHorizontalLayout().removeAll();
					this.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(this._ver_publicacion__Administrador_.admin._cabecera_Administrador.cabeceraTOP, this.publicacion.getPerteneceA()));
					this.bd.eliminarPublicacion(this.publicacion.getIdPublicacion());
				}
			}
		});
	}
}