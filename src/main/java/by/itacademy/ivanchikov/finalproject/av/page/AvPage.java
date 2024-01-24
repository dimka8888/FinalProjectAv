package by.itacademy.ivanchikov.finalproject.av.page;


import by.itacademy.ivanchikov.finalproject.av.domain.Random;
import by.itacademy.ivanchikov.finalproject.av.driver.MyDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AvPage {
    private WebDriver driver;

    public AvPage() {
        this.driver = MyDriver.getDriver();
    }

    public void openHomePage() {
        driver.get("https://av.by/");
    }

    public void clickLoginButtonMain() {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_MAIN)).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    public void clickLoginMailTab()  {
               driver.findElement(By.xpath(AvPageXpath.LOGIN_MAIL_TAB)).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    public void sendKeysLoginInputField()  {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_INPUT_FIELD)).sendKeys(Random.getComplexRandomMail());
    }

    public void sendKeysPasswordInputField() {
        driver.findElement(By.xpath(AvPageXpath.PASSWORD_INPUT_FIELD)).sendKeys(Random.getComplexRandomPassword());

    }

    public void clickLoginButtonСustom()  {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_СUSTOM)).click();
    }

    public String getErrorMessange()  {
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE)).getText();
    }

    public void sendKeysPhoneLoginNumber()  {
                driver.findElement(By.xpath(AvPageXpath.PHONE_LOGIN_NUMBER)).sendKeys(Random.getComplexRandomNumber());

    }

    public void sendKeysPhonePasswordNumber()  {
        driver.findElement(By.xpath(AvPageXpath.PHONE_PASSWORD_NUMBER)).sendKeys(Random.getComplexRandomPassword());

    }

    public String getErrorMessangeNumber()  {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE_NUMBER)).getText();

    }

    public void clickSearchButtonBrand() {
        driver.findElement(By.xpath(AvPageXpath.SEARCH_BUTTON_BRAND)).click();

    }

    public void clickSendKeysCarMakeSearch()  {
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).click();
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).sendKeys("Mazda"+ Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickModelSelectionButton()  {
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_BUTTON)).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickModelSelectionConfirmationButton()  throws InterruptedException {
           driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_CONFIRMATION_BUTTON)).click();
        Thread.sleep(7000);
    }

    public void clickShowResultButton()  {
              driver.findElement(By.xpath(AvPageXpath.SHOW_RESULT_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public String getResultTitle() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
               return driver.findElement(By.xpath(AvPageXpath.RESULT_TITLE)).getText();
    }

    public void clickHeadingSpecialEquipment()  {
        driver.findElement(By.xpath(AvPageXpath.HEADIN_SPECIAL_EQUIPMENT)).click();

    }

    public String getMessangeHeadingSpecialEquipment() {
               return driver.findElement(By.xpath(AvPageXpath.MESSANGE_HEADING_SPECIAL_EQUIPMENT)).getText();
    }
}
