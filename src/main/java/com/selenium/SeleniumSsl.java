package com.selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SeleniumSsl {
  static   WebDriver driver;
    public static void main(String[] args) throws IOException {
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.setAcceptInsecureCerts(true);
//        chromeOptions.setHeadless(false);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file,new File("C:\\Users\\Akshay\\Pictures\\New folder\\file.png"));
        driver.quit();
    }
}
