package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Hr;

/**
 * A Designer generated component for the vista-ver-tendencias template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-tendencias")
@JsModule("./src/vista-ver-tendencias.ts")
public class VistaVerTendencias extends LitTemplate {

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("layoutTendencias")
	private Element layoutTendencias;
	@Id("tituloTendencias")
	private H4 tituloTendencias;
	@Id("layoutHashtags")
	private Element layoutHashtags;
	@Id("botonVerListaHashtags")
	private Button botonVerListaHashtags;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("fotoPerfil")
	private Element fotoPerfil;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("nombreUsuario")
	private H3 nombreUsuario;
	@Id("nombreYapellidos")
	private H4 nombreYapellidos;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("botonEditarPerfil")
	private Button botonEditarPerfil;
	@Id("botonPeticionAmistad")
	private Button botonPeticionAmistad;
	@Id("vaadinVerticalLayout3")
	private Element vaadinVerticalLayout3;
	@Id("botonDenunciar")
	private Button botonDenunciar;
	@Id("botonModificarPerfil")
	private Button botonModificarPerfil;
	@Id("botonEliminarPublicacion")
	private Button botonEliminarPublicacion;
	@Id("layoutDatosPerfil")
	private HorizontalLayout layoutDatosPerfil;
	@Id("numSiguiendo")
	private Label numSiguiendo;
	@Id("labelSiguiendo")
	private Label labelSiguiendo;
	@Id("numSeguidores")
	private Label numSeguidores;
	@Id("labelSeguidores")
	private Label labelSeguidores;
	@Id("numMeGustas")
	private Label numMeGustas;
	@Id("labelMeGustas")
	private Label labelMeGustas;
	@Id("layoutDescripcion")
	private HorizontalLayout layoutDescripcion;
	@Id("labelDescripcion")
	private Label labelDescripcion;
	@Id("layoutBonoes")
	private HorizontalLayout layoutBonoes;
	@Id("botonVideos")
	private Button botonVideos;
	@Id("botonMeGustas")
	private Button botonMeGustas;
	@Id("layoutListaPublicaciones")
	private Element layoutListaPublicaciones;
	@Id("labelUsuarioPrivado")
	private Label labelUsuarioPrivado;
	@Id("verSeguidores")
	private Button verSeguidores;
	@Id("verSiguiendos")
	private Button verSiguiendos;
	@Id("fotoPerfil1")
	private Avatar fotoPerfil1;
	@Id("listaMeGustas")
	private Element listaMeGustas;
	@Id("botonBloquear")
	private Button botonBloquear;
	@Id("barraHorizontal")
	private Hr barraHorizontal;
	

	public Hr getBarraHorizontal() {
		return barraHorizontal;
	}



	public void setBarraHorizontal(Hr barraHorizontal) {
		this.barraHorizontal = barraHorizontal;
	}



	public Button getBotonBloquear() {
		return botonBloquear;
	}



	public void setBotonBloquear(Button botonBloquear) {
		this.botonBloquear = botonBloquear;
	}



	public Element getListaMeGustas() {
		return listaMeGustas;
	}



	public void setListaMeGustas(Element listaMeGustas) {
		this.listaMeGustas = listaMeGustas;
	}



	public Avatar getFotoPerfil1() {
		return fotoPerfil1;
	}



	public void setFotoPerfil1(Avatar fotoPerfil1) {
		this.fotoPerfil1 = fotoPerfil1;
	}



	public Button getVerSeguidores() {
		return verSeguidores;
	}



	public void setVerSeguidores(Button verSeguidores) {
		this.verSeguidores = verSeguidores;
	}



	public Button getVerSiguiendos() {
		return verSiguiendos;
	}



	public void setVerSiguiendos(Button verSiguiendos) {
		this.verSiguiendos = verSiguiendos;
	}


	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Element getLayoutTendencias() {
		return layoutTendencias;
	}



	public void setLayoutTendencias(Element layoutTendencias) {
		this.layoutTendencias = layoutTendencias;
	}



	public H4 getTituloTendencias() {
		return tituloTendencias;
	}



	public void setTituloTendencias(H4 tituloTendencias) {
		this.tituloTendencias = tituloTendencias;
	}



	public Element getLayoutHashtags() {
		return layoutHashtags;
	}



	public void setLayoutHashtags(Element layoutHashtags) {
		this.layoutHashtags = layoutHashtags;
	}



	public Button getBotonVerListaHashtags() {
		return botonVerListaHashtags;
	}



	public void setBotonVerListaHashtags(Button botonVerListaHashtags) {
		this.botonVerListaHashtags = botonVerListaHashtags;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}



	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}



	public Element getFotoPerfil() {
		return fotoPerfil;
	}



	public void setFotoPerfil(Element fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}



	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}



	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
	}



	public H3 getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(H3 nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public H4 getNombreYapellidos() {
		return nombreYapellidos;
	}



	public void setNombreYapellidos(H4 nombreYapellidos) {
		this.nombreYapellidos = nombreYapellidos;
	}



	public Button getBotonSeguir() {
		return botonSeguir;
	}



	public void setBotonSeguir(Button botonSeguir) {
		this.botonSeguir = botonSeguir;
	}



	public Button getBotonEditarPerfil() {
		return botonEditarPerfil;
	}



	public void setBotonEditarPerfil(Button botonEditarPerfil) {
		this.botonEditarPerfil = botonEditarPerfil;
	}



	public Button getBotonPeticionAmistad() {
		return botonPeticionAmistad;
	}



	public void setBotonPeticionAmistad(Button botonPeticionAmistad) {
		this.botonPeticionAmistad = botonPeticionAmistad;
	}



	public Element getVaadinVerticalLayout3() {
		return vaadinVerticalLayout3;
	}



	public void setVaadinVerticalLayout3(Element vaadinVerticalLayout3) {
		this.vaadinVerticalLayout3 = vaadinVerticalLayout3;
	}



	public Button getBotonDenunciar() {
		return botonDenunciar;
	}



	public void setBotonDenunciar(Button botonDenunciar) {
		this.botonDenunciar = botonDenunciar;
	}



	public Button getBotonModificarPerfil() {
		return botonModificarPerfil;
	}



	public void setBotonModificarPerfil(Button botonModificarPerfil) {
		this.botonModificarPerfil = botonModificarPerfil;
	}



	public Button getBotonEliminarPublicacion() {
		return botonEliminarPublicacion;
	}



	public void setBotonEliminarPublicacion(Button botonEliminarPublicacion) {
		this.botonEliminarPublicacion = botonEliminarPublicacion;
	}



	public HorizontalLayout getLayoutDatosPerfil() {
		return layoutDatosPerfil;
	}



	public void setLayoutDatosPerfil(HorizontalLayout layoutDatosPerfil) {
		this.layoutDatosPerfil = layoutDatosPerfil;
	}



	public Label getNumSiguiendo() {
		return numSiguiendo;
	}



	public void setNumSiguiendo(Label numSiguiendo) {
		this.numSiguiendo = numSiguiendo;
	}



	public Label getLabelSiguiendo() {
		return labelSiguiendo;
	}



	public void setLabelSiguiendo(Label labelSiguiendo) {
		this.labelSiguiendo = labelSiguiendo;
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



	public Label getNumMeGustas() {
		return numMeGustas;
	}



	public void setNumMeGustas(Label numMeGustas) {
		this.numMeGustas = numMeGustas;
	}



	public Label getLabelMeGustas() {
		return labelMeGustas;
	}



	public void setLabelMeGustas(Label labelMeGustas) {
		this.labelMeGustas = labelMeGustas;
	}



	public HorizontalLayout getLayoutDescripcion() {
		return layoutDescripcion;
	}



	public void setLayoutDescripcion(HorizontalLayout layoutDescripcion) {
		this.layoutDescripcion = layoutDescripcion;
	}



	public Label getLabelDescripcion() {
		return labelDescripcion;
	}



	public void setLabelDescripcion(Label labelDescripcion) {
		this.labelDescripcion = labelDescripcion;
	}



	public HorizontalLayout getLayoutBonoes() {
		return layoutBonoes;
	}



	public void setLayoutBonoes(HorizontalLayout layoutBonoes) {
		this.layoutBonoes = layoutBonoes;
	}



	public Button getBotonVideos() {
		return botonVideos;
	}



	public void setBotonVideos(Button botonVideos) {
		this.botonVideos = botonVideos;
	}



	public Button getBotonMeGustas() {
		return botonMeGustas;
	}



	public void setBotonMeGustas(Button botonMeGustas) {
		this.botonMeGustas = botonMeGustas;
	}



	public Element getLayoutListaPublicaciones() {
		return layoutListaPublicaciones;
	}



	public void setLayoutListaPublicaciones(Element layoutListaPublicaciones) {
		this.layoutListaPublicaciones = layoutListaPublicaciones;
	}


	public Label getLabelUsuarioPrivado() {
		return labelUsuarioPrivado;
	}



	public void setLabelUsuarioPrivado(Label labelUsuarioPrivado) {
		this.labelUsuarioPrivado = labelUsuarioPrivado;
	}



	/**
     * Creates a new VistaVerTendencias.
     */
    public VistaVerTendencias() {
        // You can initialise any data required for the connected UI components here.
    }

}
