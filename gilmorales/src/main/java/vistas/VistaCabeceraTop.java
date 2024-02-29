package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.H4;

/**
 * A Designer generated component for the vista-cabecera-top template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera-top")
@JsModule("./src/vista-cabecera-top.ts")
public class VistaCabeceraTop extends LitTemplate {


	@Id("cabeceraTop")
	private Element cabeceraTop;
	@Id("listaUsuarios")
	private Element listaUsuarios;
	@Id("botonVerListaUsuarios")
	private Button botonVerListaUsuarios;
	@Id("tituloHashtag")
	private H4 tituloHashtag;
	@Id("listaTopHashtag")
	private Element listaTopHashtag;
	@Id("botonVerListaHashtag")
	private Button botonVerListaHashtag;
	@Id("tituloUsuarios")
	private H4 tituloUsuarios;
	
	

	public Element getCabeceraTop() {
		return cabeceraTop;
	}



	public void setCabeceraTop(Element cabeceraTop) {
		this.cabeceraTop = cabeceraTop;
	}



	public H4 getTituloUsuarios() {
		return tituloUsuarios;
	}



	public void setTituloUsuarios(H4 tituloUsuarios) {
		this.tituloUsuarios = tituloUsuarios;
	}



	public Element getListaUsuarios() {
		return listaUsuarios;
	}



	public void setListaUsuarios(Element listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}



	public Button getBotonVerListaUsuarios() {
		return botonVerListaUsuarios;
	}



	public void setBotonVerListaUsuarios(Button botonVerListaUsuarios) {
		this.botonVerListaUsuarios = botonVerListaUsuarios;
	}



	public H4 getTituloHashtag() {
		return tituloHashtag;
	}



	public void setTituloHashtag(H4 tituloHashtag) {
		this.tituloHashtag = tituloHashtag;
	}



	public Element getListaTopHashtag() {
		return listaTopHashtag;
	}



	public void setListaTopHashtag(Element listaTopHashtag) {
		this.listaTopHashtag = listaTopHashtag;
	}



	public Button getBotonVerListaHashtag() {
		return botonVerListaHashtag;
	}



	public void setBotonVerListaHashtag(Button botonVerListaHashtag) {
		this.botonVerListaHashtag = botonVerListaHashtag;
	}



	/**
     * Creates a new VistaCabeceraTop.
     */
    public VistaCabeceraTop() {
        // You can initialise any data required for the connected UI components here.
    }

}
