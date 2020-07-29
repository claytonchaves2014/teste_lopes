package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","usage:target/usage", "pretty:target/pretty", "summary", "json:target/cucumber.json", "html:target/html/", "junit:target/cucumber-reports/Cucumber.xml",}
        plugin = {"usage:target/usage"
                , "pretty"
                , "summary"
                , "json:target/cucumber.json"
                , "html:target/html/"
                , "junit:target/cucumber-reports/Cucumber.xml"}
        , features = {
        "src/test/resources/features/PORTAL"
}
        , glue = {"stepDefinitions"}
        , monochrome = true
//        , tags = {"@MVP_CRM_HOME_REVISAO"}
        , tags = {"@MVP_revisao_notificacoes"}

)
public class TestRunner {

}
