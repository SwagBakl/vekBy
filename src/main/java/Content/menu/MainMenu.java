package Content.menu;

import Content.enums.MainMenuItems;
import Content.framework.BasePage;
import Content.framework.Elements.Button;
import org.openqa.selenium.By;

public class MainMenu extends BasePage {

    private static final By menuLocator = By.xpath("");
    private static final String menuName = "";
    private static By menuItems = By.xpath("//dl[@class = 'navigationList']");
    private Button menuItem;

    public MainMenu() {
        super(menuLocator, menuName);
    }

    public void pressOnMenuItem(MainMenuItems item) {
        menuItem = new Button(By.xpath(String.format("//span[text() = '%s']", item.item)), "");
        menuItem.press();
    }
}
