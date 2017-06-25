package com.ilona;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebBrowser {

    private static WebDriver driver;

    public static synchronized WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_25.exe");
            driver = new ChromeDriver();
            //driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        return driver;
    }

}
