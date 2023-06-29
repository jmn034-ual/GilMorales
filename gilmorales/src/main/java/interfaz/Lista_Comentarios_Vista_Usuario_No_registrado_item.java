package interfaz;

import bd_dcl.Comentario;
import vistas.VistaListaComentariosUsuarioNoRegistradoItem;

public class Lista_Comentarios_Vista_Usuario_No_registrado_item extends VistaListaComentariosUsuarioNoRegistradoItem{
//	private button _verPerfilB;
//	private ImageIcon _usuarioIcono;
//	private Label _comentarioL;
//	private int _numeroComentarios;
//	private Label _numeroComentariosL;
	private int numeroMeGustas = Integer.parseInt(this.getNumeroMeGusta().getText());
	private int bMeGustaPulsado = 0;
	public Lista_Comentarios_Vista_Usuario_No_registrado listaComentariosUNR = new Lista_Comentarios_Vista_Usuario_No_registrado();
	public Ver_perfil_publico ver_perfil;
	private Usuario_No_Registrado unrInterfaz;
	Comentario comentario;

	public Lista_Comentarios_Vista_Usuario_No_registrado_item(Usuario_No_Registrado unr, Comentario comentario) {
		this.getStyle().set("width", "100%");
    	this.getStyle().set("height", "100%");
		this.getFotoPerfil().setImage("icons/icon.png");
		this.getNombreUsuario().setText("NombreUsuario");
		this.getComentarioL().setText("Este es un comentaio de prueba...");
		this.getNumeroMeGusta().setText("0");
		this.getMeGustaL().setText("Me Gustas");
		this.unrInterfaz = unr;
		this.comentario = comentario;
		MeGustasComentarios();
		Ver_perfil();
	}
	
	public void Ver_perfil() {
		this.ver_perfil = new Ver_perfil_publico(comentario.getEsComentadoPor());
		this.getNombreUsuario().addClickListener(event ->{
			unrInterfaz.getLayoutListaPublicaciones().setVisible(false);
			unrInterfaz.cabeceraUNR._cabecera_TOP.setVisible(false);
			unrInterfaz.getVaadinHorizontalLayout().remove(unrInterfaz.getVaadinHorizontalLayout().getComponentAt(0));
			unrInterfaz.getVaadinHorizontalLayout().add(ver_perfil);
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