package com.ilona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;


public class BrowserFactory {

    public static WebDriver getBrowser(String browser) {
        WebDriver driver;
        switch (browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "src/resources/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "opera":
                System.setProperty("webdriver.opera.driver", "src/resources/operadriver.exe");
                driver = new OperaDriver();
                break;
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }
}
