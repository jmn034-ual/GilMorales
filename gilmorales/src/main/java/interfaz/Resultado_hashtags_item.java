package interfaz;

public class Resultado_hashtags_item extends Lista_resultado_item {
	
	public Resultado_hashtags _resultado_hashtags;
	public Ver_hashtag _ver_hashtag;
	
	public Resultado_hashtags_item(Object o, Lista_resultado resultado) {
		super(o, resultado);
		this._ver_hashtag = new Ver_hashtag(hashtag, resultado);
	}
}