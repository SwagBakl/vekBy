package Content.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browsers {

    private static WebDriver driver;

    public static WebDriver getBrowser(String browser) {
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                try {
                    throw new Exception("No such browsers!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return driver;
    }
}
