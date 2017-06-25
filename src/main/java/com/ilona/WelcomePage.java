package com.ilona;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage {

    private WebDriver driver;

    public WelcomePage(WebDriver driver){
        this.driver=driver;
    }

    public HomePage positiveLogin(String email, String password) {
        driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys(email);
        //driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("auth_submit")).click();
        return new HomePage(driver);
    }

    public void negativeLogin(String email, String password) throws Exception {
        driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys(email);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("auth_submit")).click();
    }

    public String getErrorMessage() {

        String errorMessage = driver.findElement(By.cssSelector("h5[name=\"password_hint\"]")).getText();
        return errorMessage;
    }
}
