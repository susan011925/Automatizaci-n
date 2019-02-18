package co.com.devco.googlecalendar.task;

import static co.com.devco.googlecalendar.userinterface.LoginPage.BTN_CALENDARIO;
import static co.com.devco.googlecalendar.userinterface.LoginPage.BTN_INICIAR_SESION;
import static co.com.devco.googlecalendar.userinterface.LoginPage.BTN_SIGUIENTE;
import static co.com.devco.googlecalendar.userinterface.LoginPage.CONTRASENNA;
import static co.com.devco.googlecalendar.userinterface.LoginPage.GOOGLEAPPS;
import static co.com.devco.googlecalendar.userinterface.LoginPage.LBL_IR_A_GOOGLE_CALENDAR;
import static co.com.devco.googlecalendar.userinterface.LoginPage.USUARIO;

import co.com.devco.googlecalendar.exceptions.NoCargaLaPaginaInicioSesion;
import co.com.devco.googlecalendar.models.Credenciales;
import co.com.devco.googlecalendar.questions.MuestraPaginaIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class IniciarSesion implements Task {

private Credenciales credenciales;


	public IniciarSesion (Credenciales credenciales) {
		this.credenciales=credenciales;
	}
	@Override	
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GOOGLEAPPS), Click.on(BTN_CALENDARIO));
		actor.should(GivenWhenThen.seeThat(MuestraPaginaIniciarSesion.favorable()).orComplainWith(NoCargaLaPaginaInicioSesion.class,NoCargaLaPaginaInicioSesion.MESSAGE_EXCEPTION_CARGA_La_Pagina));
		actor.attemptsTo(
				Check.whether(CurrentVisibility.of(LBL_IR_A_GOOGLE_CALENDAR).viewedBy(actor).asAQuestion()).
				andIfSo(Enter.theValue(credenciales.getUsuario()).into(USUARIO),Click.on(BTN_SIGUIENTE),Enter.theValue(credenciales.getContrasenna()).into(CONTRASENNA), Click.on(BTN_INICIAR_SESION)));
				
			}

	public static  IniciarSesion enGoogleCalendar(Credenciales credenciales) {
	
		return Tasks.instrumented(IniciarSesion.class, credenciales );
	}
}
