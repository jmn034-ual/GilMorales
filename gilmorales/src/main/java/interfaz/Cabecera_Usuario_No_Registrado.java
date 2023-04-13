package interfaz;

import javax.swing.ImageIcon;

import com.vaadin.flow.component.html.Image;

import vistas.VistaCabeceraUsuarioNoRegistrado;

public class Cabecera_Usuario_No_Registrado extends VistaCabeceraUsuarioNoRegistrado{
//	private button _registrarB;
//	private button _inicioB;
//	private button _buscarB;
//	private TextField _buscarTF;
//	private ImageIcon _logoWeb;
//	public Usuario_No_Registrado _usuario_No_Registrado = new Usuario_No_Registrado();
	public Realizar_busqueda _realizar_busqueda = new Realizar_busqueda();
	public Cabecera_TOP _cabecera_TOP;

	public Cabecera_Usuario_No_Registrado() {
		Image customIcon = new Image("icons/logo.png", null);
		customIcon.getStyle().set("width", "100px");
		customIcon.getStyle().set("heigth", "100px");
		this.getLogoWeb().setIcon(customIcon);

	}
	
	public void Realizar_busqueda() {
		throw new UnsupportedOperationException();
	}

	public void Cabecera_TOP() {
		throw new UnsupportedOperationException();
	}

	public void Volver_Inicio() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse() {
		throw new UnsupportedOperationException();
	}
}