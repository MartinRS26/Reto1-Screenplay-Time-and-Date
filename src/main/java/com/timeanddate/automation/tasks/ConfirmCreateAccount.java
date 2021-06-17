package com.timeanddate.automation.tasks;

import com.timeanddate.automation.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.timeanddate.automation.userinterfaces.TimeAndDateRegisterPage.*;
import static com.timeanddate.automation.userinterfaces.TimeAndDateRegisterPage.CONFIRM_PASSWORD_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmCreateAccount implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CREATE_NEW_ACCOUNT));
        //Click.on(GOOGLE_TRANSLATE));
    }
    public static ConfirmCreateAccount timeanddate(){
        return instrumented(ConfirmCreateAccount.class);

    }}
