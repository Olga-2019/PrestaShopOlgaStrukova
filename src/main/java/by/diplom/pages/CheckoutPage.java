package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CheckoutPage {
    public SelenideElement name_of_checkout_page = $x("//h1[@class='page-subheading']");
    public SelenideElement last_name_field = $x("//input[@id='lastname']");
    public SelenideElement address_field = $x("//input[@id='address1']");
    public SelenideElement zip_cod_field = $x("//input[@id='postcode']");
    public SelenideElement city_field = $x("//input[@id='city']");
    public SelenideElement phone_field = $x("//input[@id='phone']");
    public SelenideElement state_dropdown = $x("//div[@id='uniform-id_state']");
    public SelenideElement oklahoma = $x("//div[@id='uniform-id_state']//option[@value='36']");
    public SelenideElement reference_field = $x("//input[@id='alias']");
    public SelenideElement submit_button = $x("//button[@id='submitAddress']");
    public SelenideElement error_message = $x("//div[@class='alert alert-danger']");
    public SelenideElement first_name_field = $x("//input[@id='firstname']");
    public SelenideElement name_of_myaddresses_page = $x("//h1[@class='page-heading']");


    public CheckoutPage checkoutPageIsOpened() {
        Assert.assertEquals(name_of_checkout_page.getText(), "YOUR ADDRESSES", "It's not Checkout Page");
        return new CheckoutPage();
    }

    public CheckoutPage userFillInLastName(String lastName) {
        last_name_field.sendKeys(lastName);
        return new CheckoutPage();
    }

    public CheckoutPage fillInAddress(String address) {
        address_field.sendKeys(address);
        return new CheckoutPage();
    }

    public CheckoutPage fillInZipPostalCode(String zip) {
        zip_cod_field.sendKeys(zip);
        return new CheckoutPage();
    }

    public CheckoutPage fillInCity(String city) {
        city_field.sendKeys(city);
        return new CheckoutPage();
    }

    public CheckoutPage fillInHomePhone(String homePhone) {
        phone_field.sendKeys(homePhone);
        return new CheckoutPage();
    }

    public CheckoutPage selectsTheValueOfStateOklahoma() {
        executeJavaScript("window.scrollTo(0,400)");
        state_dropdown.click();
        oklahoma.click();
        return new CheckoutPage();
    }

    public CheckoutPage fillInPleaseAssignAnAddressTitleForFutureReference(String reference) {
        reference_field.sendKeys(reference);
        return new CheckoutPage();
    }

    public CheckoutPage clickOnSaveButton() {
        submit_button.click();
        return new CheckoutPage();
    }

    public CheckoutPage userCanSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(error_message.getText(), errorMessage, "Warning");
        return new CheckoutPage();
    }

    public CheckoutPage userFillInFirstName(String firstName) {
        first_name_field.sendKeys(firstName);
        return new CheckoutPage();
    }

    public CheckoutPage myaddressesIsOpened() {
        Assert.assertEquals(name_of_myaddresses_page.getText(), "ADDRESSES", "It isn't MyAddresses page");
        return new CheckoutPage();
    }
}
