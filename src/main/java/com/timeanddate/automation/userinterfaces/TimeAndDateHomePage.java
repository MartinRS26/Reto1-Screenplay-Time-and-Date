package com.timeanddate.automation.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.timeanddate.com/")
public class TimeAndDateHomePage extends PageObject {
public static final Target USER_ACCESS = Target.the("User access button").located(By.xpath("//div/a[@href='/custom/']"));
}
