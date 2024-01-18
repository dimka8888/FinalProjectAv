package by.itacademy.ivanchikov.finalproject.av;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class testCalcApi {
    @Test
    public void testCalc() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", "a")
                .formParam("height", "175")
                .formParam("weight", "80")
                .formParam("gender", "m")
                .when()
                .post("https://svyatoslav.biz/testlab/wt/index.php")
                .then()
                .log()
                .body();
    }

    @Test
    public void testCalc1() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", "")
                .formParam("height", "175")
                .formParam("weight", "80")
                .formParam("gender", "m")
                .when()
                .post("https://svyatoslav.biz/testlab/wt/index.php")
                .then()
                .log()
                .body();
    }

    @Test
    public void testCalc3() {
        String getbody = "name=%D0%B0&height=175&weight=80&gender=m";
        given()
                .contentType("application/x-www-form-urlencoded")
                .body(getbody)
                .when()
                .post("https://svyatoslav.biz/testlab/wt/index.php")
                .then()
                .log()
                .body();
    }
}
