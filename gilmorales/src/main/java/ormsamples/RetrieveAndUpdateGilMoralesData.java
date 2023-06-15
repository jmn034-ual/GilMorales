/**
 * Licensee: Joaquín Morales Nieto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGilMoralesData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = bd_dcl.GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			bd_dcl.Publicacion bD_DCLPublicacion = bd_dcl.PublicacionDAO.loadPublicacionByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.PublicacionDAO.save(bD_DCLPublicacion);
			bd_dcl.UsuarioRegistrado bD_DCLUsuarioRegistrado = bd_dcl.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.UsuarioRegistradoDAO.save(bD_DCLUsuarioRegistrado);
			bd_dcl.UsuarioAdministrador bD_DCLUsuarioAdministrador = bd_dcl.UsuarioAdministradorDAO.loadUsuarioAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.UsuarioAdministradorDAO.save(bD_DCLUsuarioAdministrador);
			bd_dcl.Comentario bD_DCLComentario = bd_dcl.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.ComentarioDAO.save(bD_DCLComentario);
			bd_dcl.Denuncia bD_DCLDenuncia = bd_dcl.DenunciaDAO.loadDenunciaByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.DenunciaDAO.save(bD_DCLDenuncia);
			bd_dcl.Notificacion bD_DCLNotificacion = bd_dcl.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.NotificacionDAO.save(bD_DCLNotificacion);
			bd_dcl.Hashtag bD_DCLHashtag = bd_dcl.HashtagDAO.loadHashtagByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.HashtagDAO.save(bD_DCLHashtag);
			bd_dcl.UsuarioComercial bD_DCLUsuarioComercial = bd_dcl.UsuarioComercialDAO.loadUsuarioComercialByQuery(null, null);
			// Update the properties of the persistent object
			bd_dcl.UsuarioComercialDAO.save(bD_DCLUsuarioComercial);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Publicacion by PublicacionCriteria");
		bd_dcl.PublicacionCriteria bD_DCLPublicacionCriteria = new bd_dcl.PublicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLPublicacionCriteria.idPublicacion.eq();
		System.out.println(bD_DCLPublicacionCriteria.uniquePublicacion());
		
		System.out.println("Retrieving UsuarioRegistrado by UsuarioRegistradoCriteria");
		bd_dcl.UsuarioRegistradoCriteria bD_DCLUsuarioRegistradoCriteria = new bd_dcl.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLUsuarioRegistradoCriteria.ID.eq();
		System.out.println(bD_DCLUsuarioRegistradoCriteria.uniqueUsuarioRegistrado());
		
		System.out.println("Retrieving UsuarioAdministrador by UsuarioAdministradorCriteria");
		bd_dcl.UsuarioAdministradorCriteria bD_DCLUsuarioAdministradorCriteria = new bd_dcl.UsuarioAdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLUsuarioAdministradorCriteria.ID.eq();
		System.out.println(bD_DCLUsuarioAdministradorCriteria.uniqueUsuarioAdministrador());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		bd_dcl.ComentarioCriteria bD_DCLComentarioCriteria = new bd_dcl.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLComentarioCriteria.idComentario.eq();
		System.out.println(bD_DCLComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Denuncia by DenunciaCriteria");
		bd_dcl.DenunciaCriteria bD_DCLDenunciaCriteria = new bd_dcl.DenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLDenunciaCriteria.idDenuncia.eq();
		System.out.println(bD_DCLDenunciaCriteria.uniqueDenuncia());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		bd_dcl.NotificacionCriteria bD_DCLNotificacionCriteria = new bd_dcl.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLNotificacionCriteria.idNotificacion.eq();
		System.out.println(bD_DCLNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Hashtag by HashtagCriteria");
		bd_dcl.HashtagCriteria bD_DCLHashtagCriteria = new bd_dcl.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLHashtagCriteria.idHashtag.eq();
		System.out.println(bD_DCLHashtagCriteria.uniqueHashtag());
		
		System.out.println("Retrieving UsuarioComercial by UsuarioComercialCriteria");
		bd_dcl.UsuarioComercialCriteria bD_DCLUsuarioComercialCriteria = new bd_dcl.UsuarioComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//bD_DCLUsuarioComercialCriteria.ID.eq();
		System.out.println(bD_DCLUsuarioComercialCriteria.uniqueUsuarioComercial());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGilMoralesData retrieveAndUpdateGilMoralesData = new RetrieveAndUpdateGilMoralesData();
			try {
				retrieveAndUpdateGilMoralesData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGilMoralesData.retrieveByCriteria();
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
