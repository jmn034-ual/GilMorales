package interfaz;

import bd_dcl.Denuncia;

public class Lista_denuncias_finalizadas_item extends Lista_denuncias_item {

	public Lista_denuncias_finalizadas _lista_denuncias_finalizadas;

	public Lista_denuncias_finalizadas_item(Denuncia d, Filtrar_denuncias filtrarInterfaz, Lista_denuncias_finalizadas interfaz) {
		super(d, filtrarInterfaz);
		this._lista_denuncias_finalizadas = interfaz;
		this.Ver_perfil(this._lista_denuncias_finalizadas);
		this.getEstadoDenuncia().setText("Finalizada");
		Ver_Denuncia(this._lista_denuncias_finalizadas );
		Ver_perfil(this._lista_denuncias_finalizadas);
	}

}