package interfaz;

import java.util.Vector;

public class Lista_publicaciones__Usuario_Registrado_ extends Lista_Publicaciones__Usuario_no_registrado_ {
//	public Usuario_Registrado _usuario_Registrado;
	public Vector<Lista_publicaciones__Usuario_Registrado__item> _item = new Vector<Lista_publicaciones__Usuario_Registrado__item>();
	
	public Lista_publicaciones__Usuario_Registrado_(Usuario_No_Registrado unr) {
		super(unr);
	}
	public Lista_publicaciones__Usuario_Registrado_(Usuario_Registrado ur) {

	}

}