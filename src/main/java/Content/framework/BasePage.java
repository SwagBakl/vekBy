package Content.framework;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class BasePage {

    private By locator;
    private String name;
    StartDriver startDriver = StartDriver.getInstance();

    public BasePage(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public boolean isPresent() {
        WebElement page = new WebDriverWait(startDriver.getDriver(), 30)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        return page.findElements(locator).size() > 0;
    }

    protected List<WebElement> findElements(By locatorThis) {
         return startDriver.getDriver().findElements(locatorThis);
    }

    protected WebElement findElement(By locator) {
        return new WebDriverWait(startDriver.getDriver(), 30)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void takeScreenShot(String path, String name, String format) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        TakesScreenshot screenshot = ((TakesScreenshot)startDriver.getDriver());
        File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + name + "_" + formatter.format(date) + "." + format);
        try {
            FileUtils.copyFile(scrFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshotAnotherWay(String path, String name, String format) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(startDriver.getDriver());
        try {
            ImageIO.write(screenshot.getImage(), format,
                    new File(path + name + formatter.format(date) + "." + format));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
