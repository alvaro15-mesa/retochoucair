package choucairtesting.com.retochoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import java.util.concurrent.TimeUnit;


public class Home {
public static final Target EMPLEOS=Target.the("empleos").
        locatedBy("//li[@id=\"menu-item-550\"]");

}
