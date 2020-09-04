package pages;

import org.junit.Assert;
import support.Setup;

public class FichaSEO {

    private Setup driver;

    public FichaSEO(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarTitle() {
        String title = driver.getTitle();
        Assert.assertFalse(title.isEmpty());
    }

    public void verificarMetaDescription() {
        String description = driver.findElem("//meta[@name='description']", "xpath").getAttribute("content");
        Assert.assertFalse(description.isEmpty());
    }

    public void verificarCanonical() {
        String canonical = driver.findElem("//link[@rel='canonical']", "xpath").getAttribute("href");
        Assert.assertFalse(canonical.isEmpty());
    }

    public void verificarLinksInternos() {
        driver.findElem("//*[@class='internal-link-widget']", "xpath").isDisplayed();
    }
}
