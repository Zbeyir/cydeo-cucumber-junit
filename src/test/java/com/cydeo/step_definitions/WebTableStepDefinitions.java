package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

// #Day17_WebTable_Task01

public class WebTableStepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }


    @When("user enters username {string} and password {string} and login")
    public void userEntersUsernameNadPasswordAndLogin(String username, String pw) {
        // webTableLoginPage.inputUsername.sendKeys(username);
        //webTableLoginPage.inputPassword.sendKeys(pw);
        //webTableLoginPage.loginButton.click();

        //##-- another way --> method() 'lar

        // webTableLoginPage.login();  // -->1.method()
        //   webTableLoginPage.login(username, pw); //-->2.method()
        webTableLoginPage.loginWithConfig();

        BrowserUtils.sleep(3);

    }

    //TC01 #: Login scenario using maps/ alternative practice
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

        System.out.println("credentials.get(\"username\") = " + credentials.get("username"));
        System.out.println("credentials.get(\"password\") = " + credentials.get("password"));

       // webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
       // webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
       // webTableLoginPage.loginButton.click();
        //ANOTHER WAY--->

        //we can call our login utility method and pass values from app
        webTableLoginPage.login(credentials.get("username"), credentials.get("password") );

    }



}
