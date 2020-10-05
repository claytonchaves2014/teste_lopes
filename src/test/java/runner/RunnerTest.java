package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {
                "pretty",
                "json:target/reports/CucumberReport.json"},
//        tags = {__JENKINS_PIPELINE_TAG__},
        tags = {"@FichaCorretor"},
        glue = {"steps"}
)

public class RunnerTest {

}
