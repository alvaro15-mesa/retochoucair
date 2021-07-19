package choucairtesting.com.test.stepdefinitions;
import choucairtesting.com.retochoucairtesting.userinterfaces.PortalEmpleos;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import org.junit.Assert;
import choucairtesting.com.retochoucairtesting.task.AccesHomeTask;
import choucairtesting.com.retochoucairtesting.userinterfaces.Empleos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.actions.Scroll;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccesHomeStepdefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    @Before
    public void setThestage(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alvaro");

    }


    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));


    }

    @When("^the user clicks on the jobs section$")
    public void theUserClicksOnTheJobsSection() {

        theActorInTheSpotlight().attemptsTo(AccesHomeTask.makeinformation());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        theActorInTheSpotlight().attemptsTo(Click.on(Empleos.SERCHOUCAIR));

        theActorInTheSpotlight().attemptsTo(Click.on(PortalEmpleos.BOTONPORTALEMPLEOS));

        theActorInTheSpotlight().attemptsTo(Click.on(PortalEmpleos.BOTONSALIREMPLEOS));


    }

    @Then("^the user sees the jobs section$")
    public void theUserSeesTheJobsSection() {

    }

}
