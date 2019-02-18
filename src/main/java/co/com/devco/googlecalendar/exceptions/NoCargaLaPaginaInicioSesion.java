package co.com.devco.googlecalendar.exceptions;

public class NoCargaLaPaginaInicioSesion extends AssertionError{

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_EXCEPTION_CARGA_La_Pagina = "No carga la págin iniciar sesión";

	public NoCargaLaPaginaInicioSesion(String message, Throwable cause) {
		 super(message, cause);
		
	}
	
}
