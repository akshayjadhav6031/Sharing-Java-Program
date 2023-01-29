package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMoveTo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement e=driver.findElement(By.xpath("//li[text()='A']"));
        WebElement h=driver.findElement(By.xpath("//li[text()='H']"));
        Actions a=new Actions(driver);
        a.clickAndHold(e).moveToElement(h).build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
