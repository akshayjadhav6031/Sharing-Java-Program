package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HandlingMultipleWindows3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        WebElement v =driver.findElement(By.xpath("//span[text()='MNC']"));
        v.click();
        String s = driver.getWindowHandle();
        System.out.println(s);
        Set<String> s1 = driver.getWindowHandles();
        System.out.println(s1);
        for (String s2:s1) {
            if (!(s).contentEquals(s2)) {
                driver.switchTo().window(s2);
//                WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
//                w.until(ExpectedConditions.elementToBeClickable(v));
             //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                Thread.sleep(5000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(s);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
