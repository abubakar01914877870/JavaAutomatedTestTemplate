package org.exampleTestStepDefinitions.pages;

import org.exampleTestStepDefinitions.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    Helper helper;
    public Home() {
        this.helper = new Helper();
    }

    By signInBtnLocator = By.xpath("//button[text()='Sign In']");
    By userProfileIconLocator = By.xpath("//div[@class='userProfile']");
    By logOutBtnLocator = By.xpath("//li/span[@class='userLogout']");
    By messagePopupLocator = By.xpath("//div[@class='closePanel']/em[@class='icon-cancel'])");
    By mainLogoLocator = By.xpath("//div/a/img[@class='mainLogo']");

    public void clickOnSignInBtn(WebDriver driver){
        WebElement signInBtn = helper.locateWebElementAfterElementIsVisible(driver, signInBtnLocator);
        signInBtn.click();

    }

    public void clickOnMainLogo(WebDriver driver){
        WebElement mainLogo = helper.locateWebElementAfterElementIsClickable(driver, mainLogoLocator);
        Actions action = new Actions(driver);
        action.moveByOffset(mainLogo.getLocation().getX(), mainLogo.getLocation().getY())
                .build()
                .perform();
    }
    public void clickOnUserProfileIcon(WebDriver driver){
        WebElement userProfileIcon = helper.locateWebElementAfterElementIsVisible(driver, userProfileIconLocator);
        userProfileIcon.click();
    }

    public void clickLogOutBtn(WebDriver driver){
        WebElement logOutBtn = helper.locateWebElementAfterElementIsVisible(driver, logOutBtnLocator);
        logOutBtn.click();
    }
}
