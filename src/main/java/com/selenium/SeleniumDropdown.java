package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        //country.selectByVisibleText("INDIA");
       // country.selectByIndex(3);
        country.selectByValue("ICELAND");
        Thread.sleep(5000);
        driver.close();
    }
}
