package com.herokuapp.data;

import com.github.javafaker.Faker;
import lombok.Value;


public class DataGenerator {
    DataGenerator() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }
    private static String validLogin = "tomsmith";
    private static String validPassword = "SuperSecretPassword!";

    public static AuthInfo getValidInfo() {
        return new AuthInfo(validLogin, validPassword);
    }

    public static String getBadLogin() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String getBadPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static AuthInfo getNotValidLogin() {
        return new AuthInfo(getBadLogin(), validPassword);
    }

    public static AuthInfo getNotValidPassword() {
        return new AuthInfo(validLogin, getBadPassword());
    }
}

