package co.com.sophos.certificacion.stepdefinitions;

import co.com.sophos.certificacion.tasks.MakeQueryInGoogle;
import co.com.sophos.certificacion.userinterface.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class SearchGoogleStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor MATEO = Actor.named("Mateo");
    private GoogleHomePage googleHomePage;

    @Before
    public void prepareStage(){
        MATEO.can(BrowseTheWeb.with(hisDriver));
    }


    @Given("^Mateo wants to start search$")
    public void openTheBrowser() {
        MATEO.attemptsTo(Open.browserOn(googleHomePage));

    }

    @When("^Mateo perform a google search$")
    public void mateoPerformAGoogleSearch() throws Exception {
        MATEO.wasAbleTo(MakeQueryInGoogle.makeQueryInGoogle());
    }

    @Then("^Mateo should see the result of search$")
    public void mateoShouldSeeTheResultOfSearch() throws Exception {
    }



}
