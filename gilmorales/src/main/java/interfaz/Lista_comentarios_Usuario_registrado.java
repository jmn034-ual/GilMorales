package interfaz;

import java.util.Vector;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;

public class Lista_comentarios_Usuario_registrado extends Lista_Comentarios_Vista_Usuario_No_registrado {
	//	private button _comentarB;
	public Ver_comentarios_Usuario_Registrado _ver_comentarios__Usuario_Registrado_;
	public Vector<Lista_comentarios_Usuario_registrado_item> _item = new Vector<Lista_comentarios_Usuario_registrado_item>();
	iUsuario_Registrado bd = new BDPrincipal();
	
	public Lista_comentarios_Usuario_registrado() {
		
	}

}