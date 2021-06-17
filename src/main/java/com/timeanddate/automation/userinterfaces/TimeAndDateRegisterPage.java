package com.timeanddate.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TimeAndDateRegisterPage {
    public static final Target NAME_FIELD = Target.the("Field to register name").located(By.xpath("//*/div/input[@name=\"fullname\"]"));
    public static final Target EMAIL_FIELD = Target.the("Field to register email").located(By.xpath("//*/div/input[@name=\"email\"]"));
    public static final Target PASSWORD_FIELD = Target.the("Field to register password").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Field to register confirm password").located(By.xpath("//*[@id=\"password1\"]"));
    public static final Target CREATE_NEW_ACCOUNT = Target.the("Create new account button").located(By.xpath("//*[@id='create']"));


}
