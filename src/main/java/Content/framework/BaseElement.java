package Content.framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseElement {

    private By locator;
    private String name;
    StartDriver startDriver = StartDriver.getInstance();

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public void takeElementScreenshot(By customLocator, String path, String name, String format){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        WebElement element = new WebDriverWait(startDriver.getDriver(), 20)
                .until(ExpectedConditions.presenceOfElementLocated(customLocator));
        File scrFile = element.getScreenshotAs(OutputType.FILE);
        File destFile = new File(path + name + "_" + formatter.format(date) + "." + format);
        try {
            FileUtils.copyFile(scrFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
