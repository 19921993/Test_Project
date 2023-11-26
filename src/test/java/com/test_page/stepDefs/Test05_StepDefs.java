package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class Test05_StepDefs {
    Test_Page testPage = new Test_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));



    @Then("the user should wait for the button to be displayed")
    public void the_user_should_wait_for_the_button_to_be_displayed() {
        wait.until(ExpectedConditions.visibilityOf(testPage.buttonTest5));
    }

    @When("the user clicks the button")
    public void the_user_clicks_the_button() {
        testPage.buttonTest5.click();
    }

    @Then("a success message should be displayed")
    public void a_success_message_should_be_displayed() {
        assertTrue(testPage.successMessage.isDisplayed());
    }

    @Then("the button should be disabled")
    public void the_button_should_be_disabled() {
        assertFalse(testPage.buttonTest5.isEnabled());
    }

}
