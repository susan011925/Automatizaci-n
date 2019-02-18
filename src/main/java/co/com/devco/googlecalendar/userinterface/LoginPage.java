package co.com.devco.googlecalendar.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

	public static final Target GOOGLEAPPS= Target.the("Link google apps").locatedBy("//div[contains(@class, 'gb_9 gb_vd gb_R')]");
	public static final Target BTN_CALENDARIO= Target.the("Link google apps").locatedBy("//a[contains(@id, 'gb24')]");
	public static final Target USAR_OTRA_CUENTA= Target.the("Link usar otra cuenta").locatedBy("//div[contains(@jsname, 'rw')]");
	public static final Target USUARIO= Target.the("Campo de texto usuario").locatedBy("//input[contains(@type, 'email')]");
	public static final Target CONTRASENNA= Target.the("Campo de texto contraseña").locatedBy("//input[contains(@name, 'passw')]");
	public static final Target BTN_SIGUIENTE= Target.the("Campo de texto contraseña").locatedBy("//div[contains(@id, 'identifierNext')]");
	public static final Target PERFIL_IDENTIFICADO= Target.the("Campo pre-cargado de perfil identificado").locatedBy("//div[contains(@data-email,'{0}')]");
	public static final Target LBL_IR_A_GOOGLE_CALENDAR= Target.the("Campo pre-cargado de perfil identificado").locatedBy("//div[contains(@id, 'headingSubtext')]");
	public static final Target BTN_INICIAR_SESION= Target.the("Campo de texto contraseña").locatedBy("//span[contains(text(), 'Siguiente')]");

	
	
}
