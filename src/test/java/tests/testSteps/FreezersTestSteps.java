package tests.testSteps;

import Content.Pages.ContentPage;
import Content.Pages.FreezerPage;
import Content.enums.FreezerNames;
import Content.enums.KitchenMenuItems;
import Content.enums.MainMenuItems;
import org.testng.Assert;

public class FreezersTestSteps {

    public static void selectConcreteFreezer(FreezerNames freezerNames) {
        ContentPage freezerContentPage = SelectKindOfProduct
                .selectKindOfProduct(MainMenuItems.KITCHEN, KitchenMenuItems.FREEZERS);
        freezerContentPage.pressOnConcreteProduct(freezerNames);
        FreezerPage freezerPage = new FreezerPage();
        Assert.assertTrue(freezerPage.isPresent(), "This is not freezer page");
    }
}
