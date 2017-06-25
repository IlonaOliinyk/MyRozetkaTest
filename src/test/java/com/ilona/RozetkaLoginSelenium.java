package com.ilona;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RozetkaLoginSelenium {

 /* private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

    System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_25.exe");
    driver = new ChromeDriver();
    // driver = new FirefoxDriver();
    System.out.println("Driver = " + driver);
    baseUrl = "http://rozetka.com.ua/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testRozetkaLoginSelenium() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).click();
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("ilona.test@mailinator.com");
    //driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("My1password!");
//    driver.findElement(By.name("remember")).click();
    driver.findElement(By.name("auth_submit")).click();
    Thread.sleep(3000);
    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    assertEquals(driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText(), "Ilona");
    //     assertEquals(driver.findElement(By.xpath(".//*[@id='header_user_menu_parent']/a")).getText(), "Ilona");

  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
}
