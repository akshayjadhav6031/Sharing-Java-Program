package com.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumCookies1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        driver.manage().window().maximize();
        Cookie a1 = new Cookie("cookie1","111111111111");
        Cookie a2 = new Cookie("cookie2","2222222222222");
        driver.manage().addCookie(a1);
        driver.manage().addCookie(a2);
        driver.manage().getCookieNamed("cookie1");
        driver.manage().deleteCookie(a1);
        driver.manage().deleteCookieNamed("cookie2");
        driver.manage().deleteAllCookies();
        Set<Cookie>cookies = driver.manage().getCookies();
        for (Cookie a : cookies){
            System.out.println(a);
        }
        driver.quit();
    }
}
