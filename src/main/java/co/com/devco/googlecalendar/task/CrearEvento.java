package co.com.devco.googlecalendar.task;

import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.BTN_GUARDAR;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.BTN_RECORDATORIO;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.CHK_TODO_EL_DIA;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.ItEM_SELECCIONADO;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.SELECT_RECORDATORIO;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.TXT_AGREGAR_TITULO;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.TXT_FECHA_FINAL;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.TXT_FECHA_INICIAL;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.TXT_HORA_FINAL;
import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.TXT_HORA_INICIAL;

import org.openqa.selenium.Keys;

import co.com.devco.googlecalendar.exceptions.NoCargaLaPaginaPrincipal;
import co.com.devco.googlecalendar.models.EventoGoogleCalendar;
import co.com.devco.googlecalendar.models.EventoGoogleCalendarioBuilder;
import co.com.devco.googlecalendar.questions.MuestraLaPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
public class CrearEvento implements Task{

	EventoGoogleCalendar evento;
	boolean conRecordatorio;
	public CrearEvento(EventoGoogleCalendar evento,boolean conRecordatorio) {
		this.evento=evento;
		this.conRecordatorio=conRecordatorio;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.should(GivenWhenThen.seeThat(MuestraLaPaginaPrincipal.favorable()).orComplainWith(NoCargaLaPaginaPrincipal.class,NoCargaLaPaginaPrincipal.MESSAGE_EXCEPTION_CARGA_LA_PAGINA_PRINCIPAL));
			actor.attemptsTo(Enter.theValue(evento.getTituloEvento()).into(TXT_AGREGAR_TITULO));		
		actor.attemptsTo(
				Enter.theValue(evento.getFechaInicial()).into(TXT_FECHA_INICIAL),Enter.theValue(evento.getHoraInicial()).into(TXT_HORA_INICIAL),
				Enter.theValue(evento.getHoraFinal()).into(TXT_HORA_FINAL),Enter.theValue(evento.getFechaFinal()).into(TXT_FECHA_FINAL).thenHit(Keys.TAB));
		actor.attemptsTo(Check.whether(conRecordatorio).andIfSo(Click.on(BTN_RECORDATORIO),Click.on(SELECT_RECORDATORIO),Click.on(ItEM_SELECCIONADO.of(evento.getRecordatorio().toString()))));	
		actor.attemptsTo(Check.whether(evento.isTodoElDia()).andIfSo(Click.on(CHK_TODO_EL_DIA)));
		actor.attemptsTo(Click.on(BTN_GUARDAR));
	
		
		
	}
	public static CrearEvento enGoogleCalendar(EventoGoogleCalendarioBuilder evento, boolean recordatorio) {
	return Tasks.instrumented(CrearEvento.class, evento.build(), recordatorio);
}
	
}
