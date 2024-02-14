package by.itacademy.ivanchikov.finalproject.av.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void checkLoginWithIncorrectPasswordAndLogin() {
        logger.info("App test log message.");
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String body = "{\n" +
                "    \"login\": \"dmitry{{$randomInt}}@mail.ru\",\n" +
                "    \"password\": \"123456778\"\n" +
                "}";
        given().body(body).headers(headers).when()
                .body("https://api.av.by/auth/login/sign-in").
                then().
                statusCode(400).
                body("messageText", equalTo("Неверный логин или пароль. Если забыли пароль, восстановите его"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithEmptyPasswordAndlogin() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String body = "{\n" +
                "    \"login\": \"\",\n" +
                "    \"password\": \"\"\n" +
                "}";
        given().body(body).headers(headers).when()
                .body("https://api.av.by/auth/login/sign-in").
                then().
                statusCode(400).
                body("messageText", equalTo("Запрос не соответствует правилам валидации"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String body = "{\n" +
                "    \"login\": \"viktor{{$randomInt}}@mail.ru\",\n" +
                "    \"password\": \"\"\n" +
                "}";
        given().body(body).headers(headers).when()
                .body("https://api.av.by/auth/login/sign-in").
                then().
                statusCode(400).
                body("messageText", equalTo("Запрос не соответствует правилам валидации"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithRemovedLoginField() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String body = "{\"\"password\":\"alina{{$randomInt}}@mail.ru\"}";
        given().body(body).headers(headers).when()
                .body("https://api.av.by/auth/login/sign-in").
                then().
                statusCode(400).
                body("messageText", equalTo("Неверный запрос"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithRemovedLoginAndPasswordField() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        String body = "{}";
        given().body(body).headers(headers).when()
                .body("https://api.av.by/auth/login/sign-in").
                then().
                statusCode(400).
                body("messageText", equalTo("Запрос не соответствует правилам валидации"));
        logger.info("Test passed \n");
    }
}
