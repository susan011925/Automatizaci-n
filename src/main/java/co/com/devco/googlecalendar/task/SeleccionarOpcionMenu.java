package co.com.devco.googlecalendar.task;

import co.com.devco.googlecalendar.userinterface.OpcionMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarOpcionMenu implements Task {

	String opcion;
	public SeleccionarOpcionMenu( String opcion) {
		this.opcion=opcion;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OpcionMenu.valueOf(opcion.toUpperCase()).opcion()));
	}
	
	public static SeleccionarOpcionMenu de(String opcion) {
		return Tasks.instrumented(SeleccionarOpcionMenu.class, opcion);
	}
}
