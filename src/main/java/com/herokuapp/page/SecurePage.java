package com.herokuapp.page;


import lombok.Value;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
@Value
public class SecurePage {

    public void SecurePage(String text) {
        $("#flash").shouldBe(text(text));
    }
}
