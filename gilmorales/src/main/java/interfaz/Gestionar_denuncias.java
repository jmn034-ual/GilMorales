package interfaz;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ClickableRenderer.ItemClickListener;

import TikTok.Imagen;
import vistas.VistaGestionarDenuncias;

public class Gestionar_denuncias extends VistaGestionarDenuncias {
	private Button _add_fotoB;
	private Label _tituloL;
	private Image _foto;
	private Label _nombreL;
	private Label _fechaL;
	private Label _codigoEmpleadoL;
	private Button _verDenunciasB;
	public Cabecera_Administrador _cabecera_Administrador;
	public Ver_denuncias _ver_denuncias = new Ver_denuncias();

	public Gestionar_denuncias() {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	public Gestionar_denuncias(String nombre, String fechaNac, String cod,String foto) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getNombre().setText(nombre);
		this.getFecha().setText(fechaNac);
		this.getCódigo().setText(cod);
		this.getFotoUsuario().setImage(foto);
		this.Add_foto();
		this.Ver_denuncias();
	}
	
	public void Ver_denuncias() {
		this.getVerDenuncias().addClickListener(event->{this.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_denuncias);});
	}

	public void Add_foto() {
		this.getAddFoto().addClickListener(event->{});
	}
}