package Content.Pages;

import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.framework.Elements.Label;
import Content.menu.MainMenu;
import org.openqa.selenium.By;

public class AuthorizedPage extends BasePage {

    private static final By authorizedPageLocator = By.xpath("//span[@class = 'userToolsSubtitle']");
    private static final String pageName = "";
    private Button cartButton = new Button(By.xpath("//span[@class = 'headerCartLabel']"), "");
    public MainMenu mainMenu = new MainMenu();

    public AuthorizedPage() {
        super(authorizedPageLocator, pageName);
    }

    public void openCart() {
        cartButton.press();
    }
}
