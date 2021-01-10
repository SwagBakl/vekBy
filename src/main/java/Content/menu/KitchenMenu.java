package Content.menu;

import Content.enums.ConcreteMenuItem;
import Content.enums.KitchenMenuItems;
import Content.framework.BaseElement;
import Content.framework.Elements.Button;
import org.openqa.selenium.By;

public class KitchenMenu {

    private Button kitchenMenuItem;

    public void selectItem(ConcreteMenuItem items) {
        kitchenMenuItem = new Button(By.xpath(String.format("//a[text() = '%s']",
                items.getItem())), "");
        kitchenMenuItem.press();
        BaseElement element = new BaseElement(By.xpath(""), "");
//        element.takeElementScreenshot(By.xpath("//a[@class = 'poster__link']"),
//                "E://screenshots/", "screeenshot", "jpg");
    }
}
