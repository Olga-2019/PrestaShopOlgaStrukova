package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public SelenideElement sign_in_button = $x("//a[@class='login']");
    public SelenideElement submit_button = $x("//button[@name='SubmitLogin']");
    public SelenideElement emailField = $x("//input[@name=\"email\"]");
    public SelenideElement passwordField = $x("//input[@id='passwd']");


    public LoginPage openPage(String url) {
        open(url);
        return new LoginPage();
    }

    public LoginPage clickSignInButton() {
        sign_in_button.click();
        return new LoginPage();
    }

    public LoginPage fillInTheEmail(String user) {
        emailField.sendKeys(user);
        return new LoginPage();
    }

    public LoginPage fillInThePassword(String password) {
        passwordField.sendKeys(password);
        return new LoginPage();
    }

    public LoginPage clickOnSubmitButton() {
        submit_button.click();
        return new LoginPage();
    }
}
