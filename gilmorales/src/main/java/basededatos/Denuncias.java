package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.Denuncia;
import bd_dcl.DenunciaDAO;
import bd_dcl.GilMoralesPersistentManager;

public class Denuncias {
	public BDPrincipal _c_bd_denuncia;
	public Vector<Denuncia> _denuncia = new Vector<Denuncia>();

	public List cargarDenuncias() throws PersistentException {
		List<Denuncia> denuncias = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			denuncias = DenunciaDAO.queryDenuncia(null, null);
		}catch(Exception e){
			t.rollback();
		}
		return denuncias;	
	}

	public void denunciarPublicacion(int aIdPublicacion, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setNombreUsuario(aNombreUsuarioDenunciante);
			denuncia.setTipoDenuncia(2);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			denuncia.setCodigoEmpleado(0);
			DenunciaDAO.save(denuncia);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public void denunciarUsuario(String aNombreUsuarioDenunciado, String aNombreUsuarioDenunciante, String aMotivo, int aUsuarioDenuncianteID, int aUsuarioDenunciadoID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion("");
			denuncia.setMotivo(aMotivo);
			denuncia.setNombreUsuario(aNombreUsuarioDenunciado);
			denuncia.setTipoDenuncia(0);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			denuncia.setCodigoEmpleado(0);
			DenunciaDAO.save(denuncia);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();	}

	public void denunciarComentario(int aIdComentario, String aNombreUsuarioDenunciante, String aMotivo, String aExplicacion, int aUsuarioID) throws PersistentException {
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			Denuncia denuncia = DenunciaDAO.createDenuncia();
			denuncia.setExplicacion(aExplicacion);
			denuncia.setMotivo(aMotivo);
			denuncia.setNombreUsuario(aNombreUsuarioDenunciante);
			denuncia.setTipoDenuncia(1);
			denuncia.setTipoEstado(0);
			denuncia.setAtendida(null);
			denuncia.setCodigoEmpleado(0);
			DenunciaDAO.save(denuncia);
		}catch(Exception e){
			t.rollback();
		}
		GilMoralesPersistentManager.instance().disposePersistentManager();
	}

	public List filtrarDenuncias(String aFiltro) throws PersistentException {
		List<Denuncia> denuncias = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			denuncias = DenunciaDAO.queryDenuncia(null, aFiltro);
		}catch(Exception e){
			t.rollback();
		}
		return denuncias;
	}
}