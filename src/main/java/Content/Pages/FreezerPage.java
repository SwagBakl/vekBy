package Content.Pages;

import Content.SomeUtils;
import Content.framework.BasePage;
import Content.models.FreezerModel;
import org.openqa.selenium.By;

public class FreezerPage extends BasePage {

    private static final By freezerPageLocator = By.xpath("//div[@class = 'fotorama__shaft']");
    private static final String freezerPageName = "//div[@class = 'fotorama__shaft']";
    private By freezerNameLocator = By.xpath("//h1[@itemprop = 'name']");
    private By freezerPriceLocator = By.xpath("//div[@itemprop = 'offers']/span[contains(@class, 'item__price')]");

    public FreezerPage() {
        super(freezerPageLocator, freezerPageName);
    }

    private String getName() {
        return findElement(freezerNameLocator).getText();
    }

    private Double getPrice() {
        return Double.parseDouble(SomeUtils.priceFormatter(findElement(freezerPriceLocator)
                .getText()));
    }

    public FreezerModel getFreezer() {
        return new FreezerModel(getName(), getPrice());
    }
}
