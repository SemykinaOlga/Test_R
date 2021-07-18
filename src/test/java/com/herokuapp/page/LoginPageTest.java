package com.herokuapp.page;


import com.herokuapp.data.DataGenerator;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

class LoginPageTest {
    LoginPage loginPage = new LoginPage();
    SecurePage securePage = new SecurePage();

    @Test
    void ShouldBeSuccessLogin() {
        open("http://the-internet.herokuapp.com/login");
        loginPage.Login(DataGenerator.getValidInfo());
        securePage.SecurePage("You logged into a secure area!");
    }

    @Test
    void ShouldBeFailedByNotValidLogin() {
        open("http://the-internet.herokuapp.com/login");
        loginPage.Login(DataGenerator.getNotValidLogin());
        securePage.SecurePage("Your username is invalid!");
    }

    @Test
    void ShouldBeFailedByNotValidPassword() {
        open("http://the-internet.herokuapp.com/login");
        loginPage.Login(DataGenerator.getNotValidPassword());
        securePage.SecurePage("Your password is invalid!");
    }
}