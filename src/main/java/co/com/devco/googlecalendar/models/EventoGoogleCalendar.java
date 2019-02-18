package co.com.devco.googlecalendar.models;

public class EventoGoogleCalendar {
	
	public String tituloEvento;
	public String fechaInicial;
	public String horaInicial;
	public String fechaFinal;
	public String horaFinal;
	public String recordatorio;
	public boolean todoElDia;
	
	public EventoGoogleCalendar(EventoGoogleCalendarioBuilder build) {
		this.tituloEvento=build.getTituloEvento();
		this.fechaInicial=build.getFechaInicial();
		this.horaInicial=build.getHoraInicial();
		this.fechaFinal=build.getFechaFinal();
		this.horaFinal=build.getHoraFinal();
		this.recordatorio=build.getRecordatorio();
		this.todoElDia=build.isTodoElDia();
	}
	
	
	public String getRecordatorio() {
		return recordatorio;
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


	public boolean isTodoElDia() {
		return todoElDia;
	}
	
	
}
