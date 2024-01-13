package by.itacademy.ivanchikov.finalproject.av.page;


import by.itacademy.ivanchikov.finalproject.av.domain.Random;
import by.itacademy.ivanchikov.finalproject.av.domain.User;
import by.itacademy.ivanchikov.finalproject.av.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AvPage {
    private String LoginInputField = "//input[@id='authLogin']";
    private String PasswordInputField = "//input[@id='loginPassword']";
    private String LoginButtonMain = "//span[text()='Войти']";
    private String LoginMailTab = "//button[text()='почте или логину']";
    private String LoginButtonСustom = " //button[@class='button button--action'] ";
    private String ErrorMessange = "//*[text()='Неверный логин или пароль. Если забыли пароль, восстановите его']";
    private String FooterSite = " //p[@class='footer__copy']";
    private String PhoneLoginNumber = "//input[@id='authPhone']";
    private String PhonePasswordNumber = "//input[@id='passwordPhone']";
    private String ErrorMessangeNumber = "//div[@class='error-message']";
    public String SearchButtonBrand = "//span[@class='dropdown-floatlabel__value']";
    public String CarMakeSearch = "//input[@class='dropdown__input']";
    public String ButtonCarMakeSearch = "//button[@class='dropdown__listbutton dropdown__listbutton--focus dropdown__listbutton--selected']";
    public String ModelSelectionButton = "//div[@id='p-6-0-3-model']/div/div/button/span/span";
    public String ModelSelectionConfirmationButton = "//ul[@class='dropdown-list dropdown-list--opened']/li[9]";
    public String ShowResultButton = "//a[@class='button button--secondary button--block']/span";
    public String HeadingSpecialEquipment = "//a[@class='footer__link'][text()='Спецтехника']";
    public String MessangeHeadingSpecialEquipment = " //h1[@ class='heading__text']";
    public String ResultTitle = "//*[text()='Продажа автомобилей Mazda 6']";
    private WebDriver driver;

    public AvPage() {
        this.driver = MyDriver.getDriver();
    }

    public void openHomePage() {
        driver.get("https://av.by/");
    }

    public void clickLoginButtonMain() throws InterruptedException {
        driver.findElement(By.xpath(LoginButtonMain)).click();
        Thread.sleep(3000);
    }

    public void clickLoginMailTab() throws InterruptedException {
        driver.findElement(By.xpath(LoginMailTab)).click();
        Thread.sleep(3000);
    }

    public void sendKeysLoginInputField() throws InterruptedException {
        driver.findElement(By.xpath(LoginInputField)).sendKeys(Random.getComplexRandomMail());
        Thread.sleep(3000);
    }

    public void sendKeysPasswordInputField() throws InterruptedException {
        driver.findElement(By.xpath(PasswordInputField)).sendKeys(Random.getComplexRandomPassword());
        Thread.sleep(3000);
    }

    public void clickLoginButtonСustom() throws InterruptedException {
        driver.findElement(By.xpath(LoginButtonСustom)).click();
        Thread.sleep(3000);

    }

    public String getErrorMessange() {
        return driver.findElement(By.xpath(ErrorMessange)).getText();
    }

    public String getFooterSite() {
        return driver.findElement(By.xpath(FooterSite)).getText();
    }

    public void sendKeysPhoneLoginNumber() throws InterruptedException {
        driver.findElement(By.xpath(PhoneLoginNumber)).sendKeys(Random.getComplexRandomNumber());
        Thread.sleep(3000);
    }
    public void sendKeysPhonePasswordNumber() throws InterruptedException {
        driver.findElement(By.xpath(PhonePasswordNumber)).sendKeys(Random.getComplexRandomPassword());
        Thread.sleep(3000);
    }

    public String getErrorMessangeNumber() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(ErrorMessangeNumber)).getText();
    }

    public void clickSearchButtonBrand() throws InterruptedException {
        driver.findElement(By.xpath(SearchButtonBrand)).click();
        Thread.sleep(3000);
    }

    public void clickSendKeysCarMakeSearch() throws InterruptedException {
        driver.findElement(By.xpath(CarMakeSearch)).click();
        driver.findElement(By.xpath(CarMakeSearch)).sendKeys("Mazda");
        Thread.sleep(3000);
    }

    public void clickButtonCarMakeSearch() throws InterruptedException {
        driver.findElement(By.xpath(ButtonCarMakeSearch)).click();
        Thread.sleep(3000);
    }

    public void clickModelSelectionButton() throws InterruptedException {
        driver.findElement(By.xpath(ModelSelectionButton)).click();
        Thread.sleep(3000);
    }

    public void clickModelSelectionConfirmationButton() throws InterruptedException {
        driver.findElement(By.xpath(ModelSelectionConfirmationButton)).click();
        Thread.sleep(3000);
    }

    public void clickShowResultButton() throws InterruptedException {
        driver.findElement(By.xpath(ShowResultButton)).click();
        Thread.sleep(3000);
    }

    public String getResultTitle() throws InterruptedException {
        Thread.sleep(3000);

        return driver.findElement(By.xpath(ResultTitle)).getText();
    }

    public void clickHeadingSpecialEquipment() throws InterruptedException {
        driver.findElement(By.xpath(HeadingSpecialEquipment)).click();
        Thread.sleep(3000);
    }

    public String getMessangeHeadingSpecialEquipment() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath(MessangeHeadingSpecialEquipment)).getText();
    }
}

