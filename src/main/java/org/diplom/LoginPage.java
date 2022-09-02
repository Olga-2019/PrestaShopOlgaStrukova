package org.diplom;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By USER_NAME_INPUT = By.id("email");
    private final By PASSWORD_INPUT = By.id("passwd");
    private final By SIGNIN_BUTTON = By.id("SubmitLogin");
    private final By SIGN_IN_BUTTON = By.xpath("//div[@class='header_user_info']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL);
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public LoginPage login(String user, String password) {
        driver.findElement(USER_NAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(SIGNIN_BUTTON).click();
        return this;
    }
}