package by.itacademy.ivanchikov.finalproject.av.domain;

import org.apache.commons.lang3.RandomStringUtils;

public class Random {
    public static String getComplexRandomMail() {
        String lowerCharacters = "abcde";
        String upperCharacters = "ABCDE";
        String numberCharacters = "0123456789";
        return RandomStringUtils.random(1, lowerCharacters)
                + RandomStringUtils.random(1, upperCharacters)
                + RandomStringUtils.random(1, numberCharacters)
                + System.currentTimeMillis()
                + "@mail.com";
    }

    public static String getComplexRandomPassword() {
        String lowerCharacters = "abcdefghijklmnopqrstuvwxyz";
        String upperCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberCharacters = "0123456789";
        return RandomStringUtils.random(1, lowerCharacters)
                + RandomStringUtils.random(1, upperCharacters)
                + RandomStringUtils.random(1, numberCharacters)
                + System.currentTimeMillis();
    }

    public static String getComplexRandomNumber() {
        String numberCharacters = "0123456789";
        return "33" + RandomStringUtils.random(7, numberCharacters);
    }
}



