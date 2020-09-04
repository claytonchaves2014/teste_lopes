package pages;

import support.Setup;

public class FichaGaleria {

    private Setup driver;

    public FichaGaleria(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarAbrirGaleria() {
        driver.click("carousel-fluid-image-0", "id");
    }

    public void verificarGaleria() {
        driver.findElem("//*[@class='product__gallery--modal']", "xpath").isDisplayed();
    }

    public void verificarSubMenuGaleria() {
        driver.findElem("//*[@class='gallery-controller__container--modal gallery-controller__container']", "xpath").isDisplayed();
    }

    public void verificarBtnFechar() {
        driver.findElem("product-modal-close_button", "id").isDisplayed();
    }

    public void verificarListaImg() {
        driver.findElem("product-thumbnail-list", "id").isDisplayed();
    }
}
