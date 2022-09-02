package org.diplom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    private final By MY_ACCOUNT = By.xpath("//h1[contains(text(),\"My account\")]");
    private final By T_SHIRTS = By.xpath("//a[contains(text(), 'T-shirts')]");
    private final By NAME_OF_PRODUCT_PAGE = By.xpath("//span[@class='cat-name' and contains(text(),'T-shirts')]");


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String myAccountPageOpened() {
        return driver.findElement(MY_ACCOUNT).getText();
    }

    public void goToProductsPage() {
        driver.findElement(T_SHIRTS).click();
    }
    public String productsPageOpened() {
        return driver.findElement(NAME_OF_PRODUCT_PAGE).getText();
    }

//    addingProductToTheCart
}

