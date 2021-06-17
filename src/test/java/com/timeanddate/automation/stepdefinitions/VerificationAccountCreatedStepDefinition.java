package com.timeanddate.automation.stepdefinitions;

import com.timeanddate.automation.models.Data;
import com.timeanddate.automation.questions.WelcomeOfferText;
import com.timeanddate.automation.tasks.ConfirmCreateAccount;
import com.timeanddate.automation.tasks.FillOutForm;
import com.timeanddate.automation.tasks.GoToCreateNewAccount;
import com.timeanddate.automation.tasks.GoToUserRegister;
import com.timeanddate.automation.userinterfaces.TimeAndDateHomePage;
import com.timeanddate.automation.userinterfaces.TimeAndDateRegisterPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;

public class VerificationAccountCreatedStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    String message = "What's in the Newsletter1?";

    @Before
    public void  setUp(){
    user.can(BrowseTheWeb.with(hisBrowser));
    user.wasAbleTo(Open.browserOn(new TimeAndDateHomePage()));
    }


    @Given("^I enter the registration page$")
    public void iEnterTheRegistrationPage() {
        user.attemptsTo(GoToUserRegister.timeanddate());
        user.attemptsTo(GoToCreateNewAccount.timeanddate());

    }


    @When("^input registration data$")
    public void inputRegistrationData(List<Data> dataList) {
        user.attemptsTo(FillOutForm.timeanddate(dataList.get(0)));
        user.attemptsTo(ConfirmCreateAccount.timeanddate());
    }

    @Then("^the text of the welcome offer would be$")
    public void theTextOfTheWelcomeOfferWouldBe() {
        //System.out.println(WelcomeOfferText.value().answeredBy(user));
        user.should(seeThat("The secondary message of the offer",WelcomeOfferText.value(),equalTo(message)));
    }

}
