package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "by.diplom.steps",
        plugin = {"pretty", "html:/target/cucumber.html", "json:target/cucumber.json"}
)
public class RunFeaturesTest extends AbstractTestNGCucumberTests {

}

