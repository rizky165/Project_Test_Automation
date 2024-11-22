package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin      = {"pretty","html:reports/cucumber","json:reports/cucumber.json"},
            glue        = {"stepDef"},
            features    = {"src/test/java/features"},
            tags        = "@web or @api"
    )
    public class ApiRunner {
}
