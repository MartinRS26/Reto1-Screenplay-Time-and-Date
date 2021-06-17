package com.timeanddate.automation.tasks;

import com.timeanddate.automation.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.timeanddate.automation.userinterfaces.TimeAndDateNewAccountOptionPage.NEW_ACCOUNT_OPTION;
import static com.timeanddate.automation.userinterfaces.TimeAndDateRegisterPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutForm implements Task {

    private Data data;


    public FillOutForm(Data data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(data.getName()).into(NAME_FIELD),
                         Enter.theValue(data.getEmail()).into(EMAIL_FIELD),
                         Enter.theValue(data.getPassword()).into(PASSWORD_FIELD),
                         Enter.theValue(data.getPassword()).into(CONFIRM_PASSWORD_FIELD));
        //Click.on(GOOGLE_TRANSLATE));
    }
    public static FillOutForm timeanddate(Data data){
        return instrumented(FillOutForm.class,data);

    }
}
