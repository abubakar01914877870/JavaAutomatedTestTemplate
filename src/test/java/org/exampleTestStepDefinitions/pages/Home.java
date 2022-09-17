package org.exampleTestStepDefinitions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Sign In']")
    private WebElement signInBtn;
    @FindBy(xpath = "//div[@class='userProfile']")
    private WebElement userProfileIcon;

    public void clickOnSignInBtn(){
        this.signInBtn.click();
    }

    public boolean isUserProfileDisplayed(){
        return this.userProfileIcon.isDisplayed();
    }
}
