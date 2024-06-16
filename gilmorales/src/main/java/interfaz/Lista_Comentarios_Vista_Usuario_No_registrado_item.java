package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios_Vista_Usuario_No_registrado_item extends VistaListaComentariosUsuarioNoRegistradoItem{

	public Lista_Comentarios_Vista_Usuario_No_registrado listaComentariosUNR;
	public Ver_perfil_publico ver_perfil;
	private Usuario_No_Registrado unrInterfaz;
	Comentario comentario;
	
	public Lista_Comentarios_Vista_Usuario_No_registrado_item() {}

	public Lista_Comentarios_Vista_Usuario_No_registrado_item(Lista_Comentarios_Vista_Usuario_No_registrado interfaz, Comentario comentario) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage(comentario.getEsComentadoPor().getFoto());
		this.getNombreUsuario().setText(comentario.getEsComentadoPor().getNombreUsuario());
		this.getComentarioL().setText(comentario.getComentario());
		this.getNumeroMeGusta().setText(comentario.getNumeroMeGustas()+"");
		this.getMeGustaB().setEnabled(false);
		this.getDenunciarB().setVisible(false);
		this.getBorrarComentarioB().setVisible(false);
//		this.unrInterfaz = unr;
		listaComentariosUNR = interfaz;
		this.comentario = comentario;
		Ver_perfil();
	}
	
	public void Ver_perfil() {
		Cabecera_Usuario_No_Registrado interfaz = null ;
		if(this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_._publicacionesUNR != null) {
			interfaz = this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_._publicacionesUNR._publicaciones__Usuario_no_registrado_.unr.cabeceraUNR;
			this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), this, interfaz._cabecera_TOP);
		}
		this.getNombreUsuario().addClickListener(event ->{
			unrInterfaz.getVaadinHorizontalLayout().removeAll();
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

}