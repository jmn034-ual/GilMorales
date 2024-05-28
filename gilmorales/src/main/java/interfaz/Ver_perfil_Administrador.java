package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.textfield.TextArea;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import bd_dcl.UsuarioAdministrador;
import bd_dcl.UsuarioRegistrado;

//import basededatos.iVer_perfil__Administrador_;

public class Ver_perfil_Administrador extends Ver_tendencias{
//	private Button _bloquearB;
//	private IronIcon _fotoUsuario;
//	private Label _nombreUsuarioL;
//	private Label _nombreYapellidosL;
//	private int _numeroSiguiendo;
//	private int _numeroSeguidores;
//	private int _numeroMeGustas;
//	private TextArea _descripcionTA;
//	private Button _videosB;
//	private Button _meGustasB;
//	public iVer_perfil__Administrador_ _iVer_perfil__Administrador_;
	public Ver_publicaciones_gustadas _ver_publicaciones_gustadas;
	public Bloquear_usuario _bloquear_usuario;
	public Lista_publicaciones_usuario _lista_publicaciones_usuario;
	iAdministrador bd = new BDPrincipal();
	UsuarioRegistrado ur;
	public Ver_perfil_Administrador() {}

	public Ver_perfil_Administrador(UsuarioRegistrado ur) {
		this.ur = ur;
		this.getBotonSeguir().setVisible(false);
		this.getBotonPeticionAmistad().setVisible(false);
		this.getBotonDenunciar().setVisible(false);
		this.getLabelUsuarioPrivado().setVisible(false);
	}
	
	public void Ver_publicaciones_gustadas() {
		throw new UnsupportedOperationException();
	}

	public void Bloquear_usuario() {
		this.getBotonBloquear().addClickListener(event ->{
			bd.bloquearUsuario(this.ur.getID());
		});
	}

	public void Lista_publicaciones_usuario() {
		throw new UnsupportedOperationException();
	}
}