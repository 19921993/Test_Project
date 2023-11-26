package com.test_page.stepDefs;

import com.test_page.pages.Test_Page;
import com.test_page.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class Test02_StepDefs {

    Test_Page testPage = new Test_Page();
    Actions actions = new Actions(Driver.getDriver());

    @When("the user navigates to the Test {int}")
    public void the_user_navigates_to_the_test(int testNum) {
        WebElement testNumber = Test_Page.testHeader(testNum);
        actions.moveToElement(testNumber).perform();
    }

    @Then("the user should see {int} values in the list group")
    public void the_user_should_see_values_in_the_list_group(int values) {
        assertEquals(testPage.listGroup.size(), values);
    }


    @Then("the list item number {int} value is set to {string}")
    public void the_list_item_number_value_is_set_to(int listItemNum, String expectedListItem) {
        String actualListItem = Test_Page.getListItem(listItemNum).getText();
        assertTrue(actualListItem.contains(expectedListItem));
    }


    @Then("the list item number {int} badge value is {string}")
    public void the_list_item_number_badge_value_is(int listItemNum, String expectedListItemValue) {
        String actualListItemValue = Test_Page.getListItemValue(listItemNum).getText();
        assertEquals(expectedListItemValue, actualListItemValue);
    }

}
