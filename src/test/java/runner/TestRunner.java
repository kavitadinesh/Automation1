package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Automation\\src\\test\\java",
glue={"steps"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
