package interfaz;

import bd_dcl.Denuncia;

public class Lista_denuncias_aplicadas_item extends Lista_denuncias_item {
	

	public Lista_denuncias_aplicadas _lista_denuncias_aplicadas;
	
	public Lista_denuncias_aplicadas_item(Denuncia d, Lista_denuncias_aplicadas interfaz) {
		super(d);
		this._lista_denuncias_aplicadas = interfaz;
		this.Ver_perfil(this._lista_denuncias_aplicadas);
		this.getEstadoDenuncia().setText("Aplicada");
		Ver_Denuncia(this._lista_denuncias_aplicadas);

	}
}