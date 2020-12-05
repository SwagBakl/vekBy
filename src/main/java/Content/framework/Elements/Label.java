package Content.framework.Elements;

import Content.framework.StartDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Label {

    private By locator;
    private String name;

    StartDriver driverInstance = StartDriver.getInstance();
    WebDriver driver = driverInstance.getDriver();

    public Label(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public boolean isEnabled() {
        WebElement label = new WebDriverWait(driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        return label.isEnabled();
    }
}
