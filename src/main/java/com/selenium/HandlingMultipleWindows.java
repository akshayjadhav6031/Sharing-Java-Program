package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class  HandlingMultipleWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        String s=driver.getWindowHandle();
        System.out.println(s);
        Set<String> s1=driver.getWindowHandles();
        System.out.println(s1);
        driver.quit();

    }
}
