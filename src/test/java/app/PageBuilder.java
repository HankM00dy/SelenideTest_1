package app;

import app.pages.*;

public class PageBuilder {

    public static FirstLoginPage buildFirstLoginPage() {
        return new FirstLoginPage("/login");
    }

    public static CardOfProductPage buildCardOfProductPage() {
        return new CardOfProductPage();
    }

    public static CartPage buildCartPage() {
        return new CartPage();
    }

    public static CatalogPage buildCatalogPage() {
        return new CatalogPage();
    }

    public static LoginPage buildLoginPage() {
        return new LoginPage();
    }

    public static MainPage buildMainPage() {
        return new MainPage();
    }

    public static MenCategoryPage buildMenCategoryPage() {
        return new MenCategoryPage();
    }

    public static ShoesCategoryPage buildShoesCategoryPage() {
        return new ShoesCategoryPage();
    }
}
