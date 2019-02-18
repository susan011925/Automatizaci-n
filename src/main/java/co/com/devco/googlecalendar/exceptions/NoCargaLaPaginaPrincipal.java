package co.com.devco.googlecalendar.exceptions;

public class NoCargaLaPaginaPrincipal extends AssertionError {

	
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_EXCEPTION_CARGA_LA_PAGINA_PRINCIPAL="No carga la pagína principal google calendar";

	public NoCargaLaPaginaPrincipal(String message, Throwable cause) {
		 super(message, cause);
		
	}
}

