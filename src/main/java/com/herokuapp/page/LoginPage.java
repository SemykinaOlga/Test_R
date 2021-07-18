package com.herokuapp.page;

import com.codeborne.selenide.SelenideElement;
import com.herokuapp.data.DataGenerator;


import javax.swing.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement login = $("[id=username]");
    SelenideElement pass = $("[id=password]");
    SelenideElement button = $("[type=submit]");

    public SecurePage Login(DataGenerator.AuthInfo info) {
        login.setValue(info.getLogin());
        pass.setValue(info.getPassword());
        button.click();
        return new SecurePage();
    }

}

