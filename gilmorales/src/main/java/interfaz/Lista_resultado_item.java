package interfaz;

import bd_dcl.Hashtag;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaResultadoItem;

public class Lista_resultado_item extends VistaListaResultadoItem{
	public Lista_resultado _lista_resultado;
	public Ver_Perfil__2 _ver_perfil;
	public Ver_hashtag _ver_hashtag;
	
	public Lista_resultado_item(Object o) {
		this.getBotonNombreUsuario().setText(((UsuarioRegistrado) o).getNombre());
		this.getVaadinHorizontalLayout1().setVisible(false);		
	}

	public Lista_resultado_item(Hashtag h) {
		this.getBotonHashtag().setText(h.getNombreHashtag());
		this.getVaadinHorizontalLayout().setVisible(false);		
	}
	
	public void Ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Ver_hashtag() {
		throw new UnsupportedOperationException();
	}
}