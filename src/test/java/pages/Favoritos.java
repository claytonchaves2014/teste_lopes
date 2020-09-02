package pages;

import support.Setup;

public class Favoritos {

    private Setup driver;

    public Favoritos(Setup stepDriver) {
        driver = stepDriver;
    }

    public void selecionarFavorito() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[1]/lps-product-gallery/div/div[2]/div[2]/lps-bookmark/div/div", "xpath");
    }

    public void verificarFavoritos() {
        driver.findElem("//*[@class='cardlist cardlist--search ng-star-inserted']", "xpath").isDisplayed();
    }
}
