package by.diplom.steps;

import by.diplom.pages.LoginPage;
import by.diplom.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("user is on {string} page")
    public void userIsOnPage(String url) {
        loginPage.openPage(url);
    }

    @And("click on Sign In button")
    public void clickSignInButton() {
        loginPage.clickSignInButton();
    }

    @And("fill in the email {string}")
    public void fillInTheEmail(String user) {
        loginPage.fillInTheEmail(user);
    }

    @And("fill in the password {string}")
    public void fillInThePassword(String password) {
        loginPage.fillInThePassword(password);
    }

    @And("click on Signin button")
    public void clickOnSubmitButton() {
loginPage.clickOnSubmitButton();
    }
    @Then("My account page is opened")
    public void myAccountPageIsOpened() {myAccountPage.myAccountPageIsOpened();
    }
}