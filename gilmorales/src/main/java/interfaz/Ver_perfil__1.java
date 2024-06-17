package interfaz;

import basededatos.iVer_perfil;
import vistas.VistaVerTendencias;

public class Ver_perfil__1 extends Ver_tendencias{
	
	
	public Denunciar_usuario denunciar;
	
	public Ver_perfil__1() {}
	
	public Ver_perfil__1(Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		// TODO Auto-generated constructor stub
	}

	public iVer_perfil _iVer_perfil;
	public Denunciar_usuario _denunciar_usuario;

	public void Denunciar_usuario(Object interfaz) {
		Ver_perfil_publico aux = (Ver_perfil_publico) interfaz;
		this.denunciar = new Denunciar_usuario(aux);
		this.getBotonDenunciar().addClickListener(event -> {
			aux.getVaadinHorizontalLayout().removeAll();
			aux.getVaadinHorizontalLayout().add(denunciar);
		});
	}

	public void Videos() {
		throw new UnsupportedOperationException();
	}

	public void MeGustas() {
		throw new UnsupportedOperationException();
	}
}