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
    public void clicoPageConstruturaseIncorporadoras() throws InterruptedException {
        driver.waitElementToBeClickable("/html/body/app-root/div/landing-page-list/div/nz-list/nz-spin/div/div/div[1]/nz-list-item/a", "xpath");
        driver.forceClick("/html/body/app-root/div/landing-page-list/div/nz-list/nz-spin/div/div/div[1]/nz-list-item/a", "xpath");
        Thread.sleep(3000);
    }
    public void exibirInfoConstrutorasIncorporadoras() {
        driver.findElem("/html/body/app-root/div/landing-page/section/div/div[1]/h2", "xpath").isDisplayed();
    }
}