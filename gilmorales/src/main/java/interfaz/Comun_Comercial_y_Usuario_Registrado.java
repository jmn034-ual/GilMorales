package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera;

public class Comun_Comercial_y_Usuario_Registrado extends VistaCabecera{
//	private Button _anadirB;
//	private Button _cerrarSesionB;
//	private String _iconoWeb;
	public Add_publicacion addPubli;
	
	public Comun_Comercial_y_Usuario_Registrado() {
//		this.getStyle().set("width","100%");
//		this.getStyle().set("height","100%");
		this.getBotonAniadir().addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
    	Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "80px");
		customIcon.getStyle().set("heigth", "80px");
//		addPubli = new Add_publicacion();
//		Add_publicacion();
		Cerrar_sesion();

	}

	public void Add_publicacion() {
//		this.getBotonAniadir().addClickListener(event->{
//			this.getBotonNotificaciones().setVisible(true);
//			this.getBotonPerfil().setVisible(true);
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).removeAll();
//			this.getVaadinVerticalLayout1().as(VerticalLayout.class).add(addPubli);
//		});
	}

	public void Cerrar_sesion() {
		this.getBotonCerrarSesion().addClickListener(event -> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
//			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(new Iniciar_Sesion__4());
		});
	}
}