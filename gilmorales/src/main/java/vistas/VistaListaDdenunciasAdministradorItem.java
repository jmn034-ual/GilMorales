package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.avatar.Avatar;

/**
 * A Designer generated component for the vista-lista-ddenuncias-administrador-item template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista-ddenuncias-administrador-item")
@JsModule("./src/vista-lista-ddenuncias-administrador-item.ts")
public class VistaListaDdenunciasAdministradorItem extends LitTemplate {



	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinAvatar")
	private Avatar vaadinAvatar;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("nombreUsuario")
	private Button nombreUsuario;
	@Id("nombreCompleto")
	private Label nombreCompleto;
	@Id("estadoDenuncia")
	private Label estadoDenuncia;
	@Id("motivoDenuncia")
	private Label motivoDenuncia;
	
	

	public Label getMotivoDenuncia() {
		return motivoDenuncia;
	}



	public void setMotivoDenuncia(Label motivoDenuncia) {
		this.motivoDenuncia = motivoDenuncia;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}


	public Avatar getVaadinAvatar() {
		return vaadinAvatar;
	}



	public void setVaadinAvatar(Avatar vaadinAvatar) {
		this.vaadinAvatar = vaadinAvatar;
	}



	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}



	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}



	public Button getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(Button nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public Label getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(Label nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public Label getEstadoDenuncia() {
		return estadoDenuncia;
	}



	public void setEstadoDenuncia(Label estadoDenuncia) {
		this.estadoDenuncia = estadoDenuncia;
	}



	/**
     * Creates a new VistaListaDdenunciasAdministradorItem.
     */
    public VistaListaDdenunciasAdministradorItem() {
        // You can initialise any data required for the connected UI components here.
    }

}
