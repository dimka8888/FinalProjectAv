package by.itacademy.ivanchikov.finalproject.av.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        } else
            driver.quit();
    }
    public void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds*5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
