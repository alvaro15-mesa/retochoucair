package choucairtesting.com.retochoucairtesting.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PortalEmpleos {
    public static final Target BOTONPORTALEMPLEOS=Target.the("botonpotalempleos").
            locatedBy("//div[@data-id=\"d1f45a7\"]");
    public static final Target BOTONSALIREMPLEOS=Target.the("botonsalirempleos").
            locatedBy("//a[@class=\"elementor-button-link elementor-button elementor-size-sm\"]");

}

