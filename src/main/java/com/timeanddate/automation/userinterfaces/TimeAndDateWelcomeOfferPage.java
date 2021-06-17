package com.timeanddate.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TimeAndDateWelcomeOfferPage {
    public static final Target SECONDARY_TEXT = Target.the("Welcome secondary text").located(By.xpath("//*[@class='modal-body']/p[@class='mgt15']"));


}
