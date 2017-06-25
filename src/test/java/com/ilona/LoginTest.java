package com.ilona;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    private WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void rozetkaSetUp(String browser) {
        driver = BrowserFactory.getBrowser(browser);
        String baseUrl = "http://rozetka.com.ua/ua/";
        driver.get(baseUrl);
    }


    @Test
    public void positiveLoginTest() throws Exception{
        WelcomePage wp = new WelcomePage(driver);
        HomePage hp = wp.positiveLogin("ilona.test@mailinator.com", "My1password!");
        Thread.sleep(3000);
        String userName = hp.getUserName();
        Assert.assertEquals(userName,"Ilona");
    }

    @Test
    public void negativeLoginTest() throws Exception{
        WelcomePage wp = new WelcomePage(driver);
        wp.positiveLogin("ilona.test@mailinator.com", "my1pass");
        Thread.sleep(3000);
        String errorMessage = wp.getErrorMessage();
        Assert.assertEquals(errorMessage,"Введено невірний пароль!");
        // Assert.assertFalse(errorMessage.isEmpty());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
