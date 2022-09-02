package Tests;

import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Log4j2
public class LogInTest extends BaseTest {

    @Test
    @Description("Check that user can login with valid credentials")
    public void userShouldLoginWithValidCredentials() {
        loginPage.openPage();
        loginPage.login(user, password);
        assertEquals(myAccountPage.myAccountPageOpened(), "MY ACCOUNT", "This isn't My account Page");
    }
}
