import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@regression",
        features = "src/main/resources/features/prestaShop",
        glue = {"stepdefinations", "utility"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "pretty", "html:/target/cucumber"}
)
public class RunFeaturesTest {

}

