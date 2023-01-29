package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumDate2 {
    public static WebDriver driver;
    public static void selectSourceAndDestination(String city, String sourceOrDestination) {
        List<WebElement>listOfCities= null;
        if (sourceOrDestination.equals("destination")) {
            driver.findElement(By.id("destination")).sendKeys(city);
            listOfCities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        } else {
            System.out.println("enter valid source and destination");
        }
        for (WebElement element : listOfCities) {
            if (element.getText().equals(city)) {
                element.click();
                break;
            }
        }
    }
        public static void main (String[] args ) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.abhibus.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            selectSourceAndDestination("Mumbai", "destination");
            Thread.sleep(10000);
            driver.quit();
        }
    }
