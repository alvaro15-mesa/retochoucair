package choucairtesting.com.test.runners;

import com.google.common.jimfs.Feature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/acces_home.feature",
glue = "choucairtesting.com.test.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class AccesHome {
}
