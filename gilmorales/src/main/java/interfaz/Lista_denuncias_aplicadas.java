package interfaz;

import java.util.Vector;

public class Lista_denuncias_aplicadas extends Lista_denuncias {
	
	public Ver_denuncias_aplicadas _ver_denuncias_aplicadas;
	public Vector<Lista_denuncias_aplicadas_item> _item = new Vector<Lista_denuncias_aplicadas_item>();
	
	public Lista_denuncias_aplicadas(Ver_denuncias_aplicadas interfaz) {
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._ver_denuncias_aplicadas = interfaz;
	}
}