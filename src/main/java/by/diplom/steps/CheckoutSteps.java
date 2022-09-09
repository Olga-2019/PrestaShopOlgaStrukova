package by.diplom.steps;

import by.diplom.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutSteps {
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("user fill in LastName {string}")
    public void userFillInLastName(String lastName) {
        checkoutPage.userFillInLastName(lastName);
    }

    @And("fill in Address {string}")
    public void fillInAddress(String address) {
        checkoutPage.fillInAddress(address);
    }

    @And("fill in Zip code {string}")
    public void fillInZipPostalCode(String zip) {
        checkoutPage.fillInZipPostalCode(zip);
    }

    @And("fill in City {string}")
    public void fillInCity(String city) {
        checkoutPage.fillInCity(city);
    }

    @And("fill in HomePhone {string}")
    public void fillInHomePhone(String homePhone) {
        checkoutPage.fillInHomePhone(homePhone);
    }

    @And("selects the value of State dropdown Oklahoma")
    public void selectsTheValueOfStateOklahoma() {
        checkoutPage.selectsTheValueOfStateOklahoma();
    }

    @And("fill in Please assign an address title for future reference {string}")
    public void fillInPleaseAssignAnAddressTitleForFutureReference(String reference) {
        checkoutPage.fillInPleaseAssignAnAddressTitleForFutureReference(reference);
    }

    @And("click on Save button")
    public void clickOnSaveButton() {
        checkoutPage.clickOnSaveButton();
    }

    @Then("user can see error message {string}")
    public void userCanSeeErrorMessage(String errorMessage) {
    }

    @Then("user fill in FirstName {string}")
    public void userFillInFirstName(String firstName) {
        checkoutPage.userFillInFirstName(firstName);
    }

    @And("MyAddresses is opened")
    public void myaddressesIsOpened() {
        checkoutPage.myaddressesIsOpened();
    }
}
