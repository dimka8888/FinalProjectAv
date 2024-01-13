package by.itacademy.ivanchikov.finalproject.av.ui;

import by.itacademy.ivanchikov.finalproject.av.driver.MyDriver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    @AfterEach
    public void baseFinish() throws InterruptedException {
        Thread.sleep(3000);
        if (MyDriver.getDriver() != null) {
            MyDriver.quitDriver();

        }
    }
}