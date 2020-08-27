package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"usage:target/usage"
                , "pretty"
                , "json:target/reports/CucumberReport.json"
                , "html:target/html/"},
        glue = {"steps"},
        tags = {"@REGRESSAO"}
)

public class RunnerTest {

}
