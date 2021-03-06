package app.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {

    /**
     * Локаторы для страницы CartPage
     */

    protected SelenideElement buttonOrder = $x("//button[contains(@class,'b-btn-do-order')]");
    protected SelenideElement ButtonSelectAddressInDialog = $x("//div[contains(@class,'contents__self')]//button[contains(@class,'popup__btn-main btn__choose-address')]");
    protected SelenideElement buttonSelectAddress = $x("//div[contains(text(),'Выбрать адрес')]");
    protected ElementsCollection buttonFirstAddress = $$x("//div[contains(@class,'address-item j-poo-option')]//div[@class='address-item__name']");
    protected SelenideElement buttonApplyLocation = $x("//button[@type='submit'][contains(text(),'Выбрать')]");
    protected SelenideElement buttonPaidByCard = $x("//p[contains(text(),'Картой')]");
    protected SelenideElement inputName = $x("//div[..//div[contains(text(),'Имя')]]//input[@name='orderDetails.NewFirstName']");
    protected SelenideElement inputSurname = $x("//div[..//div[contains(text(),'Фамилия')]]//input[@name='orderDetails.NewLastName']");
    protected SelenideElement inputPhone = $x("//input[contains(@class,'input-item')]");
    protected SelenideElement buttonConfirmOrder = $x("//button[contains(@class,'j-btn-confirm-order')]");
    protected SelenideElement textErrorIncorrectName = $x("//span[contains(@class,'field-validation-error')][contains(text(),'Некорректное имя')]");
    protected SelenideElement textErrorIncorrectSurname = $x("//span[contains(@class,'field-validation-error')][contains(text(),'Некорректная фамилия')]");
    protected SelenideElement buttonEnter = $x("//a[contains(text(),'Войти')]");

    /** Методы для тестов */

    /**
     * Сценарий №1. Проход по полному БП
     */

    public CartPage assertTextNameOfProductShouldBeVisible(String nameOfProduct) {
        SelenideElement textNameOfProduct = $x("//span[contains(@class,'good-name')][contains(text(),'" + nameOfProduct + "')]");
        Assert.assertTrue((textNameOfProduct).shouldBe(Condition.visible).isDisplayed());
        return this;
    }

    public CartPage clickButtonOrder() {
        (buttonOrder).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage clickButtonSelectAddress() {
        (buttonSelectAddress).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage clickButtonSelectAddressInDialog() {
        (ButtonSelectAddressInDialog).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage clickButtonFirstAddress(int index) {
        (buttonFirstAddress).shouldBe(CollectionCondition.sizeGreaterThan(0));
        buttonFirstAddress.get(index).click();
        return this;
    }

    public CartPage clickButtonApplyLocation() {
        (buttonApplyLocation).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage clickButtonPaidByCard() {
        (buttonPaidByCard).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage setInputName(String textName) {
        (inputName).shouldBe(Condition.visible).setValue(textName);
        return this;
    }

    public CartPage setInputSurname(String textSurname) {
        (inputSurname).shouldBe(Condition.visible).setValue(textSurname);
        return this;
    }

    public CartPage setInputPhone(String textPhone) {
        (inputPhone).shouldBe(Condition.visible).setValue(textPhone);
        return this;
    }

    public CartPage clickButtonConfirmOrder() {
        (buttonConfirmOrder).shouldBe(Condition.visible).click();
        return this;
    }

    public CartPage assertTextErrorIncorrectNameShouldBeVisible() {
        (textErrorIncorrectName).shouldBe(Condition.visible).isDisplayed();
        return this;
    }

    public CartPage assertTextErrorIncorrectSurnameShouldBeVisible() {
        (textErrorIncorrectSurname).shouldBe(Condition.visible).isDisplayed();
        return this;
    }

    public CartPage clickButtonEnter() {
        (buttonEnter).shouldBe(Condition.visible).click();
        return this;
    }
}