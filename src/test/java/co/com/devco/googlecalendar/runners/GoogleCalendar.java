package co.com.devco.googlecalendar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/googlecalendar.feature", 
		glue = "co/com/devco/googlecalendar/stepsdefinitions",tags="@Caso1",
		snippets =SnippetType.CAMELCASE
		)
public class GoogleCalendar {

}
