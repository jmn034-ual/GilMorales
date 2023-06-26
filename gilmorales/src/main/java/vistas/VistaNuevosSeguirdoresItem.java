package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-nuevos-seguirdores-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevos-seguirdores-item")
@JsModule("./src/vista-nuevos-seguirdores-item.ts")
public class VistaNuevosSeguirdoresItem extends LitTemplate {


	@Id("nuevoSeguidor")
	private HorizontalLayout nuevoSeguidor;
	@Id("fotoPerfil")
	private HorizontalLayout fotoPerfil;
	@Id("botonDejarDeSeguir")
	private Button botonDejarDeSeguir;
	@Id("botonEnviarSolicitud")
	private Button botonEnviarSolicitud;
	@Id("botonSeguir")
	private Button botonSeguir;
	@Id("privado")
	private HorizontalLayout privado;
	@Id("botonCancelar")
	private Button botonCancelar;
	@Id("botonAceptar")
	private Button botonAceptar;

	
	public HorizontalLayout getNuevoSeguidor() {
		return nuevoSeguidor;
	}


	public void setNuevoSeguidor(HorizontalLayout nuevoSeguidor) {
		this.nuevoSeguidor = nuevoSeguidor;
	}


	public HorizontalLayout getFotoPerfil() {
		return fotoPerfil;
	}


	public void setFotoPerfil(HorizontalLayout fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}


	public Button getBotonDejarDeSeguir() {
		return botonDejarDeSeguir;
	}


	public void setBotonDejarDeSeguir(Button botonDejarDeSeguir) {
		this.botonDejarDeSeguir = botonDejarDeSeguir;
	}


	public Button getBotonEnviarSolicitud() {
		return botonEnviarSolicitud;
	}


	public void setBotonEnviarSolicitud(Button botonEnviarSolicitud) {
		this.botonEnviarSolicitud = botonEnviarSolicitud;
	}


	public Button getBotonSeguir() {
		return botonSeguir;
	}


	public void setBotonSeguir(Button botonSeguir) {
		this.botonSeguir = botonSeguir;
	}


	public HorizontalLayout getPrivado() {
		return privado;
	}


	public void setPrivado(HorizontalLayout privado) {
		this.privado = privado;
	}


	public Button getBotonCancelar() {
		return botonCancelar;
	}


	public void setBotonCancelar(Button botonCancelar) {
		this.botonCancelar = botonCancelar;
	}


	public Button getBotonAceptar() {
		return botonAceptar;
	}


	public void setBotonAceptar(Button botonAceptar) {
		this.botonAceptar = botonAceptar;
	}


	/**
     * Creates a new VistaNuevosSeguirdoresItem.
     */
    public VistaNuevosSeguirdoresItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
