package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragandDrop2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        WebElement w1 =driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement w2 =driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions a = new Actions(driver);
        a.dragAndDrop(w1,w2).perform();
        a.release();
        Thread.sleep(4000);
        driver.close();

    }
}
