package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDate3 {
    public static WebDriver driver;
    public static void leavingFromGoingTo(String leavingFrom,String goingTo){
        if(leavingFrom.equals("source")){
            driver.findElements(By.id("//ul[@id='ui-id-1']//child::li"));
            driver.findElement(By.id("//li[@id='ui-id-117']"));

        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        leavingFromGoingTo("pune","source");
//        driver.findElement(By.id("source")).sendKeys("pune");
//        driver.findElement(By.id("destination")).sendKeys("mumbai");
        Thread.sleep(5000);
        driver.quit();
    }
}