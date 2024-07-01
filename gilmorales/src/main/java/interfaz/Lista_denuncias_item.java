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
import bd_dcl.Denuncia;
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

	
	public Lista_denuncias_item(Denuncia d) {
		this.getStyle().set("width", "100%");
		this.denuncia = d;
		this.getNombreCompleto().setText(this.denuncia.getRealizadaPor().getNombre() + " " + this.denuncia.getRealizadaPor().getApellidos());
		this.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());		
		this.getMotivoDenuncia().setText(this.denuncia.getMotivo());
		this.getVaadinAvatar().setImage(this.denuncia.getRealizadaPor().getFoto());
		denunciante = d.getRealizadaPor();
	}
	
	public Lista_denuncias_item(Denuncia denuncia, Lista_denuncias interfaz) {
		this.getStyle().set("width", "100%");
		this.denuncia = denuncia;
		this._lista_denuncias = interfaz;
		this.getNombreCompleto().setText(this.denuncia.getRealizadaPor().getNombre() + " " + this.denuncia.getRealizadaPor().getApellidos());
		this.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());
		if(this.denuncia.getTipoEstado() == 0) {
			this.getEstadoDenuncia().setText("Pendiente");
		} else if(this.denuncia.getTipoEstado() == 1) {
			this.getEstadoDenuncia().setText("Aplicada");
		}else {
			this.getEstadoDenuncia().setText("Finalizada");
		}
		this.getMotivoDenuncia().setText(this.denuncia.getMotivo());
		this.getVaadinAvatar().setImage(this.denuncia.getRealizadaPor().getFoto());
		this.denunciante = this.denuncia.getRealizadaPor();
		this.Ver_perfil(null);
		Ver_Denuncia(this);
	}
	

	public void Ver_perfil(Object interfaz) {
		Lista_denuncias_aplicadas auxAplicadas;
		Lista_denuncias_pendientes auxPendientes;
		Lista_denuncias_finalizadas auxFinalizadas;
		if(interfaz instanceof Lista_denuncias_aplicadas) {
			auxAplicadas = (Lista_denuncias_aplicadas) interfaz;
			_ver_perfil = new Ver_perfil_Administrador( auxAplicadas._ver_denuncias_aplicadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP, denunciante);
		}else if (interfaz instanceof Lista_denuncias_pendientes){
			auxPendientes = (Lista_denuncias_pendientes) interfaz;
			_ver_perfil = new Ver_perfil_Administrador( auxPendientes._ver_denuncias_pendientes._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP, denunciante);
		}else if(interfaz instanceof Lista_denuncias_finalizadas) {
			auxFinalizadas = (Lista_denuncias_finalizadas) interfaz;
			_ver_perfil = new Ver_perfil_Administrador( auxFinalizadas._ver_denuncias_finalizadas._filtrar_denuncias._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP, denunciante);
		}
		else
			_ver_perfil = new Ver_perfil_Administrador( this._lista_denuncias._ver_denuncias._gestionar_denuncias._cabecera_Administrador.cabeceraTOP, denunciante);
		getNombreUsuario().addClickListener(event->{
			this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).removeAll();
			this._lista_denuncias._ver_denuncias._gestionar_denuncias.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_perfil);
		});
	}
	
	public void Ver_Denuncia(Object interfaz) {
		
		this.getVaadinHorizontalLayout().addClickListener(event ->{
			Dialog dialog = new Dialog();
			Label labelMotivo = new Label(this.denuncia.getMotivo());
			Label idDenuncia = new Label(this.denuncia.getIdDenuncia()+"");
			Label labelUsuario = new Label(this.denuncia.getRealizadaPor().getNombreUsuario());
			VerticalLayout content = new VerticalLayout(labelMotivo, idDenuncia, labelUsuario);
			content.setSpacing(false);
			content.setPadding(false);
			VistaVerDenuncia verDenuncia = new VistaVerDenuncia();
			verDenuncia.getIdDenuncia().setText(this.denuncia.getIdDenuncia()+"");
			if(this.denuncia.getTipoDenuncia() == 0)
				verDenuncia.getTipo().setText("Usuario");
			else if(this.denuncia.getTipoDenuncia() == 1)
				verDenuncia.getTipo().setText("Comentario");
			else
				verDenuncia.getTipo().setText("Publicación");
			verDenuncia.getNombreUsuario().setText(this.denuncia.getRealizadaPor().getNombreUsuario());
			verDenuncia.getMotivo().setText(this.denuncia.getMotivo());
			verDenuncia.getExplicacion().setText(this.denuncia.getExplicacion());
			
			RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();

			radioGroup.setItems("Pendiente", "Aplicada", "Finalizada");
			verDenuncia.getEstado().as(VerticalLayout.class).add(radioGroup);
			
			if(this.denuncia.getTipoEstado() == 0) {
				radioGroup.setValue("Pendiente");
			}else if(this.denuncia.getTipoEstado() == 1) {
				radioGroup.setValue("Aplicada");
			}else {
				radioGroup.setValue("Finalizada");
			}
			
			dialog.add(verDenuncia);
			dialog.open();
			
			verDenuncia.getCancelar().addClickListener(close -> dialog.close());
			radioGroup.addValueChangeListener(estado -> {
				if(estado.getValue() == "Pendiente") {
					estadoInt = 0;
				}else if(estado.getValue() == "Aplicada") {
					estadoInt = 1;
				}else {
					radioGroup.setValue("Finalizada");
					estadoInt = 2;
				}
				estadoBolean = true;
			});
			
			verDenuncia.getGuardar().addClickListener(guardar -> {
				if(estadoBolean) {
					this.denuncia = bd.actualizarDenuncia(this.denuncia.getIdDenuncia(), estadoInt);
					dialog.close();
					
					Lista_denuncias_pendientes pendientes = null;
					Lista_denuncias_aplicadas aplicadas = null;
					Lista_denuncias_finalizadas finalizadas = null;
					if(interfaz instanceof Lista_denuncias_pendientes) {
						pendientes = (Lista_denuncias_pendientes) interfaz;
						pendientes.cargarDenunciasPendientes();
					}else if(interfaz instanceof Lista_denuncias_aplicadas) {
						aplicadas = (Lista_denuncias_aplicadas) interfaz;
						aplicadas.cargarDenunciasAplicadas();
					}else if(interfaz instanceof Lista_denuncias_finalizadas) {						
						finalizadas = (Lista_denuncias_finalizadas) interfaz;
						finalizadas.cargarDenunciasFinalizadas();
					}else {
						_lista_denuncias.cargarDenuncias();						
					}
				}
			});
		});
		//Falta realizar la forma para ver la publicacion, comentario o usuario de la denuncia
	}
}