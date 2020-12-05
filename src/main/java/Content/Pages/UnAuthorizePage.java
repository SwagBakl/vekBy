package Content.Pages;

import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.menu.MainMenu;
import org.openqa.selenium.By;

public class UnAuthorizePage extends BasePage {

    private final Button accountButton = new Button(By.xpath("//button[@class = 'userToolsToggler']"), "AccountButton");
    private final Button signInButton = new Button(By.xpath("//span[@id = 'selen-7anxb49cjn']"), "Sign in button");
    private Button cartButton = new Button(By.xpath("//span[@class = 'headerCartLabel']"), "");
    public MainMenu mainMenu = new MainMenu();
    private static final By unauthorizedPageLocator = By.xpath("//a[@class = 'poster__link']");
    private static final String pageName = "Unauthorized page";

    public UnAuthorizePage() {
        super(unauthorizedPageLocator, pageName);
    }

    public void pressAccountButton() {
        accountButton.press();
    }

    public void pressSignInButton() {
        signInButton.press();
    }

    public void openCart() {
        cartButton.press();
    }
}
