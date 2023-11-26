package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Test04_StepDefs {
    Test_Page testPage = new Test_Page();

    @Then("the first button should be enabled")
    public void the_first_button_should_be_enabled() {
        assertTrue(testPage.firstButtonTest4.isEnabled());
    }

    @Then("the second button should be disabled")
    public void the_second_button_should_be_disabled() {
        assertFalse(testPage.secondButtonTest4.isEnabled());
    }

}
