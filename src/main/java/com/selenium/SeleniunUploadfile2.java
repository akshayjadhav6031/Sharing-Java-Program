package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniunUploadfile2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dev2qa.com/demo/upload/uploadFileTest.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Akshay\\Documents\\Akshay Testcase");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(6000);

        driver.quit();
    }

    public static class JsExecuter {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.tutorialspoint.com/index.htm");
            WebElement e = driver.findElement(By.id("search-strings"));
            JavascriptExecutor j =(JavascriptExecutor)driver;
            j.executeScript("arguments[0].value='gggg'",e);
            Thread.sleep(3000);
            driver.quit();
        }

        }
}
