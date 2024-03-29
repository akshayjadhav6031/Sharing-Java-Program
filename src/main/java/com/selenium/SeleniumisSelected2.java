package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumisSelected2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement element =driver.findElement(By.xpath("//select[@id='carselect']"));   //false
                                                  //if i pass(//option[@value='bmw'])    //pass
        element.click();
        System.out.println(element.isSelected());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
