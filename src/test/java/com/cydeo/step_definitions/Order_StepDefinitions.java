package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//  #Day17_WebTable_Task2

public class Order_StepDefinitions {

    // bunu daha önce kurmustuk , bir önceki task da, tekrar cagirdik
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and order page")
    public void user_is_already_logged_in_and_order_page() {

        //Getting the page using the URL from Configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

        //Calling our login method to log in to web table app
        webTableLoginPage.login();

        //clicking to "order" link to go order page
        basePage.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);  // hatirlarsan 3 yöntem vardi (value - index - visible text)
        BrowserUtils.sleep(1);
    }

    /*
    //bu benim yolum
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        orderPage.quantityInput.clear();
        orderPage.quantityInput.sendKeys("int1");
        BrowserUtils.sleep(1);
    }

     */
    @When("user enters quantity {int}")
    public void user_enters_quantity(int int1) {
        //accepting int argument and sending it using sendKeys() method
        //since sendKeys()  method only accepts String , WE NEED  TO either concat with""
        //or send String.valueOf(int)
        //orderPage.quantityInput.clear(); // first way
        orderPage.quantityInput.sendKeys(Keys.BACK_SPACE); //clear() method 'un yerine-->second way
        orderPage.quantityInput.sendKeys(int1 + ""); //1. way
        // orderPage.quantityInput.sendKeys(String.valueOf(int1)); //2.way
        BrowserUtils.sleep(1);
    }


    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {
        orderPage.nameInput.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.street.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.cityInput.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.stateInput.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.zipInput.sendKeys(string);
        BrowserUtils.sleep(1);
    }

    @When("user enters credit card type {string}")
    public void user_enters_credit_card_type(String expectedCardType) {

        /*
        List<WebElement> cardTypes = orderPage.cardType;

        for (WebElement each : cardTypes) {

            if (each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();
            }
        }
        BrowserUtils.sleep(1);

         */

        //yukaridakinin Utuliti sini yaptik day 18 de
        //this line loop through the list and decide which radio button to click
        BrowserUtils.clickRadioButton(orderPage.cardType, expectedCardType);
    }




    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }

    @When("user enters expirty date {string}")
    public void user_enters_expirty_date(String string) {

    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {

    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }


}
