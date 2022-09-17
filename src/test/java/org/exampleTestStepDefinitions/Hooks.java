package org.exampleTestStepDefinitions;

import com.google.common.base.Predicate;
import io.cucumber.java.*;
import io.cucumber.java.tlh.a;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @BeforeAll
    public static void webDriverSetup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeStep
    static void waitForPageLoad() {
        WebDriver driver = WebDriverHolder.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        JavascriptExecutor jScriptExecutor = (JavascriptExecutor) driver;
        System.out.println(jScriptExecutor.executeScript("return document.readyState").toString());
        wait.equals(jScriptExecutor.executeScript("return document.readyState").toString().equals("complete"));
    }
    @Before
    public void webDriverCreate(){
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverHolder.setDriver(driver);
    }

    @After
    public void tearDown(){
        WebDriverHolder.driver.quit();
    }


}
