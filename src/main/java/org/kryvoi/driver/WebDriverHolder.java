package org.kryvoi.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebDriverHolder {
    private static WebDriverHolder instance = null;
    private WebDriver driver;

    WebDriverHolder() {
        driver = WebDriverFactory.initDriver();
    }

    public static WebDriverHolder getInstance() {
        if (instance == null) {
            instance = new WebDriverHolder();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public JavascriptExecutor javascriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    public void driverQuit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
