package by.itacademy.ivanchikov.finalproject.av.domain;
import com.github.javafaker.Faker;

public class User {
    private static Faker faker;

    public static String getRandomNoCorrectEmail() {
        return faker.internet().password() + "@test.com";
    }

    public static String getRandomCorrectEmail() {
        return faker.internet().safeEmailAddress(faker.name().firstName()+"@test.com");
    }

    public static String getRandomPassword() {
        return faker.internet().password();
    }

    public static String getRandomPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("29");

        for (int i = 1; i < 7; i++) {
            phoneNumber.append(faker.number().randomDigit());
        }
        return phoneNumber.toString();
    }
}
