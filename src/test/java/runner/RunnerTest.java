package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static steps.FichaImovelSteps.*;
import static steps.HomeBuscaSteps.*;
import static steps.HomeFiltrosSteps.*;
import static steps.HomeFooterSteps.*;
import static steps.HomeHeaderSteps.*;
import static steps.ResultadosBuscaSteps.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"usage:target/usage"
                , "pretty"
                , "json:target/reports/CucumberReport.json"},
        glue = {"steps"},
        monochrome = true,
        tags = {"@REGRESSAO"}
)

public class RunnerTest {

}
