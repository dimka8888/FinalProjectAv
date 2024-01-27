package by.itacademy.ivanchikov.finalproject.av.ui;


import by.itacademy.ivanchikov.finalproject.av.page.AvPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvTest extends BaseTest {
    @Test
    public void testLoginCheck() throws InterruptedException {
        AvPage avPage = new AvPage();
        avPage.openHomePage();
        avPage.clickLoginButtonMain();
        avPage.clickLoginMailTab();
        avPage.sendKeysLoginInputField();
        avPage.sendKeysPasswordInputField();
        avPage.clickLoginButtonСustom();
        avPage.getErrorMessange();
        Assertions.assertEquals("Неверный логин или пароль. Если забыли пароль, восстановите его", avPage.getErrorMessange());
    }

    @Test
    public void testLoginByPhoneNumber() throws InterruptedException {
        AvPage avPage = new AvPage();
        avPage.openHomePage();
        avPage.clickLoginButtonMain();
        avPage.sendKeysPhoneLoginNumber();
        avPage.sendKeysPhonePasswordNumber();
        avPage.clickLoginButtonСustom();
        avPage.getErrorMessangeNumber();
        Assertions.assertEquals("Неверный телефон или пароль. Если забыли пароль, восстановите его", avPage.getErrorMessangeNumber());
    }

    @Test
    public void testSearchStringPage() throws InterruptedException {
        AvPage avPage = new AvPage();
        avPage.openHomePage();
        avPage.clickSearchButtonBrand();
        avPage.clickSendKeysCarMakeSearch();
        avPage.clickShowResultButton();
        avPage.clickModelSelectionButton();
        avPage.clickModelSelectionConfirmationButton();
        avPage.getResultTitle();
        Assertions.assertEquals("Продажа автомобилей Mazda 6", avPage.getResultTitle());
    }

    @Test
    public void testHeaderCheck() throws InterruptedException {
        AvPage avPage = new AvPage();
        avPage.openHomePage();
        avPage.clickHeadingSpecialEquipment();
        avPage.getMessangeHeadingSpecialEquipment();
        Assertions.assertEquals("Продажа спецтехники в Беларуси", avPage.getMessangeHeadingSpecialEquipment());
    }
}
