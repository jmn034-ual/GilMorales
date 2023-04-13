package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-gestionar-denuncias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionar-denuncias")
@JsModule("./src/vista-gestionar-denuncias.ts")
public class VistaGestionarDenuncias extends LitTemplate {

   

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("datos")
	private H1 datos;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("nombre")
	private Label nombre;
	@Id("vaadinHorizontalLayout4")
	private HorizontalLayout vaadinHorizontalLayout4;
	@Id("fecha")
	private Label fecha;
	@Id("vaadinHorizontalLayout5")
	private HorizontalLayout vaadinHorizontalLayout5;
	@Id("código")
	private Label código;
	@Id("vaadinHorizontalLayout6")
	private HorizontalLayout vaadinHorizontalLayout6;
	@Id("verDenuncias")
	private Button verDenuncias;
	@Id("fotoUsuario")
	private Avatar fotoUsuario;
	@Id("addFoto")
	private Button addFoto;
	



	public Avatar getFotoUsuario() {
		return fotoUsuario;
	}



	public void setFotoUsuario(Avatar fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public H1 getDatos() {
		return datos;
	}



	public void setDatos(H1 datos) {
		this.datos = datos;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}



	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}



	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}



	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}



	public Button getAddFoto() {
		return addFoto;
	}



	public void setAddFoto(Button addFoto) {
		this.addFoto = addFoto;
	}



	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}



	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public Label getNombre() {
		return nombre;
	}



	public void setNombre(Label nombre) {
		this.nombre = nombre;
	}



	public HorizontalLayout getVaadinHorizontalLayout4() {
		return vaadinHorizontalLayout4;
	}



	public void setVaadinHorizontalLayout4(HorizontalLayout vaadinHorizontalLayout4) {
		this.vaadinHorizontalLayout4 = vaadinHorizontalLayout4;
	}



	public Label getFecha() {
		return fecha;
	}



	public void setFecha(Label fecha) {
		this.fecha = fecha;
	}



	public HorizontalLayout getVaadinHorizontalLayout5() {
		return vaadinHorizontalLayout5;
	}



	public void setVaadinHorizontalLayout5(HorizontalLayout vaadinHorizontalLayout5) {
		this.vaadinHorizontalLayout5 = vaadinHorizontalLayout5;
	}



	public Label getCódigo() {
		return código;
	}



	public void setCódigo(Label código) {
		this.código = código;
	}



	public HorizontalLayout getVaadinHorizontalLayout6() {
		return vaadinHorizontalLayout6;
	}



	public void setVaadinHorizontalLayout6(HorizontalLayout vaadinHorizontalLayout6) {
		this.vaadinHorizontalLayout6 = vaadinHorizontalLayout6;
	}



	public Button getVerDenuncias() {
		return verDenuncias;
	}



	public void setVerDenuncias(Button verDenuncias) {
		this.verDenuncias = verDenuncias;
	}



	/**
     * Creates a new VistaGestionarDenuncias.
     */
    public VistaGestionarDenuncias() {
        // You can initialise any data required for the connected UI components here.
    }

}
