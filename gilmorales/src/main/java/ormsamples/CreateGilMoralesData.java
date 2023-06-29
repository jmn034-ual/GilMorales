/**
 * Licensee: Jmn034(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateGilMoralesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = bd_dcl.GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			bd_dcl.Publicacion bD_DCLPublicacion = bd_dcl.PublicacionDAO.createPublicacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene, publicacionDenunciadaPor, perteneceA, gustaA, tieneComentarios, numVisualizaciones, numMeGustas, numComentarios, esPublicada, visualizadaPor
			bd_dcl.PublicacionDAO.save(bD_DCLPublicacion);
			bd_dcl.UsuarioRegistrado bD_DCLUsuarioRegistrado = bd_dcl.UsuarioRegistradoDAO.createUsuarioRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realizaDenuncia, visualiza, denucia, daMeGustaComentario, seguir, comenta, denunciaComentarioUR, denuciaPublicacion, recibe, publica, daMeGustaPublicacion, esDenunciado, seguidor, privacidad, nombreUsuario
			bd_dcl.UsuarioRegistradoDAO.save(bD_DCLUsuarioRegistrado);
			bd_dcl.UsuarioAdministrador bD_DCLUsuarioAdministrador = bd_dcl.UsuarioAdministradorDAO.createUsuarioAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gestiona
			bd_dcl.UsuarioAdministradorDAO.save(bD_DCLUsuarioAdministrador);
			bd_dcl.Comentario bD_DCLComentario = bd_dcl.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gustaA, esComentadoPor, denunciaDe, numeroMeGustas, comentadoEn, denunciadoPor
			bd_dcl.ComentarioDAO.save(bD_DCLComentario);
			bd_dcl.Denuncia bD_DCLDenuncia = bd_dcl.DenunciaDAO.createDenuncia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipoEstado, tipoDenuncia, atendida, realizadaPor
			bd_dcl.DenunciaDAO.save(bD_DCLDenuncia);
			bd_dcl.Notificacion bD_DCLNotificacion = bd_dcl.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : IDUsuarioNotifica, tipoNotificacion, enviadaA
			bd_dcl.NotificacionDAO.save(bD_DCLNotificacion);
			bd_dcl.Hashtag bD_DCLHashtag = bd_dcl.HashtagDAO.createHashtag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aparece, numVisualizaciones
			bd_dcl.HashtagDAO.save(bD_DCLHashtag);
			bd_dcl.UsuarioComercial bD_DCLUsuarioComercial = bd_dcl.UsuarioComercialDAO.createUsuarioComercial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denunciaComentarioUC, publica, nombreUsuarioComercial
			bd_dcl.UsuarioComercialDAO.save(bD_DCLUsuarioComercial);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGilMoralesData createGilMoralesData = new CreateGilMoralesData();
			try {
				createGilMoralesData.createTestData();
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
