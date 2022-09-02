package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.diplom.BasePage;
import org.diplom.LoginPage;
import org.diplom.MyAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    BasePage basePage;
    String user;
    String password;
    MyAccountPage myAccountPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);

        user = System.getProperty("user", PropertyReader.getProperty("user"));
        password = System.getProperty("password", PropertyReader.getProperty("password"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
