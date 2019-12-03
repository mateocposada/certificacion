package co.com.sophos.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class GoogleHomeSearch extends PageObject {

    public static final Target FIELD_SEARCH = Target.the("Field to search")
            .locatedBy("//input[@class='gLFyf gsfi']");

    public static final Target BUTTOM_SEARCH = Target.the("Field to search")
            .locatedBy("//div[@jsname='VlcLAe']//input[@class='gNO89b']");
}
