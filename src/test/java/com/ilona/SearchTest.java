package com.ilona;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SearchTest {

    private WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void rozetkaSetUp(String browser) {
        driver = BrowserFactory.getBrowser(browser);
        String baseUrl = "http://rozetka.com.ua/ua/";
        driver.get(baseUrl);
    }

    @Test
    public void positiveSearchTest() throws Exception {
        HomePage hp = new HomePage(driver);
        hp.search("samsung");
        Thread.sleep(3000);
        String firstLinkText = hp.getFirstLinkText().toLowerCase();
        hp.takeScrinshot();
        System.out.println("TEXT: " + firstLinkText);
        Assert.assertTrue(firstLinkText.contains("samsung"));
    }

    @Test
    public void negativeSearchTest() throws Exception {
        HomePage hp = new HomePage(driver);
        hp.search("lenovo");
        Thread.sleep(3000);
        String firstLinkText = hp.getFirstLinkText().toLowerCase();
        hp.takeScrinshot();
        System.out.println("TEXT: " + firstLinkText);
        Assert.assertFalse(firstLinkText.contains("samsung"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
