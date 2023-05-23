package basededatos;

import java.time.LocalDate;
import java.util.List;

public interface iUsuario_No_Registrado {

	public List realizarBusqueda(String aBusqueda, String aFiltro);

	public void registrarUsuario(String aNombre, String aApellidos, String aEmail, String aPassword, String aDescripcion, String aNombreUsuario, LocalDate aFechaNacimiento, boolean aTipoCuenta, String aFoto);

	public List cargarUsuariosUNR();

	public List cargarTendencias();

}