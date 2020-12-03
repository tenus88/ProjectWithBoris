package com.vytruck.pages;
//wrong password
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
    public void login(String role) {

        String usernameValue ="";
        String passowrdValue = ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("sales manager")) {
            usernameValue = ConfigurationReader.getProperty("salesmanager.username");
        } else if (role.equalsIgnoreCase("driver")) {
            usernameValue = ConfigurationReader.getProperty("driver.username");
        } else {
            usernameValue = ConfigurationReader.getProperty("storemanager.username");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userName.sendKeys(usernameValue);
        password.sendKeys(passowrdValue, Keys.ENTER);

    }


    public void wronglogin() {

        userName.sendKeys(ConfigurationReader.getProperty("storemanagerUN"));
        password.sendKeys(ConfigurationReader.getProperty("wrongPassword"));
        loginButton.click();
    }
}