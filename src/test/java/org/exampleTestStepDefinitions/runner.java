package org.exampleTestStepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features", glue = "org.exampleTestStepDefinitions",
        monochrome = true,
        snippets = CAMELCASE,
        dryRun = false,
        plugin = {
        "pretty", "html:target/reports/htmlReports.html"
        }
)
public class runner {
}
