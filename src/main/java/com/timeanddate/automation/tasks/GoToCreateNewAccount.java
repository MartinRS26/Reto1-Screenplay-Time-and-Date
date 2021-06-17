package com.timeanddate.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.timeanddate.automation.userinterfaces.TimeAndDateHomePage.USER_ACCESS;
import static com.timeanddate.automation.userinterfaces.TimeAndDateNewAccountOptionPage.NEW_ACCOUNT_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCreateNewAccount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(NEW_ACCOUNT_OPTION));
        //Click.on(GOOGLE_TRANSLATE));
    }
    public static GoToCreateNewAccount timeanddate(){
        return instrumented(GoToCreateNewAccount.class);
    }
}
