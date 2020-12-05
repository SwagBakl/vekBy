package tests;

import Content.Pages.AuthorizedPage;
import Content.Pages.CartPage;
import Content.Pages.FreezerContentPage;
import Content.Pages.UnAuthorizePage;
import Content.enums.KitchenMenuItems;
import Content.enums.MainMenuItems;
import Content.menu.KitchenMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFreezerToCartTest {

    @Test
    public void addFreezerToCart() {
        FreezerContentPage freezerContentPage = new FreezerContentPage();
        UnAuthorizePage unAuthorizedPage = new UnAuthorizePage();
        KitchenMenu kitchenMenu = new KitchenMenu();
        CartPage cartPage = new CartPage();

        unAuthorizedPage.mainMenu.pressOnMenuItem(MainMenuItems.KITCHEN);
        kitchenMenu.selectItem(KitchenMenuItems.FREEZERS);
        Assert.assertTrue(freezerContentPage.isPresent(), "This is not freezers content page");
        freezerContentPage.addToCart();
        unAuthorizedPage.openCart();
        Assert.assertTrue(cartPage.isPresent(), "Cart page has not been opened");
    }
}
