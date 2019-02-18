package co.com.devco.googlecalendar.userinterface;

import static co.com.devco.googlecalendar.userinterface.GoogleCalendarPage.BTN_CREAR;


import net.serenitybdd.screenplay.targets.Target;

public enum OpcionMenu {

	CREAR(BTN_CREAR);
	
	
	private Target opcion;
	
	OpcionMenu(Target opcion){
		this.opcion = opcion;
	}
	
	public Target opcion(){
		return this.opcion;
	}
}
