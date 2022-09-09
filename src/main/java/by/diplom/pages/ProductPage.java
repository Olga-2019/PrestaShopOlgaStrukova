package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class ProductPage {

    public SelenideElement name_of_prodact_page = $x("//span[@class='cat-name' and contains(text(),'Women')]");
    public SelenideElement checkBox_suits = $x("//input[@class='checkbox' and @id='layered_category_17']");
    public SelenideElement product_name = $x("//a[@class='product-name' and @title='Light Grey Suite']");
    public SelenideElement product_cart = $x("//img[@class='replace-2x img-responsive' and @alt='Grey Suite']");
    public SelenideElement add_to_cart_button = $x("//a[@data-id-product='84' and span='Add to cart']");
    public SelenideElement cart_field = $x("//div[@class='shopping_cart']//span[@class='ajax_cart_product_txt unvisible']");

    public ProductPage productPageIsOpened() {
        Assert.assertEquals(name_of_prodact_page.getText(), "WOMEN ", "It isn't Product page");
        return new ProductPage();
    }

    public ProductPage userClickOnCheckboxSuits() {
        checkBox_suits.click();
        return new ProductPage();
    }

    public ProductPage productSuiteAppearsOnTheProductPage() {
        Assert.assertEquals(product_name.getText(), "Light Grey Suite", "It's not category suite");
        return new ProductPage();
    }

    public ProductPage userClickOnAddToCartButton() {
        executeJavaScript("window.scrollTo(0,200)");
        product_cart.hover();
        add_to_cart_button.click();
        executeJavaScript("window.scrollTo(0,-200)");
        return new ProductPage();
    }

    public ProductPage clickOnCartField() {
        cart_field.hover();
        cart_field.click();
        return new ProductPage();
    }
}
