package co.com.sophos.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sophos.certificacion.userinterface.GoogleHomeSearch.BUTTOM_SEARCH;
import static co.com.sophos.certificacion.userinterface.GoogleHomeSearch.FIELD_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchGoogle implements Task {

    private SearchGoogle searchGoogle;

    public SearchGoogle () {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("hola").into(FIELD_SEARCH),
                Click.on(BUTTOM_SEARCH)
        );
    }

    public static SearchGoogle searchGoogle() {
        return Tasks.instrumented(SearchGoogle.class);
    }
}
