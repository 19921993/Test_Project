package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.ConfigurationReader;
import com.test_page.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Test01_StepDefs {
    Test_Page testPage = new Test_Page();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("the user should see the email address input field")
    public void the_user_should_see_the_email_address_input_field() {
        assertTrue(testPage.emailInput.isDisplayed());
    }

    @Then("the user should see the password input field")
    public void the_user_should_see_the_password_input_field() {
        assertTrue(testPage.passwordInput.isDisplayed());
    }

    @Then("the user should see the login button")
    public void the_user_should_see_the_login_button() {
        assertTrue(testPage.signInButton.isDisplayed());
    }

    @When("the user enters an email address")
    public void the_user_enters_an_email_address() {
        testPage.emailInput.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("enters a password")
    public void enters_a_password() {
        testPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        testPage.signInButton.click();
    }


}
