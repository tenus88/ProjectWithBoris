package com.vytruck.pages;

import com.vytruck.utilites.ConfigurationReader;
import com.vytruck.utilites.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@type='text']")
    private WebElement userName;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertMessage;


    public void login() {

        userName.sendKeys(ConfigurationReader.getProperty("storemanagerUN"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }


    public void wronglogin() {

        userName.sendKeys(ConfigurationReader.getProperty("storemanagerUN"));
        password.sendKeys(ConfigurationReader.getProperty("wrongPassword"));
        loginButton.click();
    }
}