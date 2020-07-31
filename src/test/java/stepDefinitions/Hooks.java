package stepDefinitions;


import io.cucumber.java.After;

import static stepDefinitions.Commons.driver;

public class Hooks {

    @After()
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
