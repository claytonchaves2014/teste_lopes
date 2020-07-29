package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Commons {

    public static WebDriver driver;
    public static final int timeout = 20;
    public static WebDriverWait wait;

    //======================== variável de ambiente de teste ===============================
//    public static String ENV = "automacao";
//    public static String ENV = "dev";
    public static String ENV = "qa";

    public static final String URL_CRM_HOME = "https://" + ENV + "frontportal.lpsbr.com";
//======================================================================================

    @Dado("que eu esteja na tela home do portal")
    public void que_eu_esteja_na_tela_home_do_portal() {
        Commons.configure_browser();
        driver.get(URL_CRM_HOME);

        PageFactory.initElements(driver, PageObjects.Home.class);
    }


    public static void configure_browser() {
        String opt = null;

//        Setar a variavel de ambiente para HEADLESS=false para executar normal

//        if (isHeadless()) {
//             opt = "chrome_headless";
//        } else {
//             opt = "chrome";
//        }
//*********************************************************************
//*********************************************************************

//      opt = "chrome";
        opt = "chrome_headless";

//*********************************************************************
//*********************************************************************

//         opt = "firefox";
//         opt = "firefox_headless";

        ChromeOptions options = new ChromeOptions();
        FirefoxOptions firefoxOptions = new FirefoxOptions();


        switch (opt) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                options.addArguments("--enable-notifications");
                options.addArguments("--mute-audio");
                options.addArguments("--lang=pt-BR");
//                options.addArguments("--lang=en");

                driver = new ChromeDriver(options);
                break;

            case "chrome_headless":
                WebDriverManager.chromedriver().setup();
                options.addArguments("--enable-notifications");
                options.addArguments("--mute-audio");
                options.addArguments("--lang=pt-BR");
                options.addArguments("--headless");

//                if (isHeadless()) {
//                    options.addArguments("--headless");
//                }
                driver = new ChromeDriver(options);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                firefoxOptions.setCapability("marionette", true);

                firefoxOptions.addArguments("--enable-notifications");
                firefoxOptions.addArguments("--mute-audio");
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "firefox_headless":
                WebDriverManager.firefoxdriver().setup();
                firefoxOptions.setCapability("marionette", true);

                firefoxOptions.addArguments("--enable-notifications");
                firefoxOptions.addArguments("--mute-audio");

                if (isHeadless()) {
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);
                break;
        }


//        -----------------------------------------------------------

        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        int size = driver.manage().window().getSize().getWidth();

        if (size < 1400) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }

        wait = new WebDriverWait(driver, timeout);
    }

    private static boolean isHeadless() {

        return !"false".equals(System.getenv("HEADLESS"));
    }
}