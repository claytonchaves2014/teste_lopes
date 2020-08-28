package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.TakesScreenshot;
import support.BaseSteps;

import static org.openqa.selenium.OutputType.BYTES;
public class Hooks extends BaseSteps {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("--- Scenario Started  >>> " + scenario.getName() + " <<< ---");
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("\n--- Scenario Finished >>> " + scenario.getName() + " <<< ---");

        if(scenario.isFailed()){
            driver.quit();
            return;
        }

        scenario.write("URL: " + driver.getCurrentUrl());

        if (driver instanceof TakesScreenshot) {
            TakesScreenshot camera = (TakesScreenshot) driver;
            byte[] screenshot = camera.getScreenshotAs(BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driver.quit();
    }
}