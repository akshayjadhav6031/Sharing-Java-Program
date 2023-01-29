package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyboardActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement e = driver.findElement(By.xpath("//div[@class='search-expand-text']"));
        // e.click();
      // JavascriptExecutor js=(JavascriptExecutor) driver;
     //   js.executeScript("argument[0].scrollIntoView()",e);
        Actions a=new Actions(driver);
        a.click(e).perform();
      //  Thread.sleep(3000);
        a.keyDown(Keys.SHIFT).sendKeys("selenium").perform();
        a.keyUp(Keys.SHIFT).release();
        Thread.sleep(5000);
        driver.close();

    }
}
