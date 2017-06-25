package com.ilona;

import org.apache.commons.lang3.text.StrBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.attribute.SetOfIntegerSyntax;

public class HomePage {

    private WebDriver driver;

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public String getUserName() {
        String userName = driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText();
        return userName;
    }

    public HomePage search(String searchText) {
        driver.findElement(By.name("text")).clear();
        driver.findElement(By.name("text")).sendKeys(searchText);
        driver.findElement(By.name("rz-search-button")).click();
        StringBuilder sb = new StringBuilder();

        return this;
    }

    public String getFirstLinkText() {
        String firstLinkText = driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[2]/div/div/div/div/div[2]/a")).getText();
        return firstLinkText;
    }
}