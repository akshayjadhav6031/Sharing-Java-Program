package dialypractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillDataWithoutSendKey {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/index.htm");
        WebElement e = driver.findElement(By.id("search-strings"));
        JavascriptExecutor j =(JavascriptExecutor)driver;
        j.executeScript("arguments[0].value='gggg'",e);
        Thread.sleep(3000);
        driver.quit();
    }

}


