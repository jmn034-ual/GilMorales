package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import bd_dcl.Hashtag;
import bd_dcl.UsuarioRegistrado;
import vistas.VistaListaResultado;

public class Lista_resultado extends VistaListaResultado{
	private Label _filtrarL;
	private ComboBox _filtrarCB;
	private Label _usuariosL;
	private Label _hashtagsL;
	public static Realizar_busqueda _realizar_busqueda;
	public Vector<Lista_resultado_item> _item = new Vector<Lista_resultado_item>();
	public Filtrar_resultado _filtrar_resultado;
	iUsuario_Registrado bd = new BDPrincipal();
	Lista_resultado_item item;
	Realizar_busqueda rb;

	public Lista_resultado(String buscar, String filtro, Realizar_busqueda rb) {
		this.rb = rb;
		Filtrar_resultado();
		cargarBusqueda(buscar, filtro);
	}
	
	public void cargarBusqueda(String buscar, String filtro){
			List<Object> resultado = bd.realizarBusqueda(buscar, filtro);
			this.getLayoutResultadoUsuario().as(VerticalLayout.class).removeAll();
			_item.clear();
			
			for (int i = 0; i < resultado.size(); i++) {				
				if (resultado.get(i) instanceof UsuarioRegistrado) {
					UsuarioRegistrado ur = bd.cargarUsuarioRegistrado(Integer.parseInt(resultado.get(i).toString()));
					item = new Resultado_usuarios_item(ur, this);
					this.rb.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).add(item);
	            } else if (resultado.get(i) instanceof Hashtag) {
	            	Hashtag h = bd.cargarHashtag(Integer.parseInt(resultado.get(i).toString()), buscar);
					item = new Resultado_hashtags_item(h, this);
					this.rb.getLayoutListaResultadoHashtags().as(VerticalLayout.class).add(item);
	            }
				_item.add(item);
			}
	}
	
	public void Filtrar_resultado() {
		this.rb.select.addValueChangeListener(event -> {
			if(this.rb.select.getValue() == "Usuarios") {
				this.rb.getVaadinHorizontalLayout2().setVisible(true);
				this.rb.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(true);
				this.rb.getLayoutTituloHashtags().setVisible(false);
				this.rb.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(false);
				this.rb.getBarraHorizontal().setVisible(false);
			}else if(this.rb.select.getValue() == "Hashtags") {
				this.rb.getVaadinHorizontalLayout2().setVisible(false);
				this.rb.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(false);
				this.rb.getLayoutTituloHashtags().setVisible(true);
				this.rb.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(true);
				this.rb.getBarraHorizontal().setVisible(false);
			}else {
				this.rb.getVaadinHorizontalLayout2().setVisible(true);
				this.rb.getLayoutListaResultadoUsuarios().as(VerticalLayout.class).setVisible(true);
				this.rb.getLayoutTituloHashtags().setVisible(true);
				this.rb.getLayoutListaResultadoHashtags().as(VerticalLayout.class).setVisible(true);
				this.rb.getBarraHorizontal().setVisible(true);
			}
		});
	}
}