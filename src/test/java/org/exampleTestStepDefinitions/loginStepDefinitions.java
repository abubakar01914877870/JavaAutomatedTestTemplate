package org.exampleTestStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginStepDefinitions {
    private final WebDriver driver = WebDriverManager.chromedriver().create();

    @Given("I go to url {string}")
    public void i_go_to_url(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @When("I login using user {string} and password {string}")
    public void i_login_using_user_and_password(String userName, String password) {
        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));

        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    @Then("I check page url {string}")
    public void i_check_page_url(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        assertEquals(actualUrl, expectedUrl);
    }
    @When("I click logout button")
    public void i_click_logout_button() {
        WebElement menuBtn = driver.findElement(By.id("react-burger-menu-btn"));
        menuBtn.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
        logoutBtn.click();
    }
}
