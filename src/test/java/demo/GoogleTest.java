package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() {
    

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Title is: " + driver.getTitle());
          System.out.println("subhashhogalesangavi2");
        driver.quit();
    }
}
