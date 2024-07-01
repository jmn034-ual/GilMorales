package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaConfigurarPerfil;

public class Configurar_perfil extends VistaConfigurarPerfil {

	public Ver_perfil_propio _ver_perfil_propio;
	Dialog dialog;
	UsuarioRegistrado user;
	BDPrincipal bd = new BDPrincipal();
	RadioButtonGroup<String> visibilidad;
	int visibilidadInt;
	boolean visibilidadBolean;

	public Configurar_perfil(UsuarioRegistrado user, Dialog dialog, Ver_perfil_propio ver_perfil_propio) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_perfil_propio = ver_perfil_propio;
		this.dialog = dialog;
		this.user = user;
		this.visibilidad = new RadioButtonGroup<String>();
		visibilidad.setItems("Pública", "Privada");
		if (this.user.getPrivacidad() == 0)
			visibilidad.setValue("Pública");
		else
			visibilidad.setValue("Privada");
		this.getVaadinHorizontalLayout1().add(visibilidad);
		BotonCerrar();
		Restaurar();
		Guardar();
	}

	public void Restaurar() {
		this.getBotonRestaurar().addClickListener(event -> {
			this.getCheckboxComentarios().setValue(false);
			this.getCheckboxMeGustas().setValue(false);
			this.getCheckboxMenciones().setValue(false);
			this.getCheckboxNuevosSeguidores().setValue(false);
		});
	}

	public void Guardar() {
		this.visibilidad.addValueChangeListener(estado -> {
			if(estado.getValue() == "Pública") {
				visibilidadInt = 0;
			}else if(estado.getValue() == "Privada") {
				visibilidadInt = 1;
			}
			visibilidadBolean = true;
		});
		
		this.getBotonGuardar().addClickListener(event -> {
			if(visibilidadBolean) {
			this.bd.configurarPerfil(this.user.getID(), this.visibilidadInt);
			this.dialog.close();
			}
		});
	}

	public void BotonCerrar() {
		this.getBotonCerrar().addClickListener(event -> {
			this.dialog.close();
		});
	}
}