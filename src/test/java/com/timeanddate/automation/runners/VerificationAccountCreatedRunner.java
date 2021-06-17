package com.timeanddate.automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/verification_account_created.feature",
        glue = "com.timeanddate.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class VerificationAccountCreatedRunner {
}
