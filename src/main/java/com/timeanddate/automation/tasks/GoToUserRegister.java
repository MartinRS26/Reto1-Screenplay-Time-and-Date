package com.timeanddate.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.timeanddate.automation.userinterfaces.TimeAndDateHomePage.USER_ACCESS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToUserRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(USER_ACCESS));
        //Click.on(GOOGLE_TRANSLATE));
    }
    public static GoToUserRegister timeanddate(){
        return instrumented(GoToUserRegister.class);
    }


}
