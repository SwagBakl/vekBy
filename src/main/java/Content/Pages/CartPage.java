package Content.Pages;

import Content.framework.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private static final By cartPageLocator = By.xpath("//h2[@class = 'content__header' and text() = 'Оформление заказа']");
    private static final String cartPageName = "";

    public CartPage() {
        super(cartPageLocator, cartPageName);
    }
}
