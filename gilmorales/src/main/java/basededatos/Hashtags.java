package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import bd_dcl.GilMoralesPersistentManager;
import bd_dcl.Hashtag;
import bd_dcl.HashtagDAO;

public class Hashtags {
	public BDPrincipal _c_bd_hashtag;
	public Vector<Hashtag> _hashtag = new Vector<Hashtag>();

	public List cargarListaHashtags() {
		throw new UnsupportedOperationException();
	}

	public Hashtag cargarHashtag(int aIdHashtag, String aNombreHashstag) {
		throw new UnsupportedOperationException();
	}

	public List cargarListaHashtagsTOP() throws PersistentException {
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

	public List buscarHashtag(int aIdHashtag, String aNombreHashtag) {
		throw new UnsupportedOperationException();
	}

	public List cargarTendencias() {
		throw new UnsupportedOperationException();
	}
}