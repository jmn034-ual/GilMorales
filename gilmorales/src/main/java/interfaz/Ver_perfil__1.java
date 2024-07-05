package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;

import basededatos.iVer_perfil;
import vistas.VistaVerTendencias;

public class Ver_perfil__1 extends Ver_tendencias{
	
	
	public Denunciar_usuario denunciar;
	Dialog dialog;

	
	public Ver_perfil__1() {}
	
	public Ver_perfil__1(Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		// TODO Auto-generated constructor stub
	}

	public iVer_perfil _iVer_perfil;
	public Denunciar_usuario _denunciar_usuario;

	public void Denunciar_usuario(Object interfaz) {
		this.getBotonDenunciar().addClickListener(event -> {
			Ver_Perfil__2 aux = (Ver_Perfil__2) interfaz;
			this.denunciar = new Denunciar_usuario(aux);
			dialog = new Dialog(this.denunciar);
			dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
			dialog.setHeight("50%");
			dialog.setWidth("50%");
			this.denunciar.getBotonCancelar().addClickListener(event2 -> {
				dialog.close();
			});
			dialog.open();
		});
	}
}