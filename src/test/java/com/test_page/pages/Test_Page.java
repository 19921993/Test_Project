package com.test_page.pages;

import com.test_page.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Test_Page {
    public Test_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TEST 1
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    //TEST 2
    @FindBy(xpath = "//ul[@class='list-group']/li")
    public List<WebElement> listGroup;

    //This method created to get any list item from Test 2
    //Returns list item as WebElement
    public static WebElement getListItem(int listItemNum){
        WebElement listItem = Driver.getDriver().findElement
                (By.xpath("//ul[@class='list-group']/li[@class='list-group-item justify-content-between']["+listItemNum+"]"));
        return listItem;
    }

    //This method created to get any list item's value from Test 2
    //Returns value as WebElement
    public static WebElement getListItemValue(int listItemNum){
        WebElement listItemValue = Driver.getDriver().findElement
                (By.xpath("//ul[@class='list-group']/li[@class='list-group-item justify-content-between']["+listItemNum+"]/span"));
        return listItemValue;
    }

    //TEST 3
    @FindBy(xpath = "//button[@id='dropdownMenuButton']")
    public WebElement defaultSelectedValue;

    public static WebElement getOptionFromDropdown(String option){
        List<WebElement> dropdownMenu = Driver.getDriver().findElements(By.xpath(
                "//a[@class='dropdown-item']"));

        for (WebElement each : dropdownMenu) {
            if (each.getText().equals(option)){
                return each;
            }

        }
        return null;
    }

    //TEST 4
    @FindBy(xpath = "//div[@id='test-4-div']/button[@type='button'][1]")
    public WebElement firstButtonTest4;

    @FindBy(xpath = "//div[@id='test-4-div']/button[@type='button'][2]")
    public WebElement secondButtonTest4;


    //TEST 5
    @FindBy(xpath = "//button[@id='test5-button']")
    public WebElement buttonTest5;

    @FindBy(xpath = "//div[@id='test5-alert'] ")
    public WebElement successMessage;


    //Test 6
    //This method created to get any cell value from the table in test 6
    //It's has 2 parameters one for the row and one for the column
    //Returns value as String
    public static String getCellValueFromGrid(int row,int col){
        WebElement cell = Driver.getDriver().
                findElement(By.xpath("//table[@class='table table-bordered table-dark']//tbody/tr["+row+"]/td["+col+"]"));
        return cell.getText();
    }


    // This method for locating the test headers(Test 1,Test 2,Test 3,Test 4,Test 5,Test 6)
    //It's Dynamic method and has one parameter which is the test number it's giving in the test script
    public static WebElement testHeader(int testNum) {
        WebElement header =
                Driver.getDriver().findElement(By.xpath("//div[@id='test-"+ testNum +"-div']"));
        return header;
    }

}
