package co.com.devco.googlecalendar.task;

import co.com.devco.googlecalendar.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbirNavegador implements Task {

	private LoginPage loginPage;

@Override
public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Open.browserOn(loginPage));
}
	
	public static AbirNavegador enGoogleCalendar() {
		return Tasks.instrumented(AbirNavegador.class);
	}

	

}
