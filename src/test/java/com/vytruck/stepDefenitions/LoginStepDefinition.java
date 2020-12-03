package com.vytruck.stepDefenitions;
//go-go-go
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
    public void i_user_enters_valid_credentials()  {
        loginPage.login();
    }

    @Then("user should be able to get main page")
    public void user_should_be_able_to_get_main_page() {

        String expected = "Dashboard";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expected,actual);
    }


    //============================================================================



    @When("user logs in with wrong password")
    public void userLogsInWithWrongPassword() {
        loginPage.wronglogin();
    }


    @Then("user verifies that he used wrong credentials and get message is displayed")
    public void userVerifiesThatHeUsedWrongCredentialsAndGetMessageIsDisplayed() {

        String expected = "Invalid user name or password.";
        String actual = loginPage.alertMessage.getText();

        Assert.assertEquals(expected,actual);



    }
    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);

    }


    @Then("user should see {string} page")
    public void userShouldSeePage(String string) {
        String actual = Driver.getDriver().getTitle().trim();
        Assert.assertEquals("Page title is not correct!", string, actual);


    }
}



