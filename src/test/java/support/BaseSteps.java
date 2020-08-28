package support;

public class BaseSteps {

    protected static Setup driver = new Setup();

    public BaseSteps(){
        driver.start("chrome");
    }
}
