package pages;

import support.Setup;

public class Favoritos {

    private Setup driver;

    public Favoritos(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarFavoritos() {
        driver.findElem("//*[@class='bookmark-header-component']", "xpath").isDisplayed();
    }

    public void clicarFavoritar() {
        driver.click("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/div/lps-bookmark/div/div", "xpath");
    }
}
