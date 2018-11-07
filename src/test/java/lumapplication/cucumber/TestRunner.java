package lumapplication.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",

           glue = {"lumapplication.stepDefinition"},
           tags = {"@CreateAccount"})


public class TestRunner {
}
