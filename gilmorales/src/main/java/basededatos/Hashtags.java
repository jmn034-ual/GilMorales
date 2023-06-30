package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.HashtagDAO;
import bd_dcl.Publicacion;
import bd_dcl.UsuarioRegistrado;
import bd_dcl.UsuarioRegistradoDAO;

public class Hashtags {
	public BDPrincipal _c_bd_hashtag;
	public Vector<Hashtag> _hashtag = new Vector<Hashtag>();

	public List<Hashtag> cargarListaHashtags() throws PersistentException {
		List<Hashtag> hashtags = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			hashtags = HashtagDAO.queryHashtag(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return hashtags;
	}

	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag) throws PersistentException {
		Hashtag hashtag = null;
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			hashtag = HashtagDAO.loadHashtagByORMID(aIdHashtag);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return hashtag;
	}

	public List<Hashtag> cargarListaHashtagsTOP() throws PersistentException {
		List<Hashtag> hashtagsTop = new ArrayList<Hashtag>();

		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<Hashtag> hashtags = HashtagDAO.queryHashtag(null, "Hashtag.numVisualizaciones DESC");
			if(!hashtags.isEmpty()) {
				for(int i = 0; i < hashtags.size() && i < 5 ; i++) {
					hashtagsTop.add(hashtags.get(i));
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return hashtagsTop;
	}

	public List<Hashtag> buscarHashtag(String aNombreHashtag) throws PersistentException {
		if(aNombreHashtag == "") return null;
		List<Hashtag> hashtagsCoincidentes = new ArrayList<Hashtag>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<Hashtag> lista = HashtagDAO.queryHashtag(null, null);
			for(Hashtag h : lista) {
				if(h.getNombreHashtag().equals(aNombreHashtag) || h.getNombreHashtag().startsWith(aNombreHashtag.substring(0, 3))
						|| h.getNombreHashtag().startsWith(aNombreHashtag.substring(0, 2))) {
					hashtagsCoincidentes.add(h);
				}
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}
		return hashtagsCoincidentes;
	}

	public List<Hashtag> cargarTendencias() throws PersistentException {
		List<Hashtag> tendencias = new ArrayList<Hashtag>();
		PersistentTransaction t = GilMoralesPersistentManager.instance().getSession().beginTransaction();
		try {
			List<Hashtag> hashtags = HashtagDAO.queryHashtag(null, "Hashtag.numVisualizaciones DESC");
			if(!hashtags.isEmpty()) {
				for(int i = 0; i < hashtags.size() && i < 10 ; i++) {
					tendencias.add(hashtags.get(i));
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return tendencias;
	}
}