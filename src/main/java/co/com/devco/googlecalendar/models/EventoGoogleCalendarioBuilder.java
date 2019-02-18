package co.com.devco.googlecalendar.models;


import co.com.devco.googlecalendar.utils.Builder;

public class EventoGoogleCalendarioBuilder implements Builder<EventoGoogleCalendar> {
	
	public String tituloEvento;
	public String fechaInicial;
	public String horaInicial;
	public String fechaFinal;
	public String horaFinal;
	public String recordatorio;
	public boolean todoElDia;
	
	public EventoGoogleCalendarioBuilder() {
		
		this.tituloEvento="Automatizo Google Calendar";
		this.fechaInicial="2019-02-17";
		this.horaInicial="8:15pm";
		this.fechaFinal="2019-02-17";
		this.horaFinal="8:15pm";
		this.recordatorio="Cada día";
		this.todoElDia=false;
		
	}
	
	public static EventoGoogleCalendarioBuilder porDefecto() {
		return new EventoGoogleCalendarioBuilder();
	}
	
	public EventoGoogleCalendarioBuilder conTituloEvento(String titulo) {
		this.tituloEvento=titulo;
		return this;
	}
	public EventoGoogleCalendarioBuilder conFechaInicial(String fechaInicial) {
		this.fechaInicial=fechaInicial;
		return this;
	}
	public EventoGoogleCalendarioBuilder conHoraInicial(String horaInicial) {
		this.horaInicial=horaInicial;
		return this;
	}
	public EventoGoogleCalendarioBuilder conFechaFinal(String fechaFinal) {
		this.fechaFinal=fechaFinal;
		return this;
	}
	public EventoGoogleCalendarioBuilder conHoraFinal( String horaFinal) {
		this.horaFinal=horaFinal;
		return this;
	}
	public EventoGoogleCalendarioBuilder conRecordatorio( String recordatorio) {
		this.recordatorio=recordatorio;
		return this;
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
	public String getRecordatorio() {
		return recordatorio;
	}
	
	
	public boolean isTodoElDia() {
		return todoElDia;
	}

	@Override
	public EventoGoogleCalendar build() {
		
		return new EventoGoogleCalendar(this);
	}
	
	

}
