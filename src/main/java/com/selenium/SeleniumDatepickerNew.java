package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDatepickerNew {
   // public static void month
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
        driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
        String d="24";
        String m="11";
        String y="2022";
        List<WebElement> l1=driver.findElements(By.xpath("//div[@class='ui-datepicker-calendar-container ng-tns-c58-10 ng-star-inserted']//child::table/tbody/tr/td"));
        for (WebElement e : l1){
            if(e.getText().equals(d)){
                e.click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
