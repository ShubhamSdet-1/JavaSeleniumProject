package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "src/test/test/features",
		glue = {"utility","stepDefinition"},
		plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
		)

public class TestRunner {

}
