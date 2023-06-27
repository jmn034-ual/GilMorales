package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-ver-comentarios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-comentarios")
@JsModule("./src/vista-ver-comentarios.ts")
public class VistaVerComentarios extends LitTemplate {

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutInfo")
	private Element layoutInfo;
	@Id("layoutpropietario")
	private HorizontalLayout layoutpropietario;
	@Id("layoutFotoPerfil")
	private Element layoutFotoPerfil;
	@Id("fotoPerfil")
	private Avatar fotoPerfil;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelGeolocalizacion")
	private Label labelGeolocalizacion;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutEstadisticas")
	private Element layoutEstadisticas;
	@Id("layoutMeGustas")
	private HorizontalLayout layoutMeGustas;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("botonMeGusta")
	private Button botonMeGusta;
	@Id("labelNumMeGustas")
	private Label labelNumMeGustas;
	@Id("layoutNumComentarios")
	private HorizontalLayout layoutNumComentarios;
	@Id("numComentarios")
	private Label numComentarios;
	@Id("labelComentarios")
	private Label labelComentarios;
	@Id("layoutVisualizaciones")
	private HorizontalLayout layoutVisualizaciones;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("labelVisualizaciones")
	private Label labelVisualizaciones;
	@Id("layoutSeguidores")
	private Element layoutSeguidores;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("numSeguidores")
	private Label numSeguidores;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("botonEliminarAdmi")
	private Button botonEliminarAdmi;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("layoutListaComentarios")
	private Element layoutListaComentarios;
	@Id("layoutComentar")
	private HorizontalLayout layoutComentar;
	@Id("textFieldCmentario")
	private TextField textFieldCmentario;
	@Id("botonComentar")
	private Button botonComentar;

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}


	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Element getLayoutInfo() {
		return layoutInfo;
	}


	public void setLayoutInfo(Element layoutInfo) {
		this.layoutInfo = layoutInfo;
	}


	public HorizontalLayout getLayoutpropietario() {
		return layoutpropietario;
	}


	public void setLayoutpropietario(HorizontalLayout layoutpropietario) {
		this.layoutpropietario = layoutpropietario;
	}


	public Element getLayoutFotoPerfil() {
		return layoutFotoPerfil;
	}


	public void setLayoutFotoPerfil(Element layoutFotoPerfil) {
		this.layoutFotoPerfil = layoutFotoPerfil;
	}


	public Avatar getFotoPerfil() {
		return fotoPerfil;
	}


	public void setFotoPerfil(Avatar fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}


	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}


	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}


	public Button getBotonNombreUsuario() {
		return botonNombreUsuario;
	}


	public void setBotonNombreUsuario(Button botonNombreUsuario) {
		this.botonNombreUsuario = botonNombreUsuario;
	}


	public Label getLabelGeolocalizacion() {
		return labelGeolocalizacion;
	}


	public void setLabelGeolocalizacion(Label labelGeolocalizacion) {
		this.labelGeolocalizacion = labelGeolocalizacion;
	}


	public Label getLabelDescripcion() {
		return labelDescripcion;
	}


	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}


	public Element getLayoutEstadisticas() {
		return layoutEstadisticas;
	}


	public void setLayoutEstadisticas(Element layoutEstadisticas) {
		this.layoutEstadisticas = layoutEstadisticas;
	}


	public HorizontalLayout getLayoutMeGustas() {
		return layoutMeGustas;
	}


	public void setLayoutMeGustas(HorizontalLayout layoutMeGustas) {
		this.layoutMeGustas = layoutMeGustas;
	}


	public Label getNumMeGustas() {
		return numMeGustas;
	}


	public void setNumMeGustas(Label numMeGustas) {
		this.numMeGustas = numMeGustas;
	}


	public Button getBotonMeGusta() {
		return botonMeGusta;
	}


	public void setBotonMeGusta(Button botonMeGusta) {
		this.botonMeGusta = botonMeGusta;
	}


	public Label getLabelNumMeGustas() {
		return labelNumMeGustas;
	}


	public void setLabelNumMeGustas(Label labelNumMeGustas) {
		this.labelNumMeGustas = labelNumMeGustas;
	}


	public HorizontalLayout getLayoutNumComentarios() {
		return layoutNumComentarios;
	}


	public void setLayoutNumComentarios(HorizontalLayout layoutNumComentarios) {
		this.layoutNumComentarios = layoutNumComentarios;
	}


	public Label getNumComentarios() {
		return numComentarios;
	}


	public void setNumComentarios(Label numComentarios) {
		this.numComentarios = numComentarios;
	}


	public Label getLabelComentarios() {
		return labelComentarios;
	}


	public void setLabelComentarios(Label labelComentarios) {
		this.labelComentarios = labelComentarios;
	}


	public HorizontalLayout getLayoutVisualizaciones() {
		return layoutVisualizaciones;
	}


	public void setLayoutVisualizaciones(HorizontalLayout layoutVisualizaciones) {
		this.layoutVisualizaciones = layoutVisualizaciones;
	}


	public Label getNumVisualizaciones() {
		return numVisualizaciones;
	}


	public void setNumVisualizaciones(Label numVisualizaciones) {
		this.numVisualizaciones = numVisualizaciones;
	}


	public Label getLabelVisualizaciones() {
		return labelVisualizaciones;
	}


	public void setLabelVisualizaciones(Label labelVisualizaciones) {
		this.labelVisualizaciones = labelVisualizaciones;
	}


	public Element getLayoutSeguidores() {
		return layoutSeguidores;
	}


	public void setLayoutSeguidores(Element layoutSeguidores) {
		this.layoutSeguidores = layoutSeguidores;
	}


	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}


	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}


	public Label getNumSeguidores() {
		return numSeguidores;
	}


	public void setNumSeguidores(Label numSeguidores) {
		this.numSeguidores = numSeguidores;
	}


	public Label getLabelSeguidores() {
		return labelSeguidores;
	}


	public void setLabelSeguidores(Label labelSeguidores) {
		this.labelSeguidores = labelSeguidores;
	}


	public Button getBotonSeguir() {
		return botonSeguir;
	}


	public void setBotonSeguir(Button botonSeguir) {
		this.botonSeguir = botonSeguir;
	}


	public Button getBotonEliminarAdmi() {
		return botonEliminarAdmi;
	}


	public void setBotonEliminarAdmi(Button botonEliminarAdmi) {
		this.botonEliminarAdmi = botonEliminarAdmi;
	}


	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}


	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}


	public Element getLayoutListaComentarios() {
		return layoutListaComentarios;
	}


	public void setLayoutListaComentarios(Element layoutListaComentarios) {
		this.layoutListaComentarios = layoutListaComentarios;
	}


	public HorizontalLayout getLayoutComentar() {
		return layoutComentar;
	}


	public void setLayoutComentar(HorizontalLayout layoutComentar) {
		this.layoutComentar = layoutComentar;
	}


	public TextField getTextFieldCmentario() {
		return textFieldCmentario;
	}


	public void setTextFieldCmentario(TextField textFieldCmentario) {
		this.textFieldCmentario = textFieldCmentario;
	}


	public Button getBotonComentar() {
		return botonComentar;
	}


	public void setBotonComentar(Button botonComentar) {
		this.botonComentar = botonComentar;
	}
	


	/**
     * Creates a new VistaVerComentarios.
     */
    public VistaVerComentarios() {
        // You can initialise any data required for the connected UI components here.
    }

}
