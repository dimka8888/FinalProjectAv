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
        logger.info("Home page av.by is opened");
    }

    public void clickLoginButtonMain() {
        logger.info("Click login button main");
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_MAIN)).click();
    }

    public void clickLoginMailTab() {
        logger.info("Click login main tab");
        driver.findElement(By.xpath(AvPageXpath.LOGIN_MAIL_TAB)).click();
    }

    public void sendKeysLoginInputField() {
        logger.info("Send keys email");
        driver.findElement(By.xpath(AvPageXpath.LOGIN_INPUT_FIELD)).sendKeys(User.getRandomNoCorrectEmail());
    }

    public void sendKeysPasswordInputField() {
        logger.info("Send keys password");
        driver.findElement(By.xpath(AvPageXpath.PASSWORD_INPUT_FIELD)).sendKeys(Random.getComplexRandomPassword());
    }

    public void clickLoginButtonСustom() {
        logger.info("Click login button custom");
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_СUSTOM)).click();
    }

    public String getErrorMessange() {
        logger.info("getErrorMessange method returns text:");
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE)).getText();
    }

    public void sendKeysPhoneLoginNumber() {
        logger.info("Send keys phone number");
        driver.findElement(By.xpath(AvPageXpath.PHONE_LOGIN_NUMBER)).sendKeys(Random.getComplexRandomNumber());
    }

    public void sendKeysPhonePasswordNumber() {
        logger.info("Send keys phone password");
        driver.findElement(By.xpath(AvPageXpath.PHONE_PASSWORD_NUMBER)).sendKeys(Random.getComplexRandomPassword());
    }

    public String getErrorMessangeNumber() {
        logger.info("getErrorMessangeNumbe method returns text:");

        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE_NUMBER)).getText();
    }

    public void clickSearchButtonBrand() {
        logger.info("Click search button brand");
        driver.findElement(By.xpath(AvPageXpath.SEARCH_BUTTON_BRAND)).click();
    }

    public void clickSendKeysCarMakeSearch() {
        logger.info("Click car make search:");
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).click();
        logger.info("Send keys car make serch:"+Keys.ENTER);
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).sendKeys("Mazda" + Keys.ENTER);
        Waiter.wairFor(5);
    }

    public void clickModelSelectionButton() {
        logger.info("Click model selection button");
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_BUTTON)).click();
        Waiter.wairFor(5);
    }

    public void clickModelSelectionConfirmationButton()  {
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
