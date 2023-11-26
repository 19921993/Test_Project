package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class Test06_StepDefs {
    String actualValue;
    @When("the user requests the value of the cell at coordinates {int}, {int}")
    public void the_user_requests_the_value_of_the_cell_at_coordinates(int row, int col) {
       actualValue = Test_Page.getCellValueFromGrid(row, col);
    }

    @Then("the value of the cell should be {string}")
    public void the_value_of_the_cell_should_be(String expectedValue) {
        assertEquals(expectedValue,actualValue);
    }
}
