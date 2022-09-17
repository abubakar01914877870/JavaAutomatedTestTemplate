package org.exampleTestStepDefinitions;

import org.openqa.selenium.WebDriver;

public class WebDriverHolder {
    public static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebDriverHolder.driver = driver;
    }
}
