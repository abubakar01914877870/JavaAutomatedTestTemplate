package org.exampleTestStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.exampleTestStepDefinitions.pages.Home;
import org.exampleTestStepDefinitions.pages.Login;
import org.exampleTestStepDefinitions.pages.WelComeScreen;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginStepDefinitions{

    WebDriver driver = WebDriverHolder.getDriver();

    @Given("I go to url {string}")
    public void i_go_to_url(String url) {
        driver.get(url);
    }

    @Given("I skip welcome screen")
    public void iSkipWelcomeScreen() {
        WelComeScreen welcomePage = new WelComeScreen(driver);
        welcomePage.clickOnChooseABaseBtn();
        welcomePage.clickOnBrowseLibraryLink();
    }

    @Given("open login popup")
    public void openLoginPopup() {
        Home homePage = new Home(driver);
        homePage.clickOnSignInBtn();
    }
    @When("enter user name {string} and password {string}")
    public void enterUserNameAndPassword(String userName, String password) {
        Login loginPopup = new Login(driver);
        loginPopup.inputLoginInfo(userName, password);
        loginPopup.clickOnSignInBtn();
    }
    @Then("check for login status")
    public void checkForLoginStatus() {
        Home homePage = new Home(driver);
        System.out.println(homePage.isUserProfileDisplayed());
    }
}
