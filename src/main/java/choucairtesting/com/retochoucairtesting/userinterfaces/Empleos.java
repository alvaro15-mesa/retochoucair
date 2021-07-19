package choucairtesting.com.retochoucairtesting.userinterfaces;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Scroll;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Empleos {
    public static final Target ACEPTARCookIES=Target.the("acepar cookies").
            locatedBy("//a[@id=\"cookie_action_close_header\"]");

    public static final Target PREPARARSEAPLICAR=Target.the("prepararseaplicar").
            locatedBy("//img[@title=\"empleosazulMesa de trabajo 1\"]");

    public static final Target BOTONSUBIR=Target.the("botonsubir").
            locatedBy("//a[@class=\"go-top show\"]");
    public static final Target SERCHOUCAIR=Target.the("serchoucair").
            locatedBy("//img[@title=\"serchazuleMesa de trabajo 1\"]");



}
