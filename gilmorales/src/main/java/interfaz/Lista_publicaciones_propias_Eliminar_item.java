package interfaz;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import vistas.VistaListaPublicacionesPropiasEliminarItem;

public class Lista_publicaciones_propias_Eliminar_item extends VistaListaPublicacionesPropiasEliminarItem{

	public Lista_publicaciones_propias_Eliminar _lista_publicaciones_propias;
	public Ver_publicacion_propia _ver_publicacion_propia;
	public Ver_publicacion_propia_Comercial verComercial;
	Publicacion publicacion;
	
	public Lista_publicaciones_propias_Eliminar_item(Publicacion publicacion, Lista_publicaciones_propias_Eliminar interfaz) {
		Video video = new Video(publicacion.getVideo());
		video.getElement().setProperty("controls", false);
		video.getElement().setProperty("autoplay", false); 
		video.getElement().getStyle().set("border-radius", "8px");
		this.publicacion = publicacion;
		this._lista_publicaciones_propias = interfaz;
		this.getLayoutVideo().as(VerticalLayout.class).add(video);
		this.getCheckboxEliminar().setValue(false);
		this.getNumVisualizaciones().setText(""+publicacion.getNumVisualizaciones());
		Ver_publicacion_propia();
	}

	public void Ver_publicacion_propia() {
		this.getLayoutPublicacion().as(VerticalLayout.class).addClickListener(event -> {
			if(this._lista_publicaciones_propias._eliminar_publicaciones._ver_perfil_propio != null) {
				this._ver_publicacion_propia = new Ver_publicacion_propia(this.publicacion, this._lista_publicaciones_propias._eliminar_publicaciones._ver_perfil_propio._cabecera_Usuario_Registrado.urInterfaz);
				this._lista_publicaciones_propias._eliminar_publicaciones._ver_perfil_propio._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().removeAll();
				this._lista_publicaciones_propias._eliminar_publicaciones._ver_perfil_propio._cabecera_Usuario_Registrado.urInterfaz.getVaadinHorizontalLayout().add(this._ver_publicacion_propia);
			}else {
				this.verComercial = new Ver_publicacion_propia_Comercial(this.publicacion, this);
				this._lista_publicaciones_propias._eliminar_publicaciones.comercialInterfaz.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
				this._lista_publicaciones_propias._eliminar_publicaciones.comercialInterfaz.getVaadinVerticalLayout1().as(VerticalLayout.class).add(this.verComercial);
			}
		});	
	}

	public Publicacion Seleccionar_publicacion() {
		return publicacion;
	}
}