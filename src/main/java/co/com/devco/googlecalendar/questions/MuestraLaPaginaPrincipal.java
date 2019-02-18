package co.com.devco.googlecalendar.questions;

import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.LBL_CALENDAR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class MuestraLaPaginaPrincipal implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(LBL_CALENDAR).viewedBy(actor).asBoolean();
	}
	
	public static MuestraLaPaginaPrincipal favorable() {
		return new MuestraLaPaginaPrincipal();
	}

	
}
