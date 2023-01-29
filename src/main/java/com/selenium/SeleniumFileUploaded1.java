package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFileUploaded1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Akshay\\Downloads\\Automation_Testing-20220928T051219Z-001");
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(3000);
//        WebElement e = driver.findElement(By.linkText("has been successfully uploaded."));
//        e.getText();
//        if (e.getText().equals("has been successfully uploaded.")){
//            System.out.println("done");
//        }
        driver.quit();
    }
}
