package tests.testSteps;

import Content.Pages.ContentPage;
import Content.enums.ConcreteMenuItem;
import Content.enums.KitchenMenuItems;
import Content.enums.MainMenuItems;
import Content.menu.KitchenMenu;
import Content.menu.MainMenu;
import org.testng.Assert;

public class SelectKindOfProduct {

    public static ContentPage selectKindOfProduct(MainMenuItems mainMenuItem, ConcreteMenuItem concreteMenuItem) {
        MainMenu mainMenu = new MainMenu();
        KitchenMenu kitchenMenu = new KitchenMenu();
        ContentPage contentPage = new ContentPage();

        mainMenu.pressOnMenuItem(mainMenuItem);
        kitchenMenu.selectItem(concreteMenuItem);
        Assert.assertTrue(contentPage.isOnConcreteContentPage(concreteMenuItem), "This is not concrete content page");
        return contentPage;
    }
}
