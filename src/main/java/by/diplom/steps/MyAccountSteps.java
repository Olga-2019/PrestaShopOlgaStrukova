package by.diplom.steps;

import by.diplom.pages.MyAccountPage;
import by.diplom.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyAccountSteps {
    MyAccountPage myAccountPage = new MyAccountPage();
    ProductPage productPage = new ProductPage();

    @And("click on Women button")
    public void clickOnWomenButton() {
        myAccountPage.clickOnWomenButton();
    }
    @And("Product page is opened")
    public void productPageIsOpened() {
        productPage.productPageIsOpened();
    }

    @Then("user click on checkbox suits")
    public void userClickOnCheckboxSuits() {productPage.userClickOnCheckboxSuits();
    }

    @And("product suite appears on the Product page")
    public void productSuiteAppearsOnTheProductPage() {productPage.productSuiteAppearsOnTheProductPage();
    }

    @Then("user click on Add To Cart button")
    public void userClickOnAddToCartButton() {productPage.userClickOnAddToCartButton();
    }

    @And("click on Cart field")
    public void clickOnCartField() {productPage.clickOnCartField();
    }
}

