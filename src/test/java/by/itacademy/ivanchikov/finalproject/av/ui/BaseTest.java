package by.itacademy.ivanchikov.finalproject.av.ui;

import by.itacademy.ivanchikov.finalproject.av.driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    @AfterEach
    public void baseFinish() throws InterruptedException {
        Thread.sleep(3000);
        if (DriverSingleton.getDriver() != null) {
            DriverSingleton.quitDriver();

        }
    }
}