package com.herokuapp.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;

public class HoverPage {
    public ElementsCollection resultsFigure = $$("[class=figure]");

    public void HoverPage(int index, String text) {
    resultsFigure.get(index).hover().shouldBe(Condition.text(text));
    }
}
