package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import static com.codeborne.selenide.Selenide.*;

public class FirstLoginPage extends BasePage {

    public SelenideElement loginField = $("#username");
    public SelenideElement passwordField = $("#password");
    public SelenideElement signInButton = $("button.radius");

    public FirstLoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void login(String email, String password) {
        loginField.setValue(email);
        passwordField.setValue(password);
        signInButton.click();
        Driver.waitForUrlContains("secure");
    }
}
