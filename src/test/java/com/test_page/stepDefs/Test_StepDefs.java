package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.ConfigurationReader;
import com.test_page.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test_StepDefs {
    Test_Page testPage = new Test_Page();

    @Given("User on the test page")
    public void user_on_the_test_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("User sees email address and password inputs")
    public void user_sees_email_address_and_password_inputs() {

        Assert.assertTrue(testPage.emailInput.isEnabled());
        Assert.assertTrue(testPage.passwordInput.isEnabled());
        Assert.assertTrue(testPage.signInButton.isEnabled());
    }

    @When("User enters the email address and password")
    public void user_enters_the_email_address_and_password() {
        testPage.emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        testPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        testPage.signInButton.click();
    }

    @Then("user logged in successfully")
    public void user_logged_in_successfully() {

    }
}
