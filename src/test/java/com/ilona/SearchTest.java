package com.ilona;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchTest {
    private WebDriver driver;

    @BeforeMethod
    public void rozetkaSetUp() {
        driver = BrowserFactory.getBrowser(0);
        String baseUrl = "http://rozetka.com.ua/ua/";
        driver.get(baseUrl);
    }

    @Test
    public void positiveSearchTest() throws Exception {
        HomePage hp = new HomePage(driver);
        hp.search("samsung");
        Thread.sleep(3000);
        String firstLinkText = hp.getFirstLinkText().toLowerCase();
        System.out.println("TEXT: " + firstLinkText);
        Assert.assertTrue(firstLinkText.contains("samsung"));
    }

    @Test
    public void negativeSearchTest() throws Exception {
        HomePage hp = new HomePage(driver);
        hp.search("lenovo");
        Thread.sleep(3000);
        String firstLinkText = hp.getFirstLinkText().toLowerCase();
        System.out.println("TEXT: " + firstLinkText);
        Assert.assertFalse(firstLinkText.contains("samsung"));
    }

        @AfterMethod
        public void tearDown () {
            driver.quit();
        }

}
