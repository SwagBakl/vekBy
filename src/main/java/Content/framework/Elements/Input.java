package Content.framework.Elements;

import Content.framework.StartDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Input {

    private By locator;
    private String name;

    StartDriver driverInstance = StartDriver.getInstance();
    WebDriver driver = driverInstance.getDriver();

    public Input(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public void sendKeys(String keys) {
        WebElement input = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        input.sendKeys(keys);
    }
}
