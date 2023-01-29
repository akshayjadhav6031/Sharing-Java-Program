package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumIframe1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        List<WebElement> l=driver.findElements(By.tagName("iframe"));
        System.out.println(l.size());
//        WebElement w = driver.findElement(By.id("//h1[@id='sampleHeading']"));
//     driver.switchTo().frame(w);
// //    driver.switchTo().frame("frame2");
     driver.switchTo().frame(2);
  WebElement w2=   driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(w2.getText());
        driver.quit();
    }
}
