package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.IronIcon;

import basededatos.BDPrincipal;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaMeGustasPublicacionItem;

public class Lista_Me_Gustas_Publicacion_item extends VistaListaMeGustasPublicacionItem {

	public Lista_Me_Gustas_Publicacion _lista_Me_Gustas_Publicacion;
	public Ver_perfil_publico ver_perfil;
	UsuarioRegistrado user;
	BDPrincipal bd = new BDPrincipal();

	public Lista_Me_Gustas_Publicacion_item(UsuarioRegistrado user, Lista_Me_Gustas_Publicacion interfaz) {
		this.getStyle().set("width", "100%");
		this.user = user;
		this._lista_Me_Gustas_Publicacion = interfaz;
		this.getBotonNombreUsuario().setText(user.getNombreUsuario());
		this.getVaadinAvatar().setImage(user.getFoto());
		Ver_perfil();
		Seguir();
	}

	public void Seguir() {
		if (this._lista_Me_Gustas_Publicacion.p.getPerteneceA().seguir.contains(this.user)) {
			this.getBotonSeguir().setText("Dejar de Seguir");
		}
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this._lista_Me_Gustas_Publicacion.p.getPerteneceA().getID(), this.user.getID());
			this.user = this.bd.cargarUsuarioRegistrado(this.user.getID());
			if (this.getBotonSeguir().getText().equals("Dejar de Seguir"))
				this.getBotonSeguir().setText("Seguir");
			else
				this.getBotonSeguir().setText("Dejar de Seguir");
		});
	}

	public void Ver_perfil() {
		this.getBotonNombreUsuario().addClickListener(event -> {
			if (this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion._ver_publicacion_propia != null) {
				this.ver_perfil = new Ver_perfil_publico(this.user, this,
						this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion._ver_publicacion_propia.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion._ver_publicacion_propia
						.getVaadinHorizontalLayout().removeAll();
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion._ver_publicacion_propia
						.getVaadinHorizontalLayout().add(this.ver_perfil);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion._ver_publicacion_propia.dialog.close();
			}else if(this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.listaItem != null) {
				this.ver_perfil = new Ver_perfil_publico(this.user, this,
						this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.listaItem._lista_publicaciones__Usuario_Registrado_.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.listaItem._lista_publicaciones__Usuario_Registrado_.urInterfaz
						.getVaadinHorizontalLayout().removeAll();
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.listaItem._lista_publicaciones__Usuario_Registrado_.urInterfaz
						.getVaadinHorizontalLayout().add(this.ver_perfil);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.listaItem.dialog.close();
			}else {
				this.ver_perfil = new Ver_perfil_publico(this.user, this,
						this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.verComentarios.top);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.verComentarios
						.getVaadinHorizontalLayout().removeAll();
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.verComentarios
						.getVaadinHorizontalLayout().add(this.ver_perfil);
				this._lista_Me_Gustas_Publicacion._ver_me_gustas_publicacion.verComentarios.dialog.close();
			}
		});
	}
}