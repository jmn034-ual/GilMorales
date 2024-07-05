package interfaz;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.crud.Crud;
import com.vaadin.flow.component.crud.CrudEditor;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;

import TikTok.Video;
import basededatos.BDPrincipal;
import bd_dcl.Comentario;
import bd_dcl.Denuncia;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import net.bytebuddy.asm.Advice.This;
import vistas.VistaListaDdenunciasAdministradorItem;
import vistas.VistaVerDenuncia;

public class Lista_denuncias_item extends VistaListaDdenunciasAdministradorItem {

	public Lista_denuncias _lista_denuncias;
	public Filtrar_denuncias _filtrar_denuncias;
	public Ver_perfil_Administrador _ver_perfil;
	UsuarioRegistrado denunciante;
	Denuncia denuncia;
	BDPrincipal bd = new BDPrincipal();
	int estadoInt = 0;
	boolean estadoBolean = false;
	Administrador admin;
	UsuarioRegistrado denunciado;
	Publicacion publiDenunciada;
	Comentario comentarioDenunciado;

	public Lista_denuncias_item(Denuncia denuncia, Filtrar_denuncias interfaz) {
		this.getStyle().set("width", "100%");
		this.denuncia =  this.bd.cargarDenuncia(denuncia.getIdDenuncia());
		this._filtrar_denuncias = interfaz;
		this.admin = this._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador._administrador;
		this.getNombreCompleto().setText(
				this.denuncia.getRealizadaPor().getNombre() + " " + this.denuncia.getRealizadaPor().getApellidos());
		this.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());
		this.getMotivoDenuncia().setText(this.denuncia.getMotivo());
		this.getVaadinAvatar().setImage(this.denuncia.getRealizadaPor().getFoto());
		denunciante = denuncia.getRealizadaPor();
	}

	public Lista_denuncias_item(Denuncia denuncia, Filtrar_denuncias filtrarInterfaz, Lista_denuncias interfaz) {
		this.getStyle().set("width", "100%");
		this.denuncia =  this.bd.cargarDenuncia(denuncia.getIdDenuncia());
		this._filtrar_denuncias = filtrarInterfaz;
		this.admin = this._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador._administrador;
		this._lista_denuncias = interfaz;
		this.getNombreCompleto().setText(
				this.denuncia.getRealizadaPor().getNombre() + " " + this.denuncia.getRealizadaPor().getApellidos());
		this.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());
		if (this.denuncia.getTipoEstado() == 0) {
			this.getEstadoDenuncia().setText("Pendiente");
		} else if (this.denuncia.getTipoEstado() == 1) {
			this.getEstadoDenuncia().setText("Aplicada");
		} else {
			this.getEstadoDenuncia().setText("Finalizada");
		}
		this.getMotivoDenuncia().setText(this.denuncia.getMotivo());
		this.getVaadinAvatar().setImage(this.denuncia.getRealizadaPor().getFoto());
		this.denunciante = this.denuncia.getRealizadaPor();
		this.Ver_perfil(null);
		Ver_Denuncia(this);
	}

	public void Ver_perfil(Object interfaz) {
		getNombreUsuario().addClickListener(event -> {
			Lista_denuncias_aplicadas auxAplicadas;
			Lista_denuncias_pendientes auxPendientes;
			Lista_denuncias_finalizadas auxFinalizadas;
			if (interfaz instanceof Lista_denuncias_aplicadas) {
				auxAplicadas = (Lista_denuncias_aplicadas) interfaz;
				_ver_perfil = new Ver_perfil_Administrador(
						auxAplicadas._ver_denuncias_aplicadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP,
						denunciante);
				auxAplicadas._ver_denuncias_aplicadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				auxAplicadas._ver_denuncias_aplicadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_perfil);
				} else if (interfaz instanceof Lista_denuncias_pendientes) {
				auxPendientes = (Lista_denuncias_pendientes) interfaz;
				_ver_perfil = new Ver_perfil_Administrador(
						auxPendientes._ver_denuncias_pendientes._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP,
						denunciante);
				auxPendientes._ver_denuncias_pendientes._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				auxPendientes._ver_denuncias_pendientes._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_perfil);
			} else if (interfaz instanceof Lista_denuncias_finalizadas) {
				auxFinalizadas = (Lista_denuncias_finalizadas) interfaz;
				_ver_perfil = new Ver_perfil_Administrador(
						auxFinalizadas._ver_denuncias_finalizadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP,
						denunciante);
				auxFinalizadas._ver_denuncias_finalizadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
				auxFinalizadas._ver_denuncias_finalizadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_perfil);
			} else {
				_ver_perfil = new Ver_perfil_Administrador(
						this._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP,
						denunciante);
				this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout()
						.as(VerticalLayout.class).removeAll();
				this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout()
						.as(VerticalLayout.class).add(_ver_perfil);
			}
		});
	}

	public void Ver_Denuncia(Object interfaz) {

		this.getVaadinHorizontalLayout().addClickListener(event -> {
			Dialog dialog = new Dialog();
			Label labelMotivo = new Label(this.denuncia.getMotivo());
			Label idDenuncia = new Label(this.denuncia.getIdDenuncia() + "");
			Label labelUsuario = new Label(this.denuncia.getRealizadaPor().getNombreUsuario());
			VerticalLayout content = new VerticalLayout(labelMotivo, idDenuncia, labelUsuario);
			content.setSpacing(false);
			content.setPadding(false);
			VistaVerDenuncia verDenuncia = new VistaVerDenuncia();
			verDenuncia.getIdDenuncia().setText(this.denuncia.getIdDenuncia() + "");
			if (this.denuncia.getTipoDenuncia() == 0)
				verDenuncia.getTipo().setText("Usuario");
			else if (this.denuncia.getTipoDenuncia() == 1)
				verDenuncia.getTipo().setText("Comentario");
			else
				verDenuncia.getTipo().setText("Publicación");
			verDenuncia.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());
			verDenuncia.getMotivo().setText(this.denuncia.getMotivo());
			verDenuncia.getExplicacion().setText(this.denuncia.getExplicacion());

			RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();

			radioGroup.setItems("Pendiente", "Aplicada", "Finalizada");
			verDenuncia.getEstado().as(VerticalLayout.class).add(radioGroup);

			if (this.denuncia.getTipoEstado() == 0) {
				radioGroup.setValue("Pendiente");
			} else if (this.denuncia.getTipoEstado() == 1) {
				radioGroup.setValue("Aplicada");
			} else {
				radioGroup.setValue("Finalizada");
			}

			dialog.add(verDenuncia);
			dialog.open();

			verDenuncia.getCancelar().addClickListener(close -> dialog.close());
			radioGroup.addValueChangeListener(estado -> {
				if (estado.getValue() == "Pendiente") {
					estadoInt = 0;
				} else if (estado.getValue() == "Aplicada") {
					estadoInt = 1;
				} else {
					radioGroup.setValue("Finalizada");
					estadoInt = 2;
				}
				estadoBolean = true;
			});

			verDenuncia.getGuardar().addClickListener(guardar -> {
				if (estadoBolean) {
					this.denuncia = this.bd.actualizarDenuncia(this.denuncia.getIdDenuncia(), estadoInt);
					dialog.close();

					Lista_denuncias_pendientes pendientes = null;
					Lista_denuncias_aplicadas aplicadas = null;
					Lista_denuncias_finalizadas finalizadas = null;
					if (interfaz instanceof Lista_denuncias_pendientes) {
						pendientes = (Lista_denuncias_pendientes) interfaz;
						pendientes.cargarDenunciasPendientes();
					} else if (interfaz instanceof Lista_denuncias_aplicadas) {
						aplicadas = (Lista_denuncias_aplicadas) interfaz;
						aplicadas.cargarDenunciasAplicadas();
					} else if (interfaz instanceof Lista_denuncias_finalizadas) {
						finalizadas = (Lista_denuncias_finalizadas) interfaz;
						finalizadas.cargarDenunciasFinalizadas();
					} else {
						this._filtrar_denuncias.cargarDenuncias();
					}
				}
			});
			verDenuncia.getBotonVer().addClickListener(ver -> {
				origenDenuncia();
				dialog.close();
			});
		});
		// Falta realizar la forma para ver la publicacion, comentario o usuario de la
		// denuncia
	}
	
	public void origenDenuncia() {
		Object origen = this.bd.origenDenuncia(this.denuncia.getIdDenuncia());
		Ver_publicacion_Administrador aux = null;
		if (origen instanceof UsuarioRegistrado) {
			this.denunciado = (UsuarioRegistrado) origen;
			this.admin.getVaadinHorizontalLayout().removeAll();
			this.admin.getVaadinHorizontalLayout().add(new Ver_perfil_Administrador(this.admin._cabecera_Administrador.cabeceraTOP, this.denunciado));

		}else if (origen instanceof Comentario) {
			this.comentarioDenunciado = (Comentario) origen;
			this.admin.getVaadinHorizontalLayout().removeAll();
			aux = new Ver_publicacion_Administrador(this.comentarioDenunciado.getComentadoEn(), this.admin);
			this.admin.getVaadinHorizontalLayout().add(new Ver_comentarios_Administrador(this.comentarioDenunciado.getComentadoEn(), aux));

		}else {
			this.publiDenunciada = (Publicacion) origen;
			aux = new Ver_publicacion_Administrador(this.publiDenunciada, this.admin);
			this.admin.getVaadinHorizontalLayout().removeAll();
			this.admin.getVaadinHorizontalLayout().add(aux);
		}
		
	}
}