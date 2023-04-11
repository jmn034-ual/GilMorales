package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaUsarOtraCuenta;

public class Usar_otra_cuenta extends VistaUsarOtraCuenta{
	private Label _tituloL;
	private Label _usuarioL;
	private TextField _usuarioTF;
	private Label _passwordL;
	private TextField _passwordTF;
	private Button _cancelarB;
	private Button _entrarB;
	public Iniciar_sesion_otras_plataformas _iniciar_sesion_otras_plataformas;

	public void Validar_datos() {
		//throw new UnsupportedOperationException();
	}

	public void Cancelar() {
		_iniciar_sesion_otras_plataformas=new Iniciar_sesion_otras_plataformas();
		this.getCancelarB().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_iniciar_sesion_otras_plataformas);});
	}
}