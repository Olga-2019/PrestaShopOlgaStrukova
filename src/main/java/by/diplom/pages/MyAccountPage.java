package by.diplom.pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;
public class MyAccountPage {

    public SelenideElement my_account = $x("//h1[contains(text(),'My account')]");

    public SelenideElement women_button = $x("//a[contains(text(), 'Women') and @class='sf-with-ul']");

    public MyAccountPage myAccountPageIsOpened() {
        Assert.assertEquals(my_account.getText(), "MY ACCOUNT", "It isn't My account page");
        return new MyAccountPage();
    }
    public MyAccountPage clickOnWomenButton() {
        women_button.click();
        return new MyAccountPage();
    }
}





