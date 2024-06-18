package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios_Vista_Usuario_No_registrado_item extends VistaListaComentariosUsuarioNoRegistradoItem{

	public Lista_Comentarios_Vista_Usuario_No_registrado listaComentariosUNR;
	public Ver_perfil_publico ver_perfil;
	Cabecera_Usuario_No_Registrado interfazUNR = null ;
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
		Ver_perfil(null);
	}
	
	public void Ver_perfil(Object contenedor) {
		if(this.listaComentariosUNR != null) {
			if(this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_._publicacionesUNR != null) {
				interfazUNR = this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_._publicacionesUNR._publicaciones__Usuario_no_registrado_.unr.cabeceraUNR;
				this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), this, interfazUNR._cabecera_TOP);
			}
		}else if(contenedor instanceof Lista_comentarios_Usuario_registrado_item){
			Lista_comentarios_Usuario_registrado_item listaComentariosItem = (Lista_comentarios_Usuario_registrado_item) contenedor;
			Usuario_Registrado cabecera = listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.publicacionItem._lista_publicaciones__Usuario_Registrado_.urInterfaz;
			this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), listaComentariosItem, cabecera._cabecera_Usuario_Registrado._cabecera_TOP);
		}
		this.getNombreUsuario().addClickListener(event ->{
			if(listaComentariosUNR != null) {
				interfazUNR.unr.getVaadinHorizontalLayout().removeAll();
				interfazUNR.unr.getVaadinHorizontalLayout().add(ver_perfil);
			}else {
				Lista_comentarios_Usuario_registrado_item comentarios = (Lista_comentarios_Usuario_registrado_item) contenedor;
				Ver_comentarios_Usuario_Registrado interfazUR = comentarios._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_;
				interfazUR.getVaadinHorizontalLayout().removeAll();
				interfazUR.getVaadinHorizontalLayout().add(ver_perfil);
				
			}
		
			});
	}

}