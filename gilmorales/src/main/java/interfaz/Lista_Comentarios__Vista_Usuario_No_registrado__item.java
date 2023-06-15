package interfaz;

import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios__Vista_Usuario_No_registrado__item extends VistaListaComentariosUsuarioNoRegistradoItem{
//	private button _verPerfilB;
//	private ImageIcon _usuarioIcono;
//	private Label _comentarioL;
//	private int _numeroComentarios;
//	private Label _numeroComentariosL;
	private int numeroMeGustas = Integer.parseInt(this.getNumeroMeGusta().getText());
	private int bMeGustaPulsado = 0;
	public Lista_Comentarios__Vista_Usuario_No_registrado_ listaComentariosUNR = new Lista_Comentarios__Vista_Usuario_No_registrado_();
	public Ver_Perfil__2 _ver_perfil = new Ver_Perfil__2();

	public Lista_Comentarios__Vista_Usuario_No_registrado__item() {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage("icons/icon.png");
		this.getNombreUsuario().setText("NombreUsuario");
		this.getComentarioL().setText("Este es un comentaio de prueba...");
		this.getNumeroMeGusta().setText("0");
		this.getMeGustaL().setText("Me Gustas");
		MeGustasComentarios();
	}
	
	public void Ver_perfil() {
	}

	public void MeGustasComentarios() {
		this.getMeGustaB().addClickListener(event ->{
			bMeGustaPulsado = bMeGustaPulsado == 0 ? 1 : 0;
			numeroMeGustas = bMeGustaPulsado == 1 ? ++numeroMeGustas : --numeroMeGustas;
			this.getNumeroMeGusta().setText(""+numeroMeGustas);			
		});
	}
}