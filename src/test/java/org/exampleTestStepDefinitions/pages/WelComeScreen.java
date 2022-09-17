package org.exampleTestStepDefinitions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComeScreen {

    public WelComeScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Choose a base']")
    private WebElement choose_a_base_btn;

    @FindBy(xpath = "//div[text()='Actually I’ll browse the library']")
    private WebElement Actually_Ill_browse_the_library_link;

    public void clickOnChooseABaseBtn(){
        this.choose_a_base_btn.click();
    }
    public void clickOnBrowseLibraryLink(){
        this.Actually_Ill_browse_the_library_link.click();
    }
}
