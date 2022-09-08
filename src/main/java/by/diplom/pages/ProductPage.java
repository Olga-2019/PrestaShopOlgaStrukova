package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage{

    public SelenideElement name_of_prodact_page = $x("//span[@class='cat-name' and contains(text(),'T-shirts')]");

    public ProductPage productPageIsOpened() {
        Assert.assertEquals(name_of_prodact_page.getText(), "T-shirts", "It isn't Product page");
        return new ProductPage();
    }
}
