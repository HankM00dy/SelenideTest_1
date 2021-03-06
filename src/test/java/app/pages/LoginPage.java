package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    /**
     * Локаторы для страницы LoginPage
     */

    protected SelenideElement textHeadingEnterInYourProfile = $x("//h2[contains(text(),'Войти или создать профиль')]");

    /** Методы для тестов */

    /**
     * Сценарий №1. Проход по полному БП
     */

    public LoginPage assertTextHeadingEnterInYourProfileShouldBeVisible() {
        (textHeadingEnterInYourProfile).shouldBe(Condition.visible).isDisplayed();
        return this;
    }
}
