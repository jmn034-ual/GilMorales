package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaConfigurarPerfil;

public class Configurar_perfil extends VistaConfigurarPerfil{

	public Ver_perfil_propio _ver_perfil_propio;
	Dialog dialog ;
	UsuarioRegistrado user;
	BDPrincipal bd = new BDPrincipal();

	public Configurar_perfil(UsuarioRegistrado user, Dialog dialog, Ver_perfil_propio ver_perfil_propio) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
    	this._ver_perfil_propio = ver_perfil_propio;
    	this.dialog = dialog;
    	this.user = user;
    	BotonCerrar();	
    	Restaurar();
    }
	public void Restaurar() {
		this.getBotonRestaurar().addClickListener(event -> {
			this.getCheckboxComentarios().setValue(false);
			this.getCheckboxMeGustas().setValue(false);
			this.getCheckboxMenciones().setValue(false);
			this.getCheckboxNuevosSeguidores().setValue(false);
		});
	}
//
//	public void Guardar() {
//		this.getBotonGuardar().addClickListener(event -> {
//			if(this.getRadioGroupVisibilidad().getValue() == )
//			this.bd.configurarPerfil(this.user.getID(), );
//		});
//	}
	public void BotonCerrar() {
		this.getBotonCerrar().addClickListener(event->{
			this.dialog.close();
		});
	}
}