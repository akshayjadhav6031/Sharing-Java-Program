package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement e=driver.findElement(By.id("//button[@id='3iJR6']"));
        Actions a = new Actions(driver);
        a.click(e).perform();
        Thread.sleep(3000);
        driver.close();
    }
}
