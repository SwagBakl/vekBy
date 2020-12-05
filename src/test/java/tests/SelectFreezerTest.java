package tests;

import Content.Pages.FilterForm;
import Content.Pages.FreezerContentPage;
import Content.Pages.FreezerPage;
import Content.SomeUtils;
import Content.enums.KitchenMenuItems;
import Content.enums.MainMenuItems;
import Content.menu.KitchenMenu;
import Content.menu.MainMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFreezerTest extends BaseTest {

    @Test
    public void selectFreezer() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.pressOnMenuItem(MainMenuItems.KITCHEN);

        KitchenMenu kitchenMenu = new KitchenMenu();
        kitchenMenu.selectItem(KitchenMenuItems.FREEZERS);

        FilterForm filterForm = new FilterForm();
        filterForm.setPriceFilter(800, 1000);
        filterForm.pressShowProducts();
        FreezerContentPage contentPage = new FreezerContentPage();
        Assert.assertTrue(SomeUtils.checkFilteredPriceList(
                contentPage.getFreezersPriceList(), 800.00, 1000.00), "NONONO");
        String freezerModel = contentPage.getFreezerNameAndPrice().getModelName();
        Double freezerPrice = contentPage.getFreezerNameAndPrice().getPrice();
        contentPage.pressOnConcreteFreezer();
        FreezerPage freezerPage = new FreezerPage();
        Assert.assertEquals(freezerModel, freezerPage.getFreezer().getModelName());
        Assert.assertEquals(freezerPrice, freezerPage.getFreezer().getPrice());

    }
}
