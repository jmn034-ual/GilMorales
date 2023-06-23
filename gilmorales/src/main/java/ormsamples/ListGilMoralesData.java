/**
 * Licensee: Joaquín Morales Nieto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListGilMoralesData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Publicacion...");
		bd_dcl.Publicacion[] bD_DCLPublicacions = bd_dcl.PublicacionDAO.listPublicacionByQuery(null, null);
		int length = Math.min(bD_DCLPublicacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLPublicacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioRegistrado...");
		bd_dcl.UsuarioRegistrado[] bD_DCLUsuarioRegistrados = bd_dcl.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
		length = Math.min(bD_DCLUsuarioRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLUsuarioRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioAdministrador...");
		bd_dcl.UsuarioAdministrador[] bD_DCLUsuarioAdministradors = bd_dcl.UsuarioAdministradorDAO.listUsuarioAdministradorByQuery(null, null);
		length = Math.min(bD_DCLUsuarioAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLUsuarioAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		bd_dcl.Comentario[] bD_DCLComentarios = bd_dcl.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(bD_DCLComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Denuncia...");
		bd_dcl.Denuncia[] bD_DCLDenuncias = bd_dcl.DenunciaDAO.listDenunciaByQuery(null, null);
		length = Math.min(bD_DCLDenuncias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLDenuncias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		bd_dcl.Notificacion[] bD_DCLNotificacions = bd_dcl.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(bD_DCLNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hashtag...");
		bd_dcl.Hashtag[] bD_DCLHashtags = bd_dcl.HashtagDAO.listHashtagByQuery(null, null);
		length = Math.min(bD_DCLHashtags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLHashtags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioComercial...");
		bd_dcl.UsuarioComercial[] bD_DCLUsuarioComercials = bd_dcl.UsuarioComercialDAO.listUsuarioComercialByQuery(null, null);
		length = Math.min(bD_DCLUsuarioComercials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(bD_DCLUsuarioComercials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Publicacion by Criteria...");
		bd_dcl.PublicacionCriteria bD_DCLPublicacionCriteria = new bd_dcl.PublicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLPublicacionCriteria.idPublicacion.eq();
		bD_DCLPublicacionCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.Publicacion[] bD_DCLPublicacions = bD_DCLPublicacionCriteria.listPublicacion();
		int length =bD_DCLPublicacions== null ? 0 : Math.min(bD_DCLPublicacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLPublicacions[i]);
		}
		System.out.println(length + " Publicacion record(s) retrieved."); 
		
		System.out.println("Listing UsuarioRegistrado by Criteria...");
		bd_dcl.UsuarioRegistradoCriteria bD_DCLUsuarioRegistradoCriteria = new bd_dcl.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLUsuarioRegistradoCriteria.ID.eq();
		bD_DCLUsuarioRegistradoCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.UsuarioRegistrado[] bD_DCLUsuarioRegistrados = bD_DCLUsuarioRegistradoCriteria.listUsuarioRegistrado();
		length =bD_DCLUsuarioRegistrados== null ? 0 : Math.min(bD_DCLUsuarioRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLUsuarioRegistrados[i]);
		}
		System.out.println(length + " UsuarioRegistrado record(s) retrieved."); 
		
		System.out.println("Listing UsuarioAdministrador by Criteria...");
		bd_dcl.UsuarioAdministradorCriteria bD_DCLUsuarioAdministradorCriteria = new bd_dcl.UsuarioAdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLUsuarioAdministradorCriteria.ID.eq();
		bD_DCLUsuarioAdministradorCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.UsuarioAdministrador[] bD_DCLUsuarioAdministradors = bD_DCLUsuarioAdministradorCriteria.listUsuarioAdministrador();
		length =bD_DCLUsuarioAdministradors== null ? 0 : Math.min(bD_DCLUsuarioAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLUsuarioAdministradors[i]);
		}
		System.out.println(length + " UsuarioAdministrador record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		bd_dcl.ComentarioCriteria bD_DCLComentarioCriteria = new bd_dcl.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLComentarioCriteria.idComentario.eq();
		bD_DCLComentarioCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.Comentario[] bD_DCLComentarios = bD_DCLComentarioCriteria.listComentario();
		length =bD_DCLComentarios== null ? 0 : Math.min(bD_DCLComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Denuncia by Criteria...");
		bd_dcl.DenunciaCriteria bD_DCLDenunciaCriteria = new bd_dcl.DenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLDenunciaCriteria.idDenuncia.eq();
		bD_DCLDenunciaCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.Denuncia[] bD_DCLDenuncias = bD_DCLDenunciaCriteria.listDenuncia();
		length =bD_DCLDenuncias== null ? 0 : Math.min(bD_DCLDenuncias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLDenuncias[i]);
		}
		System.out.println(length + " Denuncia record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		bd_dcl.NotificacionCriteria bD_DCLNotificacionCriteria = new bd_dcl.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLNotificacionCriteria.idNotificacion.eq();
		bD_DCLNotificacionCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.Notificacion[] bD_DCLNotificacions = bD_DCLNotificacionCriteria.listNotificacion();
		length =bD_DCLNotificacions== null ? 0 : Math.min(bD_DCLNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Hashtag by Criteria...");
		bd_dcl.HashtagCriteria bD_DCLHashtagCriteria = new bd_dcl.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLHashtagCriteria.idHashtag.eq();
		bD_DCLHashtagCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.Hashtag[] bD_DCLHashtags = bD_DCLHashtagCriteria.listHashtag();
		length =bD_DCLHashtags== null ? 0 : Math.min(bD_DCLHashtags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLHashtags[i]);
		}
		System.out.println(length + " Hashtag record(s) retrieved."); 
		
		System.out.println("Listing UsuarioComercial by Criteria...");
		bd_dcl.UsuarioComercialCriteria bD_DCLUsuarioComercialCriteria = new bd_dcl.UsuarioComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//bD_DCLUsuarioComercialCriteria.ID.eq();
		bD_DCLUsuarioComercialCriteria.setMaxResults(ROW_COUNT);
		bd_dcl.UsuarioComercial[] bD_DCLUsuarioComercials = bD_DCLUsuarioComercialCriteria.listUsuarioComercial();
		length =bD_DCLUsuarioComercials== null ? 0 : Math.min(bD_DCLUsuarioComercials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(bD_DCLUsuarioComercials[i]);
		}
		System.out.println(length + " UsuarioComercial record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGilMoralesData listGilMoralesData = new ListGilMoralesData();
			try {
				listGilMoralesData.listTestData();
				//listGilMoralesData.listByCriteria();
			}
			finally {
				bd_dcl.GilMoralesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
