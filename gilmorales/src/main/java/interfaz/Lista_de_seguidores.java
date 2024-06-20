package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaDeSeguidores;

public class Lista_de_seguidores extends VistaListaDeSeguidores{
	public Ver_seguidores _ver_seguidores;
	public Vector<Lista_de_seguidores_item> _item = new Vector<Lista_de_seguidores_item>();
	BDPrincipal bd = new BDPrincipal();
	Lista_de_seguidores_item ls ;
	
	public Lista_de_seguidores(Ver_seguidores interfaz) {
		this._ver_seguidores = interfaz;
		cargarSeguidores();
	}
	
	public void cargarSeguidores() {
		List<UsuarioRegistrado> seguidores = new ArrayList<UsuarioRegistrado>(this._ver_seguidores._ver_perfil_propio.user.seguidor.getCollection());
		
		if(seguidores != null) {
			this.getLayoutListaSeguidores().as(VerticalLayout.class).removeAll();
			this._item.clear();
			
			for(UsuarioRegistrado u : seguidores) {
				this.ls = new Lista_de_seguidores_item(u, this);
				this.getLayoutListaSeguidores().as(VerticalLayout.class).add(this.ls);
				this._item.add(this.ls);
			}
		}
		
	}
}