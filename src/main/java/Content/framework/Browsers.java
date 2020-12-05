package Content.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

    public static WebDriver getBrowser(String browser) {
        switch (browser){
            case "CHROME":
                return new ChromeDriver();
            case "FIREFOX":
                return new FirefoxDriver();
            default:
                try {
                    throw new Exception("No such browsers!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            return null;
        }
    }
}
