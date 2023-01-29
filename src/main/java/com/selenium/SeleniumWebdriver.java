package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumWebdriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='cleveland-element-close cleveland-close']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='newsletter__close newsletter__trigger']")).click();
        driver.findElement(By.xpath("//a[@class='user-controls__ul__li__a']")).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.close();
    }
}