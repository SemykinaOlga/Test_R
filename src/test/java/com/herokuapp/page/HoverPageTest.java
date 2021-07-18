package com.herokuapp.page;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


class HoverPageTest {
    HoverPage hoverPage = new HoverPage();
    @Test
    void shouldBeFirstUser() {
        open("http://the-internet.herokuapp.com/hovers");
        hoverPage.HoverPage(0, "name: user1");
    }

    @Test
    void shouldBeSecondFirstUser() {
        open("http://the-internet.herokuapp.com/hovers");
        hoverPage.HoverPage(1, "name: user2");
    }

    @Test
    void shouldBeThirdUser() {
        open("http://the-internet.herokuapp.com/hovers");
        hoverPage.HoverPage(2, "name: user3");
    }
}