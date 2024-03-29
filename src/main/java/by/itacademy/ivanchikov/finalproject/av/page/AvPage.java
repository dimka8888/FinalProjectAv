package by.itacademy.ivanchikov.finalproject.av.page;


import by.itacademy.ivanchikov.finalproject.av.domain.Random;
import by.itacademy.ivanchikov.finalproject.av.domain.User;
import by.itacademy.ivanchikov.finalproject.av.driver.DriverSingleton;
import by.itacademy.ivanchikov.finalproject.av.utils.Waiter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AvPage {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(10));

    public AvPage() {
        this.driver = DriverSingleton.getDriver();
    }

    public void openHomePage() {
        driver.get("https://av.by/");
    }

    public void clickLoginButtonMain() {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_MAIN)).click();
    }

    public void clickLoginMailTab() {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_MAIL_TAB)).click();
    }

    public void sendKeysLoginInputField() {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_INPUT_FIELD)).sendKeys(User.getRandomNoCorrectEmail());
    }

    public void sendKeysPasswordInputField() {
        driver.findElement(By.xpath(AvPageXpath.PASSWORD_INPUT_FIELD)).sendKeys(Random.getComplexRandomPassword());
    }

    public void clickLoginButtonСustom() {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_СUSTOM)).click();
    }

    public String getErrorMessange() {
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE)).getText();
    }

    public void sendKeysPhoneLoginNumber() {
        driver.findElement(By.xpath(AvPageXpath.PHONE_LOGIN_NUMBER)).sendKeys(Random.getComplexRandomNumber());
    }

    public void sendKeysPhonePasswordNumber() {
        driver.findElement(By.xpath(AvPageXpath.PHONE_PASSWORD_NUMBER)).sendKeys(Random.getComplexRandomPassword());
    }

    public String getErrorMessangeNumber() {
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE_NUMBER)).getText();
    }

    public void clickSearchButtonBrand() {
        driver.findElement(By.xpath(AvPageXpath.SEARCH_BUTTON_BRAND)).click();
    }

    public void clickSendKeysCarMakeSearch() {
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).click();
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).sendKeys("Mazda" + Keys.ENTER);
        Waiter.wairFor(5);
    }

    public void clickModelSelectionButton() {
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_BUTTON)).click();
       Waiter.wairFor(5);
    }

    public void clickModelSelectionConfirmationButton() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_CONFIRMATION_BUTTON)).click();
        Waiter.wairFor(6);
    }

    public void clickShowResultButton() {
        driver.findElement(By.xpath(AvPageXpath.SHOW_RESULT_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public String getResultTitle() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(By.xpath(AvPageXpath.RESULT_TITLE)).getText();
    }

    public void clickHeadingSpecialEquipment() {
        driver.findElement(By.xpath(AvPageXpath.HEADIN_SPECIAL_EQUIPMENT)).click();
    }

    public String getMessangeHeadingSpecialEquipment() {
        return driver.findElement(By.xpath(AvPageXpath.MESSANGE_HEADING_SPECIAL_EQUIPMENT)).getText();
    }
}
