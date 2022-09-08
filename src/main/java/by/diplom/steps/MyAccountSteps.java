package by.diplom.steps;

import by.diplom.pages.MyAccountPage;
import by.diplom.pages.ProductPage;
import io.cucumber.java.en.And;

public class MyAccountSteps {
    MyAccountPage myAccountPage = new MyAccountPage();
    ProductPage productPage = new ProductPage();

    @And("click on T-SHIRTS button")
    public void clickOnTSHIRTSButton() {
        myAccountPage.goToProductsPage();
    }
    @And("Product page is opened")
    public void productPageIsOpened() {
        productPage.productPageIsOpened();
    }
}

