package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import bd_dcl.UsuarioComercial;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaResultado;

public class Lista_resultado extends VistaListaResultado{

	public static Realizar_busqueda _realizar_busqueda;
	public Vector<Lista_resultado_item> _item = new Vector<Lista_resultado_item>();
	public Filtrar_resultado _filtrar_resultado;
	BDPrincipal bd = new BDPrincipal();
	Lista_resultado_item item;

	public Lista_resultado(String buscar, String filtro, Realizar_busqueda _realizar_busqueda) {
		this._realizar_busqueda = _realizar_busqueda;
		Filtrar_resultado();
		carga_realizar_busqueda(buscar, filtro);
	}
	
	public void carga_realizar_busqueda(String buscar, String filtro){
			List<Object> resultado = bd.realizarBusqueda(buscar, filtro);
			this.getLayoutResultadoUsuario().as(VerticalLayout.class).removeAll();
			_item.clear();
			
			for (int i = 0; i < resultado.size(); i++) {				
				if (resultado.get(i) instanceof UsuarioRegistrado) {
					UsuarioRegistrado ur = bd.cargarUsuarioRegistrado(Integer.parseInt(resultado.get(i).toString()));
					item = new Resultado_usuarios_item(ur, this);
					this._realizar_busqueda.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).add(item);
	            } else if (resultado.get(i) instanceof Hashtag) {
	            	Hashtag h = bd.cargarHashtag(Integer.parseInt(resultado.get(i).toString()));
					item = new Resultado_hashtags_item(h, this);
					this._realizar_busqueda.getLayoutListaResultadoHashtags().as(VerticalLayout.class).add(item);
	            }else if(resultado.get(i) instanceof UsuarioComercial && this._realizar_busqueda._cabecera_Administrador != null){
					UsuarioComercial comercial = bd.cargarUsuarioComercial(Integer.parseInt(resultado.get(i).toString()));
	            	item = new Resultado_usuarios_item(comercial, this);
					this._realizar_busqueda.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).add(item);
	            }
				_item.add(item);
			}
	}
	
	public void Filtrar_resultado() {
		this._realizar_busqueda.select.addValueChangeListener(event -> {
			if(this._realizar_busqueda.select.getValue() == "Usuarios") {
				this._realizar_busqueda.getVaadinHorizontalLayout2().setVisible(true);
				this._realizar_busqueda.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(true);
				this._realizar_busqueda.getLayoutTituloHashtags().setVisible(false);
				this._realizar_busqueda.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(false);
				this._realizar_busqueda.getBarraHorizontal().setVisible(false);
			}else if(this._realizar_busqueda.select.getValue() == "Hashtags") {
				this._realizar_busqueda.getVaadinHorizontalLayout2().setVisible(false);
				this._realizar_busqueda.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(false);
				this._realizar_busqueda.getLayoutTituloHashtags().setVisible(true);
				this._realizar_busqueda.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(true);
				this._realizar_busqueda.getBarraHorizontal().setVisible(false);
			}else {
				this._realizar_busqueda.getVaadinHorizontalLayout2().setVisible(true);
				this._realizar_busqueda.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(true);
				this._realizar_busqueda.getLayoutTituloHashtags().setVisible(true);
				this._realizar_busqueda.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(true);
				this._realizar_busqueda.getBarraHorizontal().setVisible(true);
			}
		});
	}
}