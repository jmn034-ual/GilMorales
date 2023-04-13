package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-ver-denuncias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-denuncias")
@JsModule("./src/vista-ver-denuncias.ts")
public class VistaVerDenuncias extends LitTemplate {

    @Id("layoutCabecera")
	private HorizontalLayout layoutCabecera;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("denunciasL")
	private H1 denunciasL;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("filtrarL")
	private Label filtrarL;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("filtro")
	private Select filtro;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("todas")
	private Element todas;
	@Id("pendientes")
	private Element pendientes;
	@Id("aplicadas")
	private Element aplicadas;
	@Id("finalizadas")
	private Element finalizadas;
	@Id("layoutListaDenuncias")
	private Element layoutListaDenuncias;
	
	

	public HorizontalLayout getLayoutCabecera() {
		return layoutCabecera;
	}



	public void setLayoutCabecera(HorizontalLayout layoutCabecera) {
		this.layoutCabecera = layoutCabecera;
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



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public H1 getDenunciasL() {
		return denunciasL;
	}



	public void setDenunciasL(H1 denunciasL) {
		this.denunciasL = denunciasL;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public Label getFiltrarL() {
		return filtrarL;
	}



	public void setFiltrarL(Label filtrarL) {
		this.filtrarL = filtrarL;
	}



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Select getFiltro() {
		return filtro;
	}



	public void setFiltro(Select filtro) {
		this.filtro = filtro;
	}



	public Element getVaadinListBox() {
		return vaadinListBox;
	}



	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}



	public Element getTodas() {
		return todas;
	}



	public void setTodas(Element todas) {
		this.todas = todas;
	}



	public Element getPendientes() {
		return pendientes;
	}



	public void setPendientes(Element pendientes) {
		this.pendientes = pendientes;
	}



	public Element getAplicadas() {
		return aplicadas;
	}



	public void setAplicadas(Element aplicadas) {
		this.aplicadas = aplicadas;
	}



	public Element getFinalizadas() {
		return finalizadas;
	}



	public void setFinalizadas(Element finalizadas) {
		this.finalizadas = finalizadas;
	}



	public Element getLayoutListaDenuncias() {
		return layoutListaDenuncias;
	}



	public void setLayoutListaDenuncias(Element layoutListaDenuncias) {
		this.layoutListaDenuncias = layoutListaDenuncias;
	}



	/**
     * Creates a new VistaVerDenuncias.
     */
    public VistaVerDenuncias() {
        // You can initialise any data required for the connected UI components here.
    }

}
