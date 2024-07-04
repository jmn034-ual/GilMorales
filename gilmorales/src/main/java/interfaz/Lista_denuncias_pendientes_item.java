package interfaz;

import bd_dcl.Denuncia;

public class Lista_denuncias_pendientes_item extends Lista_denuncias_item {

	public Lista_denuncias_pendientes _lista_denuncias_pendientes;
	
	public Lista_denuncias_pendientes_item(Denuncia d, Filtrar_denuncias filtrarInterfaz,Lista_denuncias_pendientes interfaz) {
		super(d, filtrarInterfaz);
		this._lista_denuncias_pendientes = interfaz;
		this.Ver_perfil(this._lista_denuncias_pendientes);
		this.getEstadoDenuncia().setText("Pendiente");
		Ver_Denuncia(this._lista_denuncias_pendientes);
	}
	
}