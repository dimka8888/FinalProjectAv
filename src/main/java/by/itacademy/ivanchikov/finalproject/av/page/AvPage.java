package by.itacademy.ivanchikov.finalproject.av.page;


import by.itacademy.ivanchikov.finalproject.av.domain.Random;
import by.itacademy.ivanchikov.finalproject.av.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AvPage {
    private WebDriver driver;
    public AvPage() {
        this.driver = MyDriver.getDriver();
    }
    public void openHomePage() {
        driver.get("https://av.by/");
    }
    public void clickLoginButtonMain() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_MAIN)).click();
        Thread.sleep(3000);
    }
    public void clickLoginMailTab() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_MAIL_TAB)).click();
        Thread.sleep(3000);
    }
    public void sendKeysLoginInputField() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_INPUT_FIELD)).sendKeys(Random.getComplexRandomMail());
        Thread.sleep(3000);
    }
    public void sendKeysPasswordInputField() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.PASSWORD_INPUT_FIELD)).sendKeys(Random.getComplexRandomPassword());
        Thread.sleep(3000);
    }
    public void clickLoginButtonСustom() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.LOGIN_BUTTON_СUSTOM)).click();
        Thread.sleep(3000);
    }
    public String getErrorMessange() {
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE)).getText();
    }
        public void sendKeysPhoneLoginNumber() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.PHONE_LOGIN_NUMBER)).sendKeys(Random.getComplexRandomNumber());
        Thread.sleep(3000);
    }
    public void sendKeysPhonePasswordNumber() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.PHONE_PASSWORD_NUMBER)).sendKeys(Random.getComplexRandomPassword());
        Thread.sleep(3000);
    }
    public String getErrorMessangeNumber() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(AvPageXpath.ERROR_MESSANGE_NUMBER)).getText();
    }
    public void clickSearchButtonBrand() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.SEARCH_BUTTON_BRAND)).click();
        Thread.sleep(3000);
    }
    public void clickSendKeysCarMakeSearch() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).click();
        driver.findElement(By.xpath(AvPageXpath.CAR_MAKE_SEARCH)).sendKeys("Mazda");
        Thread.sleep(3000);
    }
    public void clickButtonCarMakeSearch() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.BUTTON_CAR_MAKE_SEARCH)).click();
        Thread.sleep(3000);
    }
    public void clickModelSelectionButton() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_BUTTON)).click();
        Thread.sleep(3000);
    }
    public void clickModelSelectionConfirmationButton() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.MODEL_SELECTION_CONFIRMATION_BUTTON)).click();
        Thread.sleep(3000);
    }
    public void clickShowResultButton() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.SHOW_RESULT_BUTTON)).click();
        Thread.sleep(3000);
    }
    public String getResultTitle() throws InterruptedException {
        Thread.sleep(3000);

        return driver.findElement(By.xpath(AvPageXpath.RESULT_TITLE)).getText();
    }
    public void clickHeadingSpecialEquipment() throws InterruptedException {
        driver.findElement(By.xpath(AvPageXpath.HEADIN_SPECIAL_EQUIPMENT)).click();
        Thread.sleep(3000);
    }
    public String getMessangeHeadingSpecialEquipment() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(AvPageXpath.MESSANGE_HEADING_SPECIAL_EQUIPMENT)).getText();
    }
}
