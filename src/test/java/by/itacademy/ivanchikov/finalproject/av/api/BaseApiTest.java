package by.itacademy.ivanchikov.finalproject.av.api;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    private static final String BASE_URL = "https://api.av.by/auth/login/sign-in";

    public static void checkPasswordAndLogin(String login, String password) {

        String body = "{\n" +
                "    \"login\": \"" + login + "\",\n" +
                "    \"password\": \"" + password + "\"\n" +
                "}";

    }

    public static void fillingBody(String getBody, int getStatusCode) {
        given()
                .header("Content-Type", "application/json")
                .body(getBody)
                .when()
                .post(BASE_URL)
                .then()
                .assertThat().statusCode(getStatusCode);
    }
}
