package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Test03_StepDefs {
    Test_Page testPage = new Test_Page();


    @Then("{string} should be the default selected value in the select list")
    public void should_be_the_default_selected_value_in_the_select_list(String expectedSelectedValue) {
        assertEquals(expectedSelectedValue,testPage.defaultSelectedValue.getText());
    }

    @When("the user selects {string} from the select list")
    public void the_user_selects_from_the_select_list(String option) {
        select.selectByVisibleText(option);
    }

    @Then("{string} should be the selected value in the select list")
    public void should_be_the_selected_value_in_the_select_list(String option) {
        assertEquals(option, select.getFirstSelectedOption().getText());
    }

}
