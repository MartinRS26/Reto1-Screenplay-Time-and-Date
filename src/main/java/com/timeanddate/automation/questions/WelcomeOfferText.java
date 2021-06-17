package com.timeanddate.automation.questions;

import com.timeanddate.automation.userinterfaces.TimeAndDateWelcomeOfferPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.timeanddate.automation.userinterfaces.TimeAndDateWelcomeOfferPage.SECONDARY_TEXT;

public class WelcomeOfferText implements Question<String> {
    public static Question<String> value(){
        return new WelcomeOfferText();
        //return actor -> TextContent.of(TimeAndDateWelcomeOfferPage.SECONDARY_TEXT).viewedBy(actor).asString().trim();
    }
    @Override
    public String answeredBy(Actor actor) {
        return SECONDARY_TEXT.resolveFor(actor).getText();
    }
}
