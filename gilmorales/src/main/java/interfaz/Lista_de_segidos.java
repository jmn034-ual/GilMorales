package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaDeSeguidos;

public class Lista_de_segidos extends VistaListaDeSeguidos{
	public Ver_seguidos _ver_seguidos;
	public Vector<Lista_de_segidos_item> _item = new Vector<Lista_de_segidos_item>();
	BDPrincipal bd = new BDPrincipal();
	Lista_de_segidos_item lsi;
	
	public Lista_de_segidos(Ver_seguidos interfaz) {
		this._ver_seguidos = interfaz;
		cargarSeguidos();
	}
	
	public void cargarSeguidos() {
		List<UsuarioRegistrado> seguidos = new ArrayList<UsuarioRegistrado>(this._ver_seguidos._ver_perfil_propio.user.seguir.getCollection());
		
		if(seguidos != null) {
			this.getLayoutSeguidos().as(VerticalLayout.class).removeAll();
			this._item.clear();
			
			for(UsuarioRegistrado u : seguidos) {
				this.lsi = new Lista_de_segidos_item(u, this);
				this.getLayoutSeguidos().as(VerticalLayout.class).add(this.lsi);
				this._item.add(this.lsi);
			}
		}
		
	}
}