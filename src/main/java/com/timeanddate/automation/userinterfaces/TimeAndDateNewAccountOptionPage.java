package com.timeanddate.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TimeAndDateNewAccountOptionPage {
    public static final Target NEW_ACCOUNT_OPTION = Target.the("Option new account button").located(By.xpath("//p/a[contains(@class,'button blue large')]"));
    //p/a[contains(@class,'button blue large')]
}
