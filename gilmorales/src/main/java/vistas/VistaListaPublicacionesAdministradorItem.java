package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-lista-publicaciones-administrador-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-publicaciones-administrador-item")
@JsModule("./src/vista-lista-publicaciones-administrador-item.ts")
public class VistaListaPublicacionesAdministradorItem extends LitTemplate {

  


	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("layoutVideoPublicacion")
	private Element layoutVideoPublicacion;
	@Id("botonNombreUsuario")
	private Button botonNombreUsuario;
	@Id("labelGeolocalizacion")
	private Label labelGeolocalizacion;
	@Id("numVisualizaciones")
	private Label numVisualizaciones;
	@Id("layoutVideo")
	private Element layoutVideo;
	@Id("layoutDatos")
	private Element layoutDatos;
	@Id("layoutBotonesUsuarioR")
	private HorizontalLayout layoutBotonesUsuarioR;
	@Id("layoutBotonesPublicacion")
	private HorizontalLayout layoutBotonesPublicacion;
	@Id("layoutMeGustas")
	private Element layoutMeGustas;
	@Id("labelNumMeGustas")
	private Label labelNumMeGustas;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("layoutComentarios")
	private Element layoutComentarios;
	@Id("labelNumComentarios")
	private Label labelNumComentarios;
	@Id("botonVerComentarios")
	private Button botonVerComentarios;
	@Id("botonEliminar")
	private Button botonEliminar;
	@Id("fotoPerfil")
	private Element fotoPerfil;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	
	
	public Button getBotonEliminar() {
		return botonEliminar;
	}



	public void setBotonEliminar(Button botonEliminar) {
		this.botonEliminar = botonEliminar;
	}



	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public HorizontalLayout getVaadinHorizontalLayout3() {
		return vaadinHorizontalLayout3;
	}



	public void setVaadinHorizontalLayout3(HorizontalLayout vaadinHorizontalLayout3) {
		this.vaadinHorizontalLayout3 = vaadinHorizontalLayout3;
	}



	public Element getLayoutVideoPublicacion() {
		return layoutVideoPublicacion;
	}



	public void setLayoutVideoPublicacion(Element layoutVideoPublicacion) {
		this.layoutVideoPublicacion = layoutVideoPublicacion;
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



	public Label getNumVisualizaciones() {
		return numVisualizaciones;
	}



	public void setNumVisualizaciones(Label numVisualizaciones) {
		this.numVisualizaciones = numVisualizaciones;
	}



	public Element getLayoutVideo() {
		return layoutVideo;
	}



	public void setLayoutVideo(Element layoutVideo) {
		this.layoutVideo = layoutVideo;
	}



	public Element getLayoutDatos() {
		return layoutDatos;
	}



	public void setLayoutDatos(Element layoutDatos) {
		this.layoutDatos = layoutDatos;
	}



	public HorizontalLayout getLayoutBotonesUsuarioR() {
		return layoutBotonesUsuarioR;
	}



	public void setLayoutBotonesUsuarioR(HorizontalLayout layoutBotonesUsuarioR) {
		this.layoutBotonesUsuarioR = layoutBotonesUsuarioR;
	}

	public HorizontalLayout getLayoutBotonesPublicacion() {
		return layoutBotonesPublicacion;
	}



	public Element getFotoPerfil() {
		return fotoPerfil;
	}



	public void setFotoPerfil(Element fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}



	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}



	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}



	public void setLayoutBotonesPublicacion(HorizontalLayout layoutBotonesPublicacion) {
		this.layoutBotonesPublicacion = layoutBotonesPublicacion;
	}



	public Element getLayoutMeGustas() {
		return layoutMeGustas;
	}



	public void setLayoutMeGustas(Element layoutMeGustas) {
		this.layoutMeGustas = layoutMeGustas;
	}



	public Label getLabelNumMeGustas() {
		return labelNumMeGustas;
	}



	public void setLabelNumMeGustas(Label labelNumMeGustas) {
		this.labelNumMeGustas = labelNumMeGustas;
	}



	public Label getLabelMeGustas() {
		return labelMeGustas;
	}



	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}



	public Element getLayoutComentarios() {
		return layoutComentarios;
	}



	public void setLayoutComentarios(Element layoutComentarios) {
		this.layoutComentarios = layoutComentarios;
	}



	public Label getLabelNumComentarios() {
		return labelNumComentarios;
	}



	public void setLabelNumComentarios(Label labelNumComentarios) {
		this.labelNumComentarios = labelNumComentarios;
	}



	public Button getBotonVerComentarios() {
		return botonVerComentarios;
	}



	public void setBotonVerComentarios(Button botonVerComentarios) {
		this.botonVerComentarios = botonVerComentarios;
	}

	/**
     * Creates a new VistaListaPublicacionesAdministradorItem.
     */
    public VistaListaPublicacionesAdministradorItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
