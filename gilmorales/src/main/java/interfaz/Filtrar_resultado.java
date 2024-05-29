package interfaz;

import vistas.VistaFiltrarResultado;

public class Filtrar_resultado extends VistaFiltrarResultado{
	public Lista_resultado _lista_resultado;
	public Buscar_Hashtag _buscar_Hashtag;
	public Buscar_Usuario _buscar_Usuario;
	
	public Filtrar_resultado(String filtro, String cadena) {
		if(filtro == "Usuarios") {
			Buscar_Usuario(cadena);
		}else if(filtro == "Hashtags") {
			Buscar_Hashtag(cadena);
		}else {
			Buscar_Usuario(cadena);
			Buscar_Hashtag(cadena);
		}
	}

	public void Buscar_Hashtag(String cadena) {
		throw new UnsupportedOperationException();
	}

	public void Buscar_Usuario(String cadena) {
		throw new UnsupportedOperationException();
	}
}