package ru.google.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSteps {
    @Когда("^пользователь находится на странице \"([^\"]*)\"$")
    public void loadWebPage(String url) {
        open(url);
    }

    @И("^добавляет в строку поиска \"([^\"]*)\", нажимает на кнопку \"Enter\"$")
    public void addTextToSearchField(String s) {
        $(By.name("q")).val(s).pressEnter();
    }

    @То("^поиск выдает (\\d+) записей$")
    public void validateResult(int i) {
        $$("h3[class='LC20lb']").shouldHaveSize(i);

 /*        $("#ires .g").shouldBe(Condition.visible).shouldHave(
                text("Selenide: concise UI tests in Java"),
                text("selenide.org"))*/;
    }
}
