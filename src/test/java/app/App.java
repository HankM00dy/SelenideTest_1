package app;

import app.pages.*;

public class App {

    public FirstLoginPage firstLoginPage;
    public CardOfProductPage cardOfProductPage;
    public CartPage cartPage;
    public CatalogPage catalogPage;
    public LoginPage loginPage;
    public MainPage mainPage;
    public MenCategoryPage menCategoryPage;
    public ShoesCategoryPage shoesCategoryPage;

    public App() {
        firstLoginPage = PageBuilder.buildFirstLoginPage();
        cardOfProductPage = PageBuilder.buildCardOfProductPage();
        cartPage = PageBuilder.buildCartPage();
        catalogPage = PageBuilder.buildCatalogPage();
        loginPage = PageBuilder.buildLoginPage();
        mainPage = PageBuilder.buildMainPage();
        menCategoryPage = PageBuilder.buildMenCategoryPage();
        shoesCategoryPage = PageBuilder.buildShoesCategoryPage();
    }
}
