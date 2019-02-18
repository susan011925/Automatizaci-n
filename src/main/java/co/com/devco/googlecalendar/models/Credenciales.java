package co.com.devco.googlecalendar.models;

public class Credenciales {
	private String usuario;
	private String contrasenna;
	
	
	public Credenciales(String usuario,String contrasenna) {
		this.usuario=usuario;
		this.contrasenna=contrasenna;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenna() {
		return contrasenna;
	}


}
