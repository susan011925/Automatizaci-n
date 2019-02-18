package co.com.devco.googlecalendar.stepsdefinitions;

import co.com.devco.googlecalendar.task.SeleccionarOpcionMenu;
import co.com.devco.googlecalendar.models.Credenciales;
import co.com.devco.googlecalendar.models.EventoGoogleCalendarFeature;
import co.com.devco.googlecalendar.questions.GuardaEventoEnGoogleCalendar;
import co.com.devco.googlecalendar.task.AbirNavegador;
import co.com.devco.googlecalendar.task.CrearEvento;
import co.com.devco.googlecalendar.task.IniciarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.devco.googlecalendar.models.EventoGoogleCalendarioBuilder.porDefecto;

import java.util.List;

public class GoogleCalendarStepsDefinitions {
	
	@Managed (driver="chrome")
	private WebDriver suNavegador;
	public static final Actor SUSANA = Actor.named("Susana");
	
	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Before
	public void inicializacion() {
		SUSANA.can(BrowseTheWeb.with(suNavegador));
	}

	@Dado("^que Susana quiere loguearse en la aplicación de Google$")
	public void queSusanaQuiereLoguearseEnLaAplicaciónDeGoogle() {
		SUSANA.wasAbleTo(AbirNavegador.enGoogleCalendar());
	}


	@Cuando("^inicia sesión en Google Calendar$")
	public void iniciaSesiónEnGoogleCalendar() {
	SUSANA.attemptsTo(IniciarSesion.enGoogleCalendar(new Credenciales("calendarioautomatizado@gmail.com", "123456Geidy")));
	}

	@Cuando("^Susana quiere (.*) un evento Google Candelar$")
	public void queSusanaQuiereCrearUnEventoGoogleCandelar(String opcion) {
		SUSANA.attemptsTo(SeleccionarOpcionMenu.de(opcion));
	
	}

	@Cuando("^Susana diligencia los datos necesarios para crear un nuevo evento$")
	public void SusanadiligenciaLosDatosNecesariosParaCrearUnNuevoEvento(List<EventoGoogleCalendarFeature> dataTable) {
		EventoGoogleCalendarFeature datosFeature=dataTable.get(0);
		SUSANA.attemptsTo(CrearEvento.enGoogleCalendar(porDefecto().conFechaInicial(datosFeature.getFechaInicial()).conHoraInicial(datosFeature.getHoraInicial())
				.conHoraFinal(datosFeature.getHoraFinal()).conFechaFinal(datosFeature.getFechaFinal()),true));
	}

	@Entonces("^el evento debe ser creado$")
	public void elEventoDebeSerCreado() {
		SUSANA.should(GivenWhenThen.seeThat(GuardaEventoEnGoogleCalendar.favorable()));
	}
}
