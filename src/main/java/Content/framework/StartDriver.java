package Content.framework;

import Content.LoadFromProperty;
import org.openqa.selenium.WebDriver;

public class StartDriver {

    private static WebDriver driver = null;
    private static StartDriver startDriverInstance = null;
    private static String URL = LoadFromProperty.getProperty("URL");
    private static String BROWSER = LoadFromProperty.getProperty("browser");

    private StartDriver() {
        driver = Browsers.getBrowser(BROWSER);
        if (driver != null) {
            driver.manage().window().maximize();
            driver.navigate().to(URL);
        }
    }

    public static StartDriver getInstance() {
        if(startDriverInstance == null) {
            startDriverInstance = new StartDriver();
        }
        return startDriverInstance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit() {
        driver.quit();
    }
}
