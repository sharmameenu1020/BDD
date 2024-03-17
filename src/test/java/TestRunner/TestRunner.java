package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features =".//Features/Login.feature", glue ="StepDefinition",dryRun = true,monochrome = false,plugin = {
        "pretty", "html:target/Cucumber-report/LoginNew.html" })

public class TestRunner
{

}
