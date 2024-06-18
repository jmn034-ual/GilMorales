package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;

public class Comun_Comercial_y_Usuario_Registrado extends VistaCabecera{

	public Add_publicacion addPubli;
	
	public Comun_Comercial_y_Usuario_Registrado() {
		this.getBotonAniadir().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "6%");
		this.getLogoWeb().setIcon(customIcon);
//		addPubli = new Add_publicacion();
//		Add_publicacion();
		Cerrar_sesion();

	}

//	public void Add_publicacion() {
////		this.getBotonAniadir().addClickListener(event->{
////			this.getBotonNotificaciones().setVisible(true);
////			this.getBotonPerfil().setVisible(true);
////			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
////			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(addPubli);
////		});
//	}

	public void Cerrar_sesion() {
		this.getBotonCerrarSesion().addClickListener(event -> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		});
	}
}