package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class CartPage {
    public SelenideElement product_in_cart = $x("//p[@class='product-name']//a[@href='http://prestashop.qatestlab.com.ua/ru/suits/84-grey-suite.html']");
    public SelenideElement quantity_field = $x("//input[@class='cart_quantity_input form-control grey' and @name='quantity_84_0_0_0']");
    public SelenideElement proceed_to_checkout_button = $x("//a[@class='button btn btn-default standard-checkout button-medium']");

    public CartPage checkThatTheProductAddedToCart() {
        product_in_cart.isDisplayed();
        return new CartPage();
    }

    public CartPage userChangeQuantityOfProductTo(String quantity) {
        quantity_field.clear();
        quantity_field.sendKeys(quantity);
        return new CartPage();
    }

    public CartPage checkThatQuantityOfProductEquals(String quantity) {
        Assert.assertEquals(quantity_field.getValue(), quantity, "Value is incorrect");
        return new CartPage();
    }

    public CartPage userClickOnProceedToCheckoutButton() {
        proceed_to_checkout_button.click();
        return new CartPage();
    }
}
