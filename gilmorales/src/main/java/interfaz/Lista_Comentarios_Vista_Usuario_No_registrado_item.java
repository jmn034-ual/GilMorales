package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios_Vista_Usuario_No_registrado_item extends VistaListaComentariosUsuarioNoRegistradoItem{

	public Lista_Comentarios_Vista_Usuario_No_registrado listaComentariosUNR;
	public Ver_perfil_publico ver_perfil;
	Cabecera_Usuario_No_Registrado interfazUNR = null ;
	Comentario comentario;
	Usuario_Registrado userInterfaz;
	
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
		this.listaComentariosUNR = interfaz;
		this.comentario = comentario;
		Ver_perfil(null);
	}
	
	public void Ver_perfil(Object contenedor) {
		Lista_comentarios_Usuario_registrado_item listaComentariosItem = null;
		if(contenedor instanceof Lista_comentarios_Usuario_registrado_item){
			listaComentariosItem = (Lista_comentarios_Usuario_registrado_item) contenedor;
			if(listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.publicacionItem != null)
				userInterfaz = listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.publicacionItem._lista_publicaciones__Usuario_Registrado_.urInterfaz;
			else if(listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.verAjena != null)
				userInterfaz = listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.verAjena.urInterfaz;
			else if(listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.verPropia != null)
				userInterfaz = listaComentariosItem._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_.verPropia.urInterfaz;
		}
		this.getNombreUsuario().addClickListener(event ->{
			if(listaComentariosUNR != null) {
				interfazUNR = this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_.unrInterfaz.cabeceraUNR;
				this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), this, interfazUNR._cabecera_TOP);
				this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_.getVaadinHorizontalLayout().removeAll();
				this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_.getVaadinHorizontalLayout().add(this.ver_perfil);
			}else {
				Lista_comentarios_Usuario_registrado_item listaComentarios = (Lista_comentarios_Usuario_registrado_item) contenedor;
				this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), listaComentarios, userInterfaz._cabecera_Usuario_Registrado._cabecera_TOP);
				Lista_comentarios_Usuario_registrado_item comentarios = (Lista_comentarios_Usuario_registrado_item) contenedor;
				Ver_comentarios_Usuario_Registrado interfazUR = comentarios._lista_comentarios__Usuario_registrado_._ver_comentarios__Usuario_Registrado_;
				interfazUR.getVaadinHorizontalLayout().removeAll();
				interfazUR.getVaadinHorizontalLayout().add(ver_perfil);
				
			}
		
			});
	}

}