package co.com.sophos.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features/buscar_google.feature" },
        glue = { "co.com.sophos.certificacion.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class SearchGoogle {
}
