package org.exampleTestStepDefinitions.pages;

import org.exampleTestStepDefinitions.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    Helper helper;
    public Login() {
        helper = new Helper();
    }

    By emailFieldLocator = By.id("loginEmailInput");
    By passwordFieldLocator = By.name("password");
    By signInBtnOnLogInPopupLocator = By.xpath("//button[text()='Sign in']");

    public void inputLoginInfo(WebDriver driver, String userName, String password){
        WebElement emailField = helper.locateWebElementAfterElementIsVisible(driver, emailFieldLocator);
        emailField.click();
        emailField.clear();
        emailField.sendKeys(userName);

        WebElement passwordField = helper.locateWebElementAfterElementIsVisible(driver, passwordFieldLocator);
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnSignInBtn(WebDriver driver){
        WebElement signInBtnOnLogInPopup = helper.locateWebElementAfterElementIsVisible(driver, signInBtnOnLogInPopupLocator);
        signInBtnOnLogInPopup.click();
    }
}
