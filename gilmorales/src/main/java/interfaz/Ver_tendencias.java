package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaVerTendencias;

public class Ver_tendencias extends VistaVerTendencias{

	public Ver_lista_Hashtag _ver_lista_Hashtag;
	public Tendencias _tendencias;
	public Cabecera_TOP cabecera_top;
	public 	UsuarioRegistrado user;
	public UsuarioComercial comercial;
	BDPrincipal bd = new BDPrincipal();

	public Ver_tendencias() {
		Ver_lista_Hashtag();
		Tendencias();
	}
		
	public Ver_tendencias(Cabecera_TOP cabecera_TOP) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this.cabecera_top = cabecera_TOP;
    	if(this.cabecera_top._cabecera_Usuario_Registrado != null)
    		this.user = this.bd.cargarUsuarioRegistrado(this.cabecera_top._cabecera_Usuario_Registrado.urInterfaz.ur.getID());
		Tendencias();
		Ver_lista_Hashtag();
	}
	
	public void Ver_lista_Hashtag() {
		 _ver_lista_Hashtag = new Ver_lista_Hashtag(this);
		this.getBotonVerListaHashtags().addClickListener(event ->{
			this.getVaadinHorizontalLayout().removeAll();
			this.getVaadinHorizontalLayout().add(_ver_lista_Hashtag);
			});
	}

	public void Tendencias() {
		 _tendencias = new Tendencias(this);
		this.getLayoutHashtags().as(VerticalLayout.class).add(_tendencias);
	}
}