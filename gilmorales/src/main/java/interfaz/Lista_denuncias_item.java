package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import bd_dcl.Denuncia;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaDdenunciasAdministradorItem;

public class Lista_denuncias_item extends VistaListaDdenunciasAdministradorItem {

	public Lista_denuncias _lista_denuncias;
	public Filtrar_denuncias _filtrar_denuncias;
	public Ver_perfil_Administrador _ver_perfil;
	UsuarioRegistrado denunciante;
	
	public Lista_denuncias_item() {}
	
	public Lista_denuncias_item(Denuncia d,Lista_denuncias interfaz) {
		this._lista_denuncias = interfaz;
		this.getNombreCompleto().setText(d.getRealizadaPor().getNombre() + " " + d.getRealizadaPor().getApellidos());
		this.getNombreUsuario().setText(d.getRealizadaPor().getNombreUsuario());
		if(d.getTipoEstado() == 0) {
			this.getEstadoDenuncia().setText("Aplicada");
		} else if(d.getTipoEstado() == 1) {
			this.getEstadoDenuncia().setText("Finalizada");
		}else {
			this.getEstadoDenuncia().setText("Pendiente");
		}
		this.getMotivoDenuncia().setText(d.getMotivo());
		this.getVaadinAvatar().setImage(d.getRealizadaPor().getFoto());
		this.denunciante = d.getRealizadaPor();
		this.Ver_perfil();
	}
	
	public Lista_denuncias_item(Usuario_Registrado usuario, Ver_denuncias admin) {
		this.getNombreCompleto().setText(usuario.toString());
	}


	public void Ver_perfil() {
		_ver_perfil = new Ver_perfil_Administrador( this._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP, denunciante);
		getNombreUsuario().addClickListener(event->{
			this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_perfil);
		});
	}
}