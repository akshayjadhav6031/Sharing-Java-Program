package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumDate {
    public static WebDriver driver;
    public static void selectSourceAndDestination(String s1,String s2){
        List<WebElement> l = null;
        if(s2.equals("source")){
            driver.findElement(By.id("source")).sendKeys(s1);
            l=driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        }else if (s2.equals("destination")){
            driver.findElement(By.id("destination")).sendKeys(s1);
           l= driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        }else {
            System.out.println("enter valid source and destination");
        }
        for(WebElement element: l){
            if (element.getText().equals(s1)){
                element.click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        selectSourceAndDestination("Pune","source");
        selectSourceAndDestination("Mumbai","destination");
        driver.quit();
    }
}
