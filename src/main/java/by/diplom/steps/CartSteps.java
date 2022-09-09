package by.diplom.steps;

import by.diplom.pages.CartPage;
import by.diplom.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartSteps {
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @And("check that the product added to cart")
    public void checkThatTheProductAddedToCart() {
        cartPage.checkThatTheProductAddedToCart();
    }

    @Then("user change quantity of product to {string}")
    public void userChangeQuantityOfProductTo(String quantity) {
        cartPage.userChangeQuantityOfProductTo(quantity);
    }

    @And("check that quantity of product equals {string}")
    public void checkThatQuantityOfProductEquals(String quantity) {
        cartPage.checkThatQuantityOfProductEquals(quantity);
    }

    @Then("user click on Proceed to checkout button")
    public void userClickOnProceedToCheckoutButton() {
        cartPage.userClickOnProceedToCheckoutButton();
    }

    @And("Checkout Page is opened")
    public void checkoutPageIsOpened() {
        checkoutPage.checkoutPageIsOpened();
    }
}
