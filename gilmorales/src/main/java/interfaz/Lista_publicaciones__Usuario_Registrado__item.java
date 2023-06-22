package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

import bd_dcl.Publicacion;

public class Lista_publicaciones__Usuario_Registrado__item extends Lista_Publicaciones__Usuario_no_registrado__item {

	//	private Button _seguirB;
//	private Button _denunciarB;
//	private Button _dar_me_gusta_publicacionB;
//	private Button _comentarB;
//	private TextField _comentarioTF;
//	private Button _verPubliacionB;
	public Lista_publicaciones__Usuario_Registrado_ _lista_publicaciones__Usuario_Registrado_;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Denunciar_publicacion _denunciar_publicacion;

	public Lista_publicaciones__Usuario_Registrado__item(Publicacion publicacion, Usuario_No_Registrado unr) {
		super(publicacion, unr);
		// TODO Auto-generated constructor stub
	}
	
	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}

	public void Seguir() {
		throw new UnsupportedOperationException();
	}

	public void Dar_me_gusta_publicacion() {
		throw new UnsupportedOperationException();
	}

	public void Denunciar_publicacion() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		
	}
}