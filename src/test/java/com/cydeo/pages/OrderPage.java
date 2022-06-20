package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//  #Day17_WebTable_Task2

public class OrderPage {

    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNoInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement processOrderButton;













}
