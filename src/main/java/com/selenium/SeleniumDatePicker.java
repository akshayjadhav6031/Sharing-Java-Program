package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumDatePicker {
    public static WebDriver driver;

    public static void selectSourceAndDestination(String city, String sourceOrDestination) {
        List<WebElement> l = null;
        if (sourceOrDestination.equals("source")) {
            driver.findElement(By.id("src")).sendKeys(city);
            l = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//child::li"));
        } else if (sourceOrDestination.equals("destination")) {
            driver.findElement(By.id("dest")).sendKeys(city);
            l = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//child::li"));
        } else {
            System.out.println("enter valid source and destination");
        }
        for (WebElement element : l) {
            if (element.getText().equals(city)) {
                element.click();
                break;
            }
        }
    }

    public static void selectddmmyy(String s1,String s2) {
        List<WebElement> l2 = null;
        if (s2.equals("select1")) {
            driver.findElement(By.xpath("card rounded-0 p-2 text-secondary w-100 mb-2 d-block")).sendKeys(s1);
            l2 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//child::div"));
        } else if (s2.equals("select2")) {
            l2 = driver.findElements(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//child::div"));
        }else if (s2.equals("select3")){
            driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).sendKeys(s1);
        }
           for (WebElement element2 : l2) {
            if (element2.getText().equals("year")) {
                element2.click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        selectSourceAndDestination("Pune", "source");
        selectSourceAndDestination("Mumbai", "destination");
        String date = "24";
        String month = "11";
        String year = "2022";
        driver.findElement(By.id("onward_cal")).click();
        driver.findElement(By.className("next")).click();
        selectddmmyy("date","select1");
        selectddmmyy("month","select2");
        selectddmmyy("year","select3");
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//child::tbody/tr/td"));
        for (WebElement e1 : dates) {
            if (e1.getText().equals(date)) {
                e1.click();
                break;
            }
        }
        Thread.sleep(6000);
        driver.quit();
    }
}




