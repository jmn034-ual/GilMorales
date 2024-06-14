package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios_Vista_Usuario_No_registrado_item extends VistaListaComentariosUsuarioNoRegistradoItem{

	public Lista_Comentarios_Vista_Usuario_No_registrado listaComentariosUNR;
	public Ver_perfil_publico ver_perfil;
	private Usuario_No_Registrado unrInterfaz;
	Comentario comentario;

	public Lista_Comentarios_Vista_Usuario_No_registrado_item(Object interfaz, Comentario comentario) {
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
		listaComentariosUNR = (Lista_Comentarios_Vista_Usuario_No_registrado)  interfaz;
		this.comentario = comentario;
		Ver_perfil();
	}
	
	public void Ver_perfil() {
		
//		if(this.listaComentariosUNR._ver_comentarios__Usuario_No_registrado_._lista_Comentarios__Vista_Usuario_No_registrado_)
		
		this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor(), this, this.unrInterfaz.cabeceraUNR._cabecera_TOP);
		this.getNombreUsuario().addClickListener(event ->{
			unrInterfaz.getVaadinHorizontalLayout().removeAll();
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

}