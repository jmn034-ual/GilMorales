package interfaz;

import java.util.Vector;

public class Resultado_hashtags extends Lista_resultado {
	
	public Buscar_Hashtag _buscar_Hashtag;
	public Vector<Resultado_hashtags_item> _item = new Vector<Resultado_hashtags_item>();
	
	public Resultado_hashtags(String buscar, String filtro) {
		super(buscar, filtro);
		
	}

}