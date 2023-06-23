package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaEditarPerfil;

public class Editar_perfil extends VistaEditarPerfil{
	public Ver_perfil_propio _ver_perfil_propio;
	
	public Editar_perfil() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		Cancelar();
	}

	public void Cambiar_foto() {
		throw new UnsupportedOperationException();
	}

	public void Guardar() {
		throw new UnsupportedOperationException();
	}

	public void Cancelar() {
		this.getBotonCancelar().addClickListener(event ->{
			this.setVisible(false);
		});
	}
}