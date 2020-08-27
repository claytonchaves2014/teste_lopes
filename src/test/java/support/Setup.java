package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;
    private static final long IMPLICITLY_WAIT_TIMEOUT = 80;
    private static final long DEFAULT_WAIT_TIMEOUT = 80;

    public void start(String parBrowser) {
        String title;
        try {
            title = driver.getTitle();
        } catch (Exception e) {
            title = "ERROR";
        }
        if (title.equals("ERROR")) {
            switch (parBrowser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options = new FirefoxOptions();
                    options.addPreference(FirefoxDriver.MARIONETTE, true);
                    driver = new FirefoxDriver(options);
                    driver.manage().window().maximize();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                    ChromeOptions chromeOptions = new ChromeOptions();
//                    chromeOptions.addArguments("--incognito");
                    chromeOptions.addArguments("--disable-geolocation");

                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                    driver = new ChromeDriver(chromeOptions);
                    driver.manage().window().maximize();
                    break;
                default:
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
    }

    private String getAttributeType(String... parType) {
        String type;
        if (parType.length == 0) {
            type = "id";
        } else {
            type = parType[0];
        }
        return type;
    }

    private By getLocatorBy(String parValue, String... parType) {
        final String selector = getAttributeType(parType);
        switch (selector) {
            case "id":
                return By.id(parValue);
            case "name":
                return By.name(parValue);
            case "css":
                return By.cssSelector(parValue);
            case "xpath":
                return By.xpath(parValue);
            case "link":
                return By.linkText(parValue);
            case "class":
                return By.className(parValue);
            case "tag":
                return By.tagName(parValue);
            default:
                return By.id(parValue);
        }
    }

    public WebElement findElem(String parValue, String... parType) {
        final By locator = getLocatorBy(parValue, parType);
        WebElement element;
        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            element = null;
        }
        return element;
    }

    private List<WebElement> findElems(String parValue, String... parType) {
        List<WebElement> elements;
        final By locator = getLocatorBy(parValue, parType);
        try {
            elements = driver.findElements(locator);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            elements = Collections.emptyList();
        }
        return elements;
    }

    public void click(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        element.click();
    }

    public void forceClick(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void openURL(String parUrl) {
        driver.get(parUrl);
    }

    public void quit() {
        driver.quit();
    }

    public void sendKeys(String parText, String parName, String... parType) {
        final WebElement element = findElem(parName, parType);
        element.clear();
        element.sendKeys(parText);
    }

    public void sendKeysNoClear(String parText, String parName, String... parType) {
        final WebElement element = findElem(parName, parType);
        element.sendKeys(parText);
    }

    public String getText(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getText();
    }

    public String getValue(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("value");
    }

    public String getPlaceholder(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("placeholder");
    }

    public String getHref(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("href");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public TakesScreenshot getCamera() {
        return (TakesScreenshot) driver;
    }

    public void waitElementToBeClickable(String parName, String... parType) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        final By locator = getLocatorBy(parName, parType);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (NoSuchElementException e) {
            System.err.println("ERROR WAIT => " + e.toString());
        } catch (TimeoutException e) {
            System.err.println("Element is not clickable => " + e.toString());
        }
    }

    public void waitElement(String parName, String... parType) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        final By locator = getLocatorBy(parName, parType);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (NoSuchElementException e) {
            System.out.println("ERROR WAIT => " + e.toString());
        } catch (TimeoutException e) {
            System.err.println("Timeout reached while waiting for element =>" + e.toString());
        }
    }

    public void waitURL(String... parValue) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        wait.until(ExpectedConditions.urlToBe(String.valueOf(parValue)));
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public void switchTo(String... parValue) {
        if (parValue.length == 0) {
            driver.switchTo().defaultContent();
        } else {
            driver.switchTo().window(String.valueOf(parValue));
        }
    }

    public void switchWin(String... parValue) {
        driver.switchTo().defaultContent();
    }

    public void ScrollTo(WebElement parValue) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", parValue);
    }

    public void allowGeo() {
        driver.switchTo().frame("settings");
        WebElement location = driver.findElement(By.xpath("//input[@name='location' and @value='allow']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", location);
    }
}
