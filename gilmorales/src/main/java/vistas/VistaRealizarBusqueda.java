package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;

/**
 * A Designer generated component for the vista-realizar-busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-realizar-busqueda")
@JsModule("./src/vista-realizar-busqueda.ts")
public class VistaRealizarBusqueda extends LitTemplate {

    @Id("layoutListaResultadoBusqueda")
	private Element layoutListaResultadoBusqueda;
	@Id("tituloResultadoBusqueda")
	private H2 tituloResultadoBusqueda;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("layoutListaResultadoUsuarios")
	private Element layoutListaResultadoUsuarios;
	@Id("layoutTituloUsuarios")
	private HorizontalLayout layoutTituloUsuarios;
	@Id("layoutTituloHashtags")
	private HorizontalLayout layoutTituloHashtags;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutListaResultadoHashtags")
	private Element layoutListaResultadoHashtags;
	@Id("layoutFiltrar")
	private HorizontalLayout layoutFiltrar;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("tituloUsuarios")
	private H3 tituloUsuarios;
	@Id("tituloHashtags")
	private H3 tituloHashtags;
	@Id("barraHorizontal")
	private Hr barraHorizontal;
	
	

	public Hr getBarraHorizontal() {
		return barraHorizontal;
	}



	public void setBarraHorizontal(Hr barraHorizontal) {
		this.barraHorizontal = barraHorizontal;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}




	public H3 getTituloUsuarios() {
		return tituloUsuarios;
	}



	public void setTituloUsuarios(H3 tituloUsuarios) {
		this.tituloUsuarios = tituloUsuarios;
	}



	public H3 getTituloHashtags() {
		return tituloHashtags;
	}



	public void setTituloHashtags(H3 tituloHashtags) {
		this.tituloHashtags = tituloHashtags;
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



	public Element getLayoutListaResultadoUsuarios() {
		return layoutListaResultadoUsuarios;
	}



	public void setLayoutListaResultadoUsuarios(Element layoutListaResultadoUsuarios) {
		this.layoutListaResultadoUsuarios = layoutListaResultadoUsuarios;
	}



	public HorizontalLayout getLayoutTituloUsuarios() {
		return layoutTituloUsuarios;
	}



	public void setLayoutTituloUsuarios(HorizontalLayout layoutTituloUsuarios) {
		this.layoutTituloUsuarios = layoutTituloUsuarios;
	}



	public HorizontalLayout getLayoutTituloHashtags() {
		return layoutTituloHashtags;
	}



	public void setLayoutTituloHashtags(HorizontalLayout layoutTituloHashtags) {
		this.layoutTituloHashtags = layoutTituloHashtags;
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



	public HorizontalLayout getLayoutFiltrar() {
		return layoutFiltrar;
	}



	public void setLayoutFiltrar(HorizontalLayout layoutFiltrar) {
		this.layoutFiltrar = layoutFiltrar;
	}



	/**
     * Creates a new VistaRealizarBusqueda.
     */
    public VistaRealizarBusqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
