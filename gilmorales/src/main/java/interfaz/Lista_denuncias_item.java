package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import vistas.VistaListaDdenunciasAdministradorItem;

public class Lista_denuncias_item extends VistaListaDdenunciasAdministradorItem {
	private Image _usuarioIcono;
	private Button _verPerfilB;
	private Label _nombreL;
	private Label _estadoDenunciaL;
	private Label _motivoL;
	public Lista_denuncias _lista_denuncias;
	public Filtrar_denuncias _filtrar_denuncias;
	public Ver_Perfil__2 _ver_perfil = new Ver_Perfil__2();
	
	public Lista_denuncias_item(String usuario, String nombreCompleto, String estado, String motivo, String foto) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getNombreCompleto().setText(nombreCompleto);
		this.getNombreUsuario().setText(usuario);
		this.getEstadoDenuncia().setText(estado);
		this.getMotivoDenuncia().setText(motivo);
		this.getVaadinAvatar().setImage(foto);
		this.Ver_perfil();
	}
	
	public Lista_denuncias_item(Usuario_Registrado usuario, Ver_denuncias admin) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getNombreCompleto().setText(usuario.toString());
	}


	public void Ver_perfil() {
		getNombreUsuario().addClickListener(event->{
			this.getVaadinHorizontalLayout().setVisible(false);
			this.getVaadinHorizontalLayout().add(this._ver_perfil);
		});
	}
}