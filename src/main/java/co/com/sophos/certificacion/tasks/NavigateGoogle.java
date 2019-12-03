package co.com.sophos.certificacion.tasks;

import co.com.sophos.certificacion.userinterface.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class NavigateGoogle implements Task {

    private GoogleHomePage googleHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenTheBrowser.in(googleHomePage));
    }

    public static NavigateGoogle homePage() {
        return Tasks.instrumented(NavigateGoogle.class);
    }
}
