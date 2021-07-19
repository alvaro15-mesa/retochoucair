package choucairtesting.com.retochoucairtesting.task;
import org.openqa.selenium.WebDriver;
import choucairtesting.com.retochoucairtesting.userinterfaces.Empleos;
import choucairtesting.com.retochoucairtesting.userinterfaces.Home;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccesHomeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Home.EMPLEOS),
                Click.on(Empleos.ACEPTARCookIES),
                Click.on(Empleos.PREPARARSEAPLICAR),
                Click.on(Empleos.BOTONSUBIR)



        );


         }
    public static AccesHomeTask makeinformation(){




        return instrumented(AccesHomeTask.class);
    }
}
