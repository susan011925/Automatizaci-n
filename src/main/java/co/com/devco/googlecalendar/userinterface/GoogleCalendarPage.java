package co.com.devco.googlecalendar.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleCalendarPage extends PageObject {

	
	public static final Target BTN_CREAR= Target.the("Botón crear").locatedBy("//button[contains(@class, 'VfPpkd-BIzmGd SaBhMc wJGlHe jnO3Pd')]");
	public static final Target TXT_AGREGAR_TITULO= Target.the("Campo de agregar título").locatedBy("//*[@id=\"yDmH0d\"]//input[contains(@aria-label, 'Añade un t')]");
	public static final Target BTN_EVENTO= Target.the("Botón evento").locatedBy("//content[contains(@class,'kx3Hed VZhFab')]//span[contains(text(),'Evento')]");
	public static final Target TXT_FECHA_INICIAL= Target.the("Campo de texto fecha inicial").locatedBy("//*[@id=\"tabEvent\"]//input[contains(@id,'xStDaIn')]");
	public static final Target TXT_FECHA_FINAL= Target.the("Campo de texto fecha finalización").locatedBy("//*[@id=\"tabEvent\"]//input[contains(@id,'xEnDaIn')]");
	public static final Target TXT_HORA_INICIAL= Target.the("Campo de texto hora finalización").locatedBy("//*[@id=\"tabEvent\"]//input[contains(@id,'xStTiIn')]");
	public static final Target TXT_HORA_FINAL= Target.the("Campo de texto hora finalización").locatedBy("//*[@id=\"tabEvent\"]//input[contains(@id,'xEnTiIn')]");
	public static final Target BTN_GUARDAR= Target.the("Botón guardar evento").locatedBy("//*[@id=\"yDmH0d\"]/div/div/div[2]/content/div/div[2]/div[2]");
	public static final Target EVENTO_GUARDAO= Target.the("Focus de la fecha final").locatedBy("//div[contains(@style,'visibility: visible')]");
	public static final Target LBL_CALENDAR= Target.the("Pagína principal").locatedBy("//a[contains(@aria-label, 'Calendar')]");
	public static final Target BTN_RECORDATORIO= Target.the("Pagína principal").locatedBy("//content[contains(@class,'kx3Hed VZhFab')]//span[contains(text(),'Recordatorio')]");
	public static final Target SELECT_RECORDATORIO= Target.the("Pagína principal").locatedBy("//div[contains(@class,'MocG8c mZytBb LMgvRb KKjvXb')]");
	public static final Target ItEM_SELECCIONADO= Target.the("Pagína principal").locatedBy("//div[contains(@class,'OA0qNb ncFHed')]//content[contains(text(),'{0}')]");
	public static final Target CHK_TODO_EL_DIA= Target.the("Campo de texto contraseña").locatedBy("//*[@id=\"tabReminder\"]/div/div[2]/div[2]/label/div/div[2]");

	
}
