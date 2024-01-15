package by.itacademy.ivanchikov.finalproject.av.page;

public class AvPageXpath {
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
    public static final String BUTTON_CAR_MAKE_SEARCH = "//button[@class='dropdown__listbutton dropdown__listbutton--focus dropdown__listbutton--selected']";
    public static final String MODEL_SELECTION_BUTTON = "//div[@id='p-6-0-3-model']/div/div/button/span/span";
    public static final String MODEL_SELECTION_CONFIRMATION_BUTTON = "//ul[@class='dropdown-list dropdown-list--opened']/li[9]";
    public static final String SHOW_RESULT_BUTTON = "//a[@class='button button--secondary button--block']/span";
    public static final String HEADIN_SPECIAL_EQUIPMENT = "//a[@class='footer__link'][text()='Спецтехника']";
    public static final String MESSANGE_HEADING_SPECIAL_EQUIPMENT = " //h1[@ class='heading__text']";
    public static final String RESULT_TITLE = "//*[text()='Продажа автомобилей Mazda 6']";
}