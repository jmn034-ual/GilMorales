package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import bd_dcl.Comentario;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaTopComentariosUsuarioNoRegistradoItem;

public class Lista_Top_Comentarios_Usuario_No_Registrado_item extends VistaListaTopComentariosUsuarioNoRegistradoItem {
	private Image _usuarioIcono;
	private Button _verPerfilB;
	private Label _comentarioL;
	public Lista_Top_Comentarios_Usuario_No_Registrado _lista_Top_Comentarios__Usuario_No_Registrado_;
	public Ver_perfil_publico _ver_perfil;
	Comentario comentario;
	
	public Lista_Top_Comentarios_Usuario_No_Registrado_item(Comentario comentario) {
		this.getStyle().set("width", "100%");
		this.comentario = comentario;
		datosComentario();
	}
	
	public Lista_Top_Comentarios_Usuario_No_Registrado_item(Comentario comentario, Lista_Top_Comentarios_Usuario_No_Registrado interfaz) {
		this.getStyle().set("width", "100%");
		this.comentario = comentario;
		this._lista_Top_Comentarios__Usuario_No_Registrado_ = interfaz;
		Icon icono = new Icon(VaadinIcon.HEART);
		this.getMeGustaB().setIcon(icono);
		this.getMeGustaB().getStyle().set("color", "black");
		this.getMeGustaB().setEnabled(false);
		datosComentario();
		Ver_perfil(null);
	}
	
	public void datosComentario() {
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreDeUsuarioB().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getBorrarComentarioB().setVisible(false);
	}

	public void Ver_perfil(Object interfaz) {
		this.getNombreDeUsuarioB().addClickListener(event ->{
			if(this._lista_Top_Comentarios__Usuario_No_Registrado_ != null) {
				this._ver_perfil = new Ver_perfil_publico(this.comentario.getEsComentadoPor(), this, this._lista_Top_Comentarios__Usuario_No_Registrado_._ver_publicacion__Usuario_No_Registrado_.unr.cabeceraUNR._cabecera_TOP);
				this._lista_Top_Comentarios__Usuario_No_Registrado_._ver_publicacion__Usuario_No_Registrado_.unr.getVaadinHorizontalLayout().removeAll();
				this._lista_Top_Comentarios__Usuario_No_Registrado_._ver_publicacion__Usuario_No_Registrado_.unr.getVaadinHorizontalLayout().add(this._ver_perfil);
			}else if (interfaz instanceof Lista_Top_comentarios_Usuario_Registrado_item) {
				Lista_Top_comentarios_Usuario_Registrado_item itemRegistrado = (Lista_Top_comentarios_Usuario_Registrado_item) interfaz;
				this._ver_perfil = new Ver_perfil_publico(this.comentario.getEsComentadoPor(), interfaz, itemRegistrado._lista_Top_comentarios__Usuario_Registrado_._ver_publicacion__usuario_Registrado_.urInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
				itemRegistrado._lista_Top_comentarios__Usuario_Registrado_._ver_publicacion__usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().removeAll();
				itemRegistrado._lista_Top_comentarios__Usuario_Registrado_._ver_publicacion__usuario_Registrado_.urInterfaz.getVaadinHorizontalLayout().add(this._ver_perfil);
			}else {
				Lista_Top_Comentarios_Administrador_item itemAdmin = (Lista_Top_Comentarios_Administrador_item) interfaz;
				itemAdmin._lista_Top_Comentarios__Administrador_._ver_publicacion__Administrador_.admin.getVaadinHorizontalLayout().removeAll();
				itemAdmin._lista_Top_Comentarios__Administrador_._ver_publicacion__Administrador_.admin.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(itemAdmin._lista_Top_Comentarios__Administrador_._ver_publicacion__Administrador_.admin._cabecera_Administrador.cabeceraTOP, this.comentario.getEsComentadoPor()));

			}
		});
	}
}