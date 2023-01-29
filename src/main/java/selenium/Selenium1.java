package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
            driver.findElement(By.id("login1")).sendKeys("akshayjadhav.6031@gmail.com");

        List<WebElement>list=driver.findElements(By.tagName("output"));
        System.out.println(list.size());
        for (WebElement e : list){
            System.out.println(e);
        }
        Thread.sleep(6000);
        driver.close();

    }
}
