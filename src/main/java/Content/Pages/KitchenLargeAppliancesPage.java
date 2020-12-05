package Content.Pages;

import Content.framework.BasePage;
import org.openqa.selenium.By;

public class KitchenLargeAppliancesPage extends BasePage {
    private static By locator = By.xpath("//h1[text()='Крупная техника для кухни']");
    private static String name = "";

    public KitchenLargeAppliancesPage() {
        super(locator, name);
    }
}
