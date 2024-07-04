package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-lista-resultado-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-resultado-item")
@JsModule("./src/vista-lista-resultado-item.ts")
public class VistaListaResultadoItem extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutFotoPerfil")
	private Element layoutFotoPerfil;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("layoutFotoHashtag")
	private Element layoutFotoHashtag;
	@Id("botonHashtag")
	private Button botonHashtag;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	
	

	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}



	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Element getLayoutFotoPerfil() {
		return layoutFotoPerfil;
	}



	public void setLayoutFotoPerfil(Element layoutFotoPerfil) {
		this.layoutFotoPerfil = layoutFotoPerfil;
	}



	public Button getBotonNombreUsuario() {
		return botonNombreUsuario;
	}



	public void setBotonNombreUsuario(Button botonNombreUsuario) {
		this.botonNombreUsuario = botonNombreUsuario;
	}



	public Button getBotonSeguir() {
		return botonSeguir;
	}



	public void setBotonSeguir(Button botonSeguir) {
		this.botonSeguir = botonSeguir;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public Element getLayoutFotoHashtag() {
		return layoutFotoHashtag;
	}



	public void setLayoutFotoHashtag(Element layoutFotoHashtag) {
		this.layoutFotoHashtag = layoutFotoHashtag;
	}



	public Button getBotonHashtag() {
		return botonHashtag;
	}



	public void setBotonHashtag(Button botonHashtag) {
		this.botonHashtag = botonHashtag;
	}



	/**
     * Creates a new VistaListaResultadoItem.
     */
    public VistaListaResultadoItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
