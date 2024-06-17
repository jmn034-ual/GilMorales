 package interfaz;

import bd_dcl.UsuarioRegistrado;

public class Ver_Perfil__2 extends Ver_perfil__1 {

	public Lista_Top_Comentarios_Usuario_No_Registrado_item _lista_Top_Comentarios__Usuario_No_Registrado_;
	public Lista_de_seguidores_item _lista_de_seguidores;
	public Lista_de_segidos_item _lista_de_segidos;
	public Lista_Publicaciones_Usuario_no_registrado_item _publicaciones__Usuario_no_registrado_;
	public Lista_publicaciones_Usuario_Registrado_item publicaciones_Usuario_Registrado;
	public Top_usuarios_item _top_usuarios;
	public Resultado_usuarios_item _resultado_usuarios;
	public Ver_publicacion_ajena _ver_publicacion_ajena;
	public Publicaciones_hashtag_item _publicaciones_hashtag;
	public Lista_usuarios_registrados_item _lista_usuarios_registrados;
	public Notificaciones_comun _notificaciones__comun_;
	public Ver_comentarios _ver_comentarios;
	public Lista_Comentarios_Vista_Usuario_No_registrado_item _lista_Comentarios__Vista_Usuario_No_registrado_;
	public Lista_Me_Gustas_Publicacion_item _lista_Me_Gustas_Publicacion;
	public Lista_resultado_item _lista_resultado;
	public Lista_denuncias_item _lista_denuncias;
	public Lista_Publicaciones_Administrador_item _lista_Publicaciones__Administrador_;
	public 	UsuarioRegistrado user;
	
	public Ver_Perfil__2() {}
	
	public Ver_Perfil__2(Cabecera_TOP cabecera_TOP) {
		super(cabecera_TOP);
		// TODO Auto-generated constructor stub
	}


	protected void asignarInterfaz(Object interfaz) {
		if(interfaz instanceof Lista_Top_Comentarios_Usuario_No_Registrado_item) {
			this._lista_Top_Comentarios__Usuario_No_Registrado_ = (Lista_Top_Comentarios_Usuario_No_Registrado_item) interfaz;
//			this.user = this._lista_Top_Comentarios__Usuario_No_Registrado_._lista_Top_Comentarios__Usuario_No_Registrado_.
		}else if (interfaz instanceof Lista_de_seguidores_item) {
			this._lista_de_seguidores = (Lista_de_seguidores_item) interfaz;
		}else if (interfaz instanceof Lista_de_segidos_item) {
			this._lista_de_segidos = (Lista_de_segidos_item) interfaz;
		}else if (interfaz instanceof Top_usuarios_item) {
			this._top_usuarios = (Top_usuarios_item) interfaz;
//			this.user = this._top_usuarios._top_usuarios._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz.ur;
		}else if (interfaz instanceof Resultado_usuarios_item) {
			this._resultado_usuarios = (Resultado_usuarios_item) interfaz;
		}else if (interfaz instanceof Ver_publicacion_ajena) {
			this._ver_publicacion_ajena = (Ver_publicacion_ajena) interfaz;
		}else if (interfaz instanceof Lista_usuarios_registrados_item) {
			this._lista_usuarios_registrados = (Lista_usuarios_registrados_item) interfaz;
			if(this._lista_usuarios_registrados._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado != null)
				this.user = this._lista_usuarios_registrados._lista_usuarios_registrados._ver_lista_usuarios_registrados._cabecera_TOP._cabecera_Usuario_Registrado.urInterfaz.ur;
		}else if (interfaz instanceof Notificaciones_comun) {
			this._notificaciones__comun_ = (Notificaciones_comun) interfaz;
		}else if (interfaz instanceof Ver_comentarios) {
			this._ver_comentarios = (Ver_comentarios) interfaz;
		}else if (interfaz instanceof Lista_Comentarios_Vista_Usuario_No_registrado_item) {
			this._lista_Comentarios__Vista_Usuario_No_registrado_ = (Lista_Comentarios_Vista_Usuario_No_registrado_item) interfaz;
		}else if (interfaz instanceof Lista_Me_Gustas_Publicacion_item) {
			this._lista_Me_Gustas_Publicacion = (Lista_Me_Gustas_Publicacion_item) interfaz;
		}else if (interfaz instanceof Lista_resultado_item) {
			this._lista_resultado = (Lista_resultado_item) interfaz;
		}else if (interfaz instanceof Lista_denuncias_item) {
			this._lista_denuncias = (Lista_denuncias_item) interfaz;
		}else if (interfaz instanceof Lista_Publicaciones_Administrador_item) {
			this._lista_Publicaciones__Administrador_ = (Lista_Publicaciones_Administrador_item) interfaz;
		}else if (interfaz instanceof Lista_Publicaciones_Usuario_no_registrado_item) {
			this._publicaciones__Usuario_no_registrado_ = (Lista_Publicaciones_Usuario_no_registrado_item) interfaz;
			if(this._publicaciones__Usuario_no_registrado_._publicaciones__Usuario_no_registrado_ != null)
				this.cabecera_top = this._publicaciones__Usuario_no_registrado_._publicaciones__Usuario_no_registrado_.unr.cabeceraUNR._cabecera_TOP;
//			else
//				this.cabecera_top = this._publicaciones__Usuario_registrado_._publicaciones__Usuario_no_registrado_.unr.cabeceraUNR._cabecera_TOP;
				//Tengo que comprobar el usuario registrado

		} else if(interfaz instanceof Lista_publicaciones_Usuario_Registrado_item){
			this.publicaciones_Usuario_Registrado = (Lista_publicaciones_Usuario_Registrado_item) interfaz;
			this.user = publicaciones_Usuario_Registrado._lista_publicaciones__Usuario_Registrado_.urInterfaz.ur;
			System.out.println("User es: " + this.user);
		}else if(interfaz instanceof Publicaciones_hashtag_item) {
			this._publicaciones_hashtag = (Publicaciones_hashtag_item) interfaz;
		}
	}
	
	
}