package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

import vistas.VistaListaDdenunciasAdministradorItem;

public class Lista_denuncias_item extends VistaListaDdenunciasAdministradorItem {
	private Image _usuarioIcono;
	private Button _verPerfilB;
	private Label _nombreL;
	private Label _estadoDenunciaL;
	private Label _motivoL;
	public Lista_denuncias _lista_denuncias;
	public Filtrar_denuncias _filtrar_denuncias;
	public Ver_Perfil__2 _ver_perfil;
	
	public Lista_denuncias_item() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}
}