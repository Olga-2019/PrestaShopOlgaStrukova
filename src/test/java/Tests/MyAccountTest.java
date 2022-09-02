package Tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyAccountTest extends BaseTest {

    @Test
    @Description("Check that user go to products page")
    public void goToProductsPage() {
        loginPage.openPage();
        loginPage.login(user, password);
        myAccountPage.goToProductsPage();
        assertEquals(myAccountPage.productsPageOpened(), "T-SHIRTS", "This isn't Products Page");
    }

    @Test
    @Description("Сheck that the product has been added to the cart")
    public void productHasBeenAddedToTtheCart() {
        loginPage.openPage();
        loginPage.login(user, password);



    }
}
