package com.vytruck.pages;

import com.vytruck.utilites.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "prependedInput")
    private WebElement userName;

    @FindBy(id="prependedInput2")
    private  WebElement password;

    @FindBy(id = "_submit")
    private WebElement loginButton;


    public void login(){
        userName.sendKeys(ConfigurationReader.getProperty("storemanager.username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
