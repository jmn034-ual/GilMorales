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
	public Ver_perfil_publico ver_perfil;
	private Usuario_No_Registrado unr;

	public Lista_Comentarios__Vista_Usuario_No_registrado__item(Usuario_No_Registrado unr) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage("icons/icon.png");
		this.getNombreUsuario().setText("NombreUsuario");
		this.getComentarioL().setText("Este es un comentaio de prueba...");
		this.getNumeroMeGusta().setText("0");
		this.getMeGustaL().setText("Me Gustas");
		this.unr = unr;
		MeGustasComentarios();
		Ver_perfil();
	}
	
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(unr);
		this.getNombreUsuario().addClickListener(event ->{
			unr.getLayoutListaPublicaciones().setVisible(false);
			unr.cabeceraUNR._cabecera_TOP.setVisible(false);
			unr.getVaadinHorizontalLayout().remove(unr.getVaadinHorizontalLayout().getComponentAt(0));
			unr.getVaadinHorizontalLayout().add(ver_perfil);
			});
	}

	public void MeGustasComentarios() {
		this.getMeGustaB().addClickListener(event ->{
			bMeGustaPulsado = bMeGustaPulsado == 0 ? 1 : 0;
			numeroMeGustas = bMeGustaPulsado == 1 ? ++numeroMeGustas : --numeroMeGustas;
			this.getNumeroMeGusta().setText(""+numeroMeGustas);			
		});
	}
}