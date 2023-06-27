package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import TikTok.Video;
import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
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
	Usuario_Registrado ur;
	iUsuario_Registrado bd = new BDPrincipal();

	public Lista_publicaciones__Usuario_Registrado__item(Publicacion publicacion, Usuario_Registrado ur) {
		super();
		this.ur = ur;
		this.publicacion = publicacion;
		this.getLayoutBotonesUsuarioR().setVisible(true);
		this.getLabelGeolocalizacion().setText(publicacion.getLocalizacion());
		this.getLayoutVideo().as(VerticalLayout.class).add(new Video(this.publicacion.getVideo()));
		this.getVaadinButton().setVisible(true);
		this.getLabelMeGustas().setVisible(false);
		this.getLabelDescripcion().setText(this.publicacion.getDescripcion());
		this.getLabelNumMeGustas().setText(this.publicacion.getNumMeGustas()+"");
		this.getLabelNumComentarios().setText(this.publicacion.getNumComentarios()+"");
		this.getLayoutComentar().setVisible(false);
		Dar_me_gusta_publicacion();
		Ver_comentarios__Usuario_No_registrado_();
		mostrarDatosUsuario();
		if(this.publicacion.getPerteneceA() != null) {
			Ver_perfil();	
			Seguir();
		}else {
			this.getBotonNombreUsuario().setDisableOnClick(false);
		}
	}
	
	public void Ver_publicacion_ajena() {
		throw new UnsupportedOperationException();
	}

	public void Seguir() {
		this.getBotonSeguir().addClickListener(event -> {
			this.bd.seguirUsuario(this.publicacion.getPerteneceA().getNombreUsuario(), this.ur.ur.getNombreUsuario(),
					this.publicacion.getPerteneceA().getID(), this.ur.ur.getID());
		});
	}

	public void Dar_me_gusta_publicacion() {
		this.NumeroMeGustas();
	}

	public void Denunciar_publicacion() {
		throw new UnsupportedOperationException();
	}

	public void Comentar() {
		
	}
}