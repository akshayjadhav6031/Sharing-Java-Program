package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement e=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement e1=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions a= new Actions(driver);
        a.dragAndDrop(e,e1).perform();
        a.release();
        Thread.sleep(5000);
        driver.close();

    }
}
