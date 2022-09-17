package org.exampleTestStepDefinitions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginEmailInput")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement signInBtnOnLogInPopup;

    public void inputLoginInfo(String userName, String password){
        this.emailField.click();
        this.emailField.clear();
        this.emailField.sendKeys(userName);

        this.passwordField.click();
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
    }

    public void clickOnSignInBtn(){
        this.signInBtnOnLogInPopup.click();
    }
}
