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
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("listaUsuarios")
	private Element listaUsuarios;
	@Id("botonVerListaUsuarios")
	private Button botonVerListaUsuarios;
	@Id("tituloHashtag")
	private H3 tituloHashtag;
	@Id("listaTopHashtag")
	private Element listaTopHashtag;
	@Id("botonVerListaHashtag")
	private Button botonVerListaHashtag;
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutListaResultadoBusqueda")
	private Element layoutListaResultadoBusqueda;
	@Id("tituloResultadoBusqueda")
	private H2 tituloResultadoBusqueda;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("layoutTituloUsuarios")
	private HorizontalLayout layoutTituloUsuarios;
	@Id("layoutFiltrar")
	private HorizontalLayout layoutFiltrar;
	@Id("labelFiltrar")
	private Label labelFiltrar;
	@Id("vaadinSelect")
	private Select vaadinSelect;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("filtrarNone")
	private Element filtrarNone;
	@Id("filtrarUsuarios")
	private Element filtrarUsuarios;
	@Id("filtrarHashtag")
	private Element filtrarHashtag;
	@Id("layoutListaResultadoUsuarios")
	private Element layoutListaResultadoUsuarios;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutListaResultadoHashtags")
	private Element layoutListaResultadoHashtags;

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getLayoutListaResultadoBusqueda() {
		return layoutListaResultadoBusqueda;
	}


	public void setLayoutListaResultadoBusqueda(Element layoutListaResultadoBusqueda) {
		this.layoutListaResultadoBusqueda = layoutListaResultadoBusqueda;
	}


	public H2 getTituloResultadoBusqueda() {
		return tituloResultadoBusqueda;
	}


	public void setTituloResultadoBusqueda(H2 tituloResultadoBusqueda) {
		this.tituloResultadoBusqueda = tituloResultadoBusqueda;
	}


	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}


	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}


	public HorizontalLayout getLayoutTituloUsuarios() {
		return layoutTituloUsuarios;
	}


	public void setLayoutTituloUsuarios(HorizontalLayout layoutTituloUsuarios) {
		this.layoutTituloUsuarios = layoutTituloUsuarios;
	}


	public HorizontalLayout getLayoutFiltrar() {
		return layoutFiltrar;
	}


	public void setLayoutFiltrar(HorizontalLayout layoutFiltrar) {
		this.layoutFiltrar = layoutFiltrar;
	}


	public Label getLabelFiltrar() {
		return labelFiltrar;
	}


	public void setLabelFiltrar(Label labelFiltrar) {
		this.labelFiltrar = labelFiltrar;
	}


	public Select getVaadinSelect() {
		return vaadinSelect;
	}


	public void setVaadinSelect(Select vaadinSelect) {
		this.vaadinSelect = vaadinSelect;
	}


	public Element getVaadinListBox() {
		return vaadinListBox;
	}


	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}


	public Element getFiltrarNone() {
		return filtrarNone;
	}


	public void setFiltrarNone(Element filtrarNone) {
		this.filtrarNone = filtrarNone;
	}


	public Element getFiltrarUsuarios() {
		return filtrarUsuarios;
	}


	public void setFiltrarUsuarios(Element filtrarUsuarios) {
		this.filtrarUsuarios = filtrarUsuarios;
	}


	public Element getFiltrarHashtag() {
		return filtrarHashtag;
	}


	public void setFiltrarHashtag(Element filtrarHashtag) {
		this.filtrarHashtag = filtrarHashtag;
	}


	public Element getLayoutListaResultadoUsuarios() {
		return layoutListaResultadoUsuarios;
	}


	public void setLayoutListaResultadoUsuarios(Element layoutListaResultadoUsuarios) {
		this.layoutListaResultadoUsuarios = layoutListaResultadoUsuarios;
	}


	public HorizontalLayout getLayoutTituloHashtags() {
		return layoutTituloHashtags;
	}


	public void setLayoutTituloHashtags(HorizontalLayout layoutTituloHashtags) {
		this.layoutTituloHashtags = layoutTituloHashtags;
	}


	public H3 getTituloHashtags() {
		return tituloHashtags;
	}


	public void setTituloHashtags(H3 tituloHashtags) {
		this.tituloHashtags = tituloHashtags;
	}


	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}


	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}


	public Element getLayoutListaResultadoHashtags() {
		return layoutListaResultadoHashtags;
	}


	public void setLayoutListaResultadoHashtags(Element layoutListaResultadoHashtags) {
		this.layoutListaResultadoHashtags = layoutListaResultadoHashtags;
	}


	public Element getCabeceraTop() {
		return cabeceraTop;
	}


	public void setCabeceraTop(Element cabeceraTop) {
		this.cabeceraTop = cabeceraTop;
	}


	public H3 getTituloUsuarios() {
		return tituloUsuarios;
	}


	public void setTituloUsuarios(H3 tituloUsuarios) {
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


	public H3 getTituloHashtag() {
		return tituloHashtag;
	}


	public void setTituloHashtag(H3 tituloHashtag) {
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
