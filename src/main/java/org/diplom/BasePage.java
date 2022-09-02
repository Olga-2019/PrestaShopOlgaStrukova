package org.diplom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static final String BASE_URL = "http://prestashop.qatestlab.com.ua/en/";
}
