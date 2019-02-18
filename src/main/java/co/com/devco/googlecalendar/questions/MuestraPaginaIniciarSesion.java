package co.com.devco.googlecalendar.questions;

import static co.com.devco.googlecalendar.userinterface.LoginPage.LBL_IR_A_GOOGLE_CALENDAR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class MuestraPaginaIniciarSesion implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(LBL_IR_A_GOOGLE_CALENDAR).viewedBy(actor).asBoolean();
	}

	public static MuestraPaginaIniciarSesion favorable() {
		
		return new MuestraPaginaIniciarSesion();
	}

	
}
