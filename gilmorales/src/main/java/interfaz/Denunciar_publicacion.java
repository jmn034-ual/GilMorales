package interfaz;

import bd_dcl.UsuarioRegistrado;
import vistas.VistaDenunciarUsuario;

public class Denunciar_publicacion extends VistaDenunciarUsuario{
//	private ComboBox _elegir_motivo_denuncia;
//	private Label _tituloL;
//	private Label _motivoL;
//	private TextField _explicacionTF;
//	private button _cancelarB;
//	private button _enviarB;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Lista_publicaciones_Usuario_Registrado_item _lista_publicaciones__Usuario_Registrado_;
	private String motivo;
	
	public Denunciar_publicacion(UsuarioRegistrado userAdenunciar, UsuarioRegistrado userDenunciante) {
		
	}

	public void Elegir_motivo_denuncia() {
		
	}

	public void Cancelar() {
		throw new UnsupportedOperationException();
	}

	public void Enviar() {
		throw new UnsupportedOperationException();
	}
}