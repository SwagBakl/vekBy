package tests;

import Content.Pages.CartPage;
import Content.Pages.ContentPage;
import Content.Pages.UnAuthorizePage;
import Content.enums.KitchenMenuItems;
import Content.enums.MainMenuItems;
import Content.menu.KitchenMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFreezerToCartTest extends BaseTest {

    @Test
    public void addFreezerToCart() {
        ContentPage contentPage = new ContentPage();
        UnAuthorizePage unAuthorizedPage = new UnAuthorizePage();
        KitchenMenu kitchenMenu = new KitchenMenu();
        CartPage cartPage = new CartPage();

        unAuthorizedPage.mainMenu.pressOnMenuItem(MainMenuItems.KITCHEN);
        kitchenMenu.selectItem(KitchenMenuItems.FREEZERS);
        Assert.assertTrue(contentPage.isPresent(), "This is not freezers content page");
        contentPage.addToCart();
        unAuthorizedPage.openCart();
        Assert.assertTrue(cartPage.isPresent(), "Cart page has not been opened");
    }
}
