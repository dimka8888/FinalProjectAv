package by.itacademy.ivanchikov.finalproject.av.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AvPageXpath {
    private static final Logger logger = LogManager.getLogger();
    public static final String LOGIN_INPUT_FIELD = "//input[@id='authLogin']";
    public static final String PASSWORD_INPUT_FIELD = "//input[@id='loginPassword']";
    public static final String LOGIN_BUTTON_MAIN = "//span[text()='Войти']";
    public static final String LOGIN_MAIL_TAB = "//button[text()='почте или логину']";
    public static final String LOGIN_BUTTON_СUSTOM = " //button[@class='button button--action'] ";
    public static final String ERROR_MESSANGE = "//*[text()='Неверный логин или пароль. Если забыли пароль, восстановите его']";
    public static final String FOOTER_SITE = " //p[@class='footer__copy']";
    public static final String PHONE_LOGIN_NUMBER = "//input[@id='authPhone']";
    public static final String PHONE_PASSWORD_NUMBER = "//input[@id='passwordPhone']";
    public static final String ERROR_MESSANGE_NUMBER = "//div[@class='error-message']";
    public static final String SEARCH_BUTTON_BRAND = "//span[@class='dropdown-floatlabel__value']";
    public static final String CAR_MAKE_SEARCH = "//input[@class='dropdown__input']";
    public static final String MODEL_SELECTION_BUTTON = "//div[@class='catalog__list']//*[text()='6']";
    public static final String MODEL_SELECTION_CONFIRMATION_BUTTON = "//button[@class='button button--secondary button--block']";
    public static final String SHOW_RESULT_BUTTON = "//div[@class='filter__show-result']";
    public static final String HEADIN_SPECIAL_EQUIPMENT = "//a[@class='footer__link'][text()='Спецтехника']";
    public static final String MESSANGE_HEADING_SPECIAL_EQUIPMENT = " //h1[@ class='heading__text']";
    public static final String RESULT_TITLE = "//*[text()='Продажа автомобилей Mazda 6']";
}