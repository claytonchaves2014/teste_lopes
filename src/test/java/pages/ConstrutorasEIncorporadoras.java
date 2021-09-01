package pages;

import support.Setup;

public class ConstrutorasEIncorporadoras {

    private Setup driver;

    public ConstrutorasEIncorporadoras(Setup stepDriver) {
        driver = stepDriver;
    }



    public void vejoPageConstruturaseIncorporadoras() {
        driver.findElem("//*[@class='landing-page-list']", "xpath").isDisplayed();


    }
}
