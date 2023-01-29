package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(6000);
        driver.findElements(By.xpath("//input[@id='login1']"));
  //      driver.findElement(By.name("email")).sendKeys("akshayjadhav.6031@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("123456789");
//        driver.findElement(By.partialLinkText("Create")).click();
      //  Thread.sleep(3000);
//        List<WebElement> list = driver.findElements(By.tagName("////button[@name='login']"));
//        for (WebElement e : list){
//            System.out.println(e);
//        }
        driver.close();
    }
}
