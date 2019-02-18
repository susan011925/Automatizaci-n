package co.com.devco.googlecalendar.models;

public class EventoGoogleCalendarFeature {

	public String tituloEvento;
	public String fechaInicial;
	public String horaInicial;
	public String fechaFinal;
	public String horaFinal;
	public String recordatorio;
	
	
	
	public String getRecordatorio() {
		return recordatorio;
	}
	public void setRecordatorio(String recordatorio) {
		this.recordatorio = recordatorio;
	}
	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getTituloEvento() {
		return tituloEvento;
	}
	public String getFechaInicial() {
		return fechaInicial;
	}
	public String getHoraInicial() {
		return horaInicial;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public String getHoraFinal() {
		return horaFinal;
	}
	
	
}
