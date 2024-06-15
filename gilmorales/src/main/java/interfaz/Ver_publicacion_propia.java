package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Publicacion;
import bd_dcl.PublicacionDAO;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;

public class Ver_publicacion_propia extends Ver_publicacion_usuario_Registrado {

	public Publicaciones_propias_item _publicaciones_propias;
	public Add_publicacion _add_publiacacion;
	public Ver_perfil_propio ver_perfil_propio;
	public Ver_me_gustas_publicacion _ver_me_gustas_publicacion;
	//	private Publicacion publicacion;
	private Usuario_Registrado urInterfaz;
	private iUsuario_Registrado bd = new BDPrincipal();


	public Ver_publicacion_propia(Publicacion publicacion, Usuario_Registrado urInterfaz) {
		super(publicacion, publicacion.getPerteneceA());
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.urInterfaz = urInterfaz;
		this.getVaadinHorizontalLayout2().setVisible(false);
		this.getVerPerfil().setText(this.publicacion.getPerteneceA().getNombreUsuario());
		this.getAvatar().setImage(this.publicacion.getPerteneceA().getFoto());
		this.getGeolocalizacion().setText(this.publicacion.getLocalizacion());
		this.getDescripcion().setText(this.publicacion.getDescripcion());
		this.getBotonComentar().setVisible(false);
		this.getBotonSeguir().setVisible(false);
		this.getVaadinHorizontalLayout2().setVisible(false);
		this.getNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getFechaSubida().setText(this.publicacion.getFechaPublicacion());
		this.getNumVisualizaciones().setText(this.publicacion.getNumVisualizaciones()+"");
		this.getVideo().add(new Video(publicacion.getVideo()));
		this.getBotonMeGusta().setVisible(false);
		Eliminar_publicacion_propia();
		Ver_perfil_propio();
		Ver_me_gustas_publicacion();
	}

	public void Eliminar_publicacion_propia() {
		this.getVaadinButton1().addClickListener(event ->{
			bd.eliminarPublicacion(this.publicacion.getIdPublicacion());
			Notification.show("Publicacion eliminada.");
		});
	}

	public void Ver_perfil_propio() {
		this.ver_perfil_propio = new Ver_perfil_propio(_add_publiacacion.urInterfaz._cabecera_Usuario_Registrado, _add_publiacacion.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
		this.getVerPerfil().addClickListener(event ->{
			UsuarioRegistrado ur = this.publicacion.getPerteneceA();
			if(ur != null) {
				this.urInterfaz.getVaadinHorizontalLayout().removeAll();
				this.urInterfaz.getVaadinHorizontalLayout().add(ver_perfil_propio);
			}
		});	
	}

	public void Ver_me_gustas_publicacion() {
		_ver_me_gustas_publicacion = new Ver_me_gustas_publicacion(this.publicacion);
		this.getBotonVerMeGustas().addClickListener(event ->{
			Dialog dialog = new Dialog(_ver_me_gustas_publicacion);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("70%");
			dialog.setWidth("61%");
			this._ver_me_gustas_publicacion.getBotonCerrar().addClickListener(event2 ->{
				dialog.close();
			});
			dialog.open();
		});
	}
}