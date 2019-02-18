package co.com.devco.googlecalendar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.EVENTO_GUARDAO;

public class GuardaEventoEnGoogleCalendar implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(EVENTO_GUARDAO).viewedBy(actor).asBoolean();
	
	}
	
	public static GuardaEventoEnGoogleCalendar favorable() {
		return new GuardaEventoEnGoogleCalendar();
	}
}
