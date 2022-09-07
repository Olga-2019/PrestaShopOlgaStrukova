package org.diplom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public SelenideElement sign_in_button = $("//a[@class='login']");
    public SelenideElement sign_out_button = $("//a[@class='logout']");
    public SelenideElement submit_button = $("//button[@name='SubmitLogin']");
public SelenideElement emailField = $ ("//input[@name=\"email\"]");
public SelenideElement passwordField = $ ("//input[@id='passwd']");


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
