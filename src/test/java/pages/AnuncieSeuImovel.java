package pages;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import support.Setup;


public class AnuncieSeuImovel {

    private Setup driver;

    public AnuncieSeuImovel(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarAnuncieSeuImovel() {
        driver.click("logo_menu_header-Anuncie seu Imóvel", "id");
    }

    public void informarNome(String value) { driver.sendKeys(value, "name"); }

    public void informarEmail(String value) { driver.sendKeys(value, "email"); }

    public void informarTelefone(String value) {
        driver.sendKeys(value, "phone"); }


    public void clicarOpcao(String value){
        switch (value) {
            case "Vender":
                driver.forceClick("//*[@id=\"SALE\"]/span", "xpath");
                break;
            case "Alugar":
                driver.forceClick("//*[@id=\"RENT\"]/span", "xpath");
                break;

        }
}
        public void selecionarImovel(String value) throws InterruptedException {
            driver.sendKeys("", "owner-select-autocomplete input", "css");
            driver.ScrollTo(driver.findElem("//span[contains(text(),'Apartamento')]", "xpath"));
            Thread.sleep(2000);
            driver.click("//span[contains(text(),'Apartamento')]", "xpath");
            Thread.sleep(2000);
        }

      /*  public void selecionarImovel(String value) throws InterruptedException {
            driver.sendKeys("", "owner-select-autocomplete input", "css");
            driver.ScrollTo(driver.findElem("//span[contains(text(),'Apartamento')]", "xpath"));
            Thread.sleep(2000);
            driver.click("//span[contains(text(),'Apartamento')]", "xpath");
            Thread.sleep(2000);
        }*/

    public void informarCEP(String value) throws InterruptedException {
        WebElement cep = driver.findElem("postalCode");
        driver.sendKeys(value, "postalCode");
        Thread.sleep(2000);
        cep.sendKeys(Keys.TAB);

    }

    public void informarEndereco(String value) { driver.sendKeys(value,"Endereço");
    }

    public void informarNumEndereco(String value) { driver.sendKeys(value, "number"); }

    public void informarBairro(String value) { driver.sendKeys(value, "neighbourhood"); }

    //public void informarCidade(String value) { driver.sendKeys(value, "cidade")}

    public void clicarBtnEnviar(){
        driver.forceClick("body > app-root > div > owner-home > owner-new-advertise > div > div > section.advertise__form > owner-advertise-form > form > button", "css");
    }
    public void informarcpf(String value) { driver.sendKeys(value, "cpf"); }

    public void verificarEnvioFormulario(String value) {
        driver.waitElement("//div[@class='success-txt']", "xpath");
        WebElement mensagem = driver.findElem("//div[@class='success-txt']", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }

    public void verificarNomeInvalido(String value) {
        WebElement mensagem = driver.findElem("/html/body/app-root/div/owner-home/owner-new-advertise/div/div/section[2]/owner-advertise-form/form/owner-input[1]/div/div/span[1]", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }
    public void verificarEmailInvalido(String value) {
        WebElement mensagem = driver.findElem("/html/body/app-root/div/owner-home/owner-new-advertise/div/div/section[2]/owner-advertise-form/form/owner-input[2]/div/div/span[1]", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }
    public void verificarTelefoneInvalido(String value) {
        WebElement mensagem = driver.findElem("/html/body/app-root/div/owner-home/owner-new-advertise/div/div/section[2]/owner-advertise-form/form/owner-phone-input/div/owner-input/div/div/span", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }
    public void verificarOpcaoSemPreenchimento(String value) {
        WebElement mensagem = driver.findElem("/html/body/app-root/div/owner-home/owner-new-advertise/div/div/section[2]/owner-advertise-form/form/div[1]/owner-select-checkbox/div[2]/span", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }

}
