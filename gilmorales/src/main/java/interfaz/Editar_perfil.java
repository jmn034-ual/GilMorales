package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaEditarPerfil;

public class Editar_perfil extends VistaEditarPerfil{
	public Ver_perfil_propio _ver_perfil_propio;
	iUsuario_Registrado bd = new BDPrincipal();
	UsuarioRegistrado ur;
	public Editar_perfil() {}
	public Editar_perfil(UsuarioRegistrado ur) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.ur = ur;
		this.getTextFieldNombre().setPlaceholder(ur.getNombreUsuario());
		this.getTextFieldNombre().setPlaceholder(ur.getNombre());
		this.getFotoPerfil().setImage(ur.getFoto());
		Cancelar();
	}

	public void Cambiar_foto() {
		this.getBotonCambiar().addClickListener(event ->{
//			Upload fotoNueva = new Upload();
			String nuevaFoto = "Nueva foto";
			bd.cambiarFotoPerfil(this.ur.getID(), this.ur.getNombreUsuario(), nuevaFoto);
		});
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