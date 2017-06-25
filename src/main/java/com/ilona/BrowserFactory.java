package com.ilona;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;


public class BrowserFactory {

    public static WebDriver getBrowser(int i) {
        WebDriver driver;
        switch (i) {
            case 0:
                System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_25.exe");
                driver = new ChromeDriver();
                break;
            case 1:
                driver = new FirefoxDriver();
                break;
            case 2:
                System.setProperty("webdriver.ie.driver","src/resources/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case 3:
                System.setProperty("webdriver.opera.driver", "D:/Ripon/operadriver_win64/operadriver.exe");
                driver = new OperaDriver();
                break;
            default:
                driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }
}
