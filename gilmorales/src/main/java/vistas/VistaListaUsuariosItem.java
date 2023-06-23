package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-lista-usuarios-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-usuarios-item")
@JsModule("./src/vista-lista-usuarios-item.ts")
public class VistaListaUsuariosItem extends LitTemplate {


	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutPublicacion")
	private Element layoutPublicacion;
	@Id("labelInformacion")
	private Element labelInformacion;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelNombreCompleto")
	private Label labelNombreCompleto;
	@Id("labelDescripcion")
	private Label labelDescripcion;

	
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getLayoutPublicacion() {
		return layoutPublicacion;
	}


	public void setLayoutPublicacion(Element layoutPublicacion) {
		this.layoutPublicacion = layoutPublicacion;
	}


	public Element getLabelInformacion() {
		return labelInformacion;
	}


	public void setLabelInformacion(Element labelInformacion) {
		this.labelInformacion = labelInformacion;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public Avatar getFotoPerfil() {
		return fotoPerfil;
	}


	public void setFotoPerfil(Avatar fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}


	public Button getBotonNombreUsuario() {
		return botonNombreUsuario;
	}


	public void setBotonNombreUsuario(Button botonNombreUsuario) {
		this.botonNombreUsuario = botonNombreUsuario;
	}


	public Label getLabelNombreCompleto() {
		return labelNombreCompleto;
	}


	public void setLabelNombreCompleto(Label labelNombreCompleto) {
		this.labelNombreCompleto = labelNombreCompleto;
	}


	public Label getLabelDescripcion() {
		return labelDescripcion;
	}


	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}


	/**
     * Creates a new VistaListaUsuariosItem.
     */
    public VistaListaUsuariosItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
