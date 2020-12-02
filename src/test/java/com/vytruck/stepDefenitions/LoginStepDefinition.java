package com.vytruck.stepDefenitions;
//go-go
import com.vytruck.pages.LoginPage;
import com.vytruck.utilites.ConfigurationReader;
import com.vytruck.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();


    @Given("valid url")
    public void valid_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("I user enters valid credentials")
    public void i_user_enters_valid_credentials() {
        loginPage.login();
    }


    @Then("user should be able to get main page")
    public void user_should_be_able_to_get_main_page() {

        String expected = "Dashboard";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expected,actual);
    }
}