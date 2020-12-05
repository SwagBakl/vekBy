package Content.menu;

import Content.enums.KitchenMenuItems;
import Content.framework.BaseElement;
import Content.framework.Elements.Button;
import org.openqa.selenium.By;

public class KitchenMenu {

    private Button kitchenMenuItem;

    public void selectItem(KitchenMenuItems items) {
        kitchenMenuItem = new Button(By.xpath(String.format("//a[text() = '%s']",
                items.item)), "");
        kitchenMenuItem.press();
        BaseElement element = new BaseElement(By.xpath(""), "");
//        element.takeElementScreenshot(By.xpath("//a[@class = 'poster__link']"),
//                "E://screenshots/", "screeenshot", "jpg");
    }
}
