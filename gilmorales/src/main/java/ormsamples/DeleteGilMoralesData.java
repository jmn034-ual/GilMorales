/**
 * Licensee: Joaquín Morales Nieto(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteGilMoralesData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = bd_dcl.GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			bd_dcl.Publicacion bD_DCLPublicacion = bd_dcl.PublicacionDAO.loadPublicacionByQuery(null, null);
			// Delete the persistent object
			bd_dcl.PublicacionDAO.delete(bD_DCLPublicacion);
			bd_dcl.UsuarioRegistrado bD_DCLUsuarioRegistrado = bd_dcl.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Delete the persistent object
			bd_dcl.UsuarioRegistradoDAO.delete(bD_DCLUsuarioRegistrado);
			bd_dcl.UsuarioAdministrador bD_DCLUsuarioAdministrador = bd_dcl.UsuarioAdministradorDAO.loadUsuarioAdministradorByQuery(null, null);
			// Delete the persistent object
			bd_dcl.UsuarioAdministradorDAO.delete(bD_DCLUsuarioAdministrador);
			bd_dcl.Comentario bD_DCLComentario = bd_dcl.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			bd_dcl.ComentarioDAO.delete(bD_DCLComentario);
			bd_dcl.Denuncia bD_DCLDenuncia = bd_dcl.DenunciaDAO.loadDenunciaByQuery(null, null);
			// Delete the persistent object
			bd_dcl.DenunciaDAO.delete(bD_DCLDenuncia);
			bd_dcl.Notificacion bD_DCLNotificacion = bd_dcl.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			bd_dcl.NotificacionDAO.delete(bD_DCLNotificacion);
			bd_dcl.Hashtag bD_DCLHashtag = bd_dcl.HashtagDAO.loadHashtagByQuery(null, null);
			// Delete the persistent object
			bd_dcl.HashtagDAO.delete(bD_DCLHashtag);
			bd_dcl.UsuarioComercial bD_DCLUsuarioComercial = bd_dcl.UsuarioComercialDAO.loadUsuarioComercialByQuery(null, null);
			// Delete the persistent object
			bd_dcl.UsuarioComercialDAO.delete(bD_DCLUsuarioComercial);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGilMoralesData deleteGilMoralesData = new DeleteGilMoralesData();
			try {
				deleteGilMoralesData.deleteTestData();
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
