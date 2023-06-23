package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.webcomponent.WebComponent;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.dom.Element;

import basededatos.BDPrincipal;
import ch.qos.logback.classic.pattern.RelativeTimeConverter;
//import basededatos.iUsuario_No_Registrado;
import vistas.VistaUsuarioNoRegistrado;

public class Usuario_No_Registrado extends VistaUsuarioNoRegistrado{
	//	private button _iniciarSesionB;
	//	public iUsuario_No_Registrado _iUsuario_No_Registrado;
	public Lista_Publicaciones__Usuario_no_registrado_ publicacionesNoRegistrado = new Lista_Publicaciones__Usuario_no_registrado_(this);
	public Cabecera_Usuario_No_Registrado cabeceraUNR;
	Iniciar_Sesion__4 inicioSesion;
	private BDPrincipal bd;

	public Usuario_No_Registrado(BDPrincipal bd) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.bd = bd;
		cabeceraUNR = new Cabecera_Usuario_No_Registrado();
		Lista_Publicaciones__Usuario_no_registrado_();
//		Iniciar_Sesion();
		Cabecera_Usuario_No_Registrado();	
	}

	public void Lista_Publicaciones__Usuario_no_registrado_() {
		this.getLayoutListaPublicaciones().as(VerticalLayout.class).add(publicacionesNoRegistrado);
	}

	public void Cabecera_Usuario_No_Registrado() {
		this.getLayoutCabecera().add(cabeceraUNR);
		this.cabeceraUNR.getVaadinVerticalLayout().setVisible(false);
		this.cabeceraUNR.getBotonRegistrarse().addClickListener(event-> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll(); 
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(cabeceraUNR);
		});
		this.cabeceraUNR._cabecera_TOP.getBotonVerListaHashtag().addClickListener(event -> {
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this.cabeceraUNR._cabecera_TOP);
		});
		this.cabeceraUNR._cabecera_TOP.getBotonVerListaUsuarios().addClickListener(event -> {
			this.getLayoutListaPublicaciones().setVisible(false);
			this.getVaadinHorizontalLayout().add(this.cabeceraUNR._cabecera_TOP);
		});
		this.cabeceraUNR.getInicio().addClickListener(event -> {
			this.cabeceraUNR.getVaadinVerticalLayout().setVisible(false);
			this.publicacionesNoRegistrado.setVisible(true);
			this.getLayoutListaPublicaciones().setVisible(true);
			this.cabeceraUNR._cabecera_TOP.setVisible(true);
			this.getVaadinHorizontalLayout().remove(this.getVaadinHorizontalLayout().getComponentAt(0));
		});
		this.cabeceraUNR.getBotonBuscar().addClickListener(event ->{
			System.out.println(this.getVaadinHorizontalLayout().getComponentCount());
			if(this.getVaadinHorizontalLayout().getComponentCount() != 0)
				this.getVaadinHorizontalLayout().remove(this.getVaadinHorizontalLayout().getComponentAt(0));
			this.getLayoutListaPublicaciones().setVisible(false);
		});
	}


	public void Iniciar_Sesion() {
		inicioSesion = new Iniciar_Sesion__4(bd);
		this.cabeceraUNR.getVaadinButton().addClickListener(event-> {
			this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll(); 
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(inicioSesion);
		});
	}
}