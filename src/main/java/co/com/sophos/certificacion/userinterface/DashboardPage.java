package co.com.sophos.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {
    public static final Target IN_DASHBOARD = Target.the("in Dashboard")
            .locatedBy("//input[@id='sidebar_toggleShrink']");
}
