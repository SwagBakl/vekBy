package Content.Pages;

import Content.SomeUtils;
import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.models.FreezerModel;
import org.openqa.selenium.By;

public class FreezerPage extends BasePage {

    private static final By freezerPageLocator = By.xpath("//div[@class = 'fotorama__shaft']");
    private static final String freezerPageName = "//div[@class = 'fotorama__shaft']";
    private By freezerNameLocator = By.xpath("//h1[@itemprop = 'name']");
    private By freezerPriceLocator = By.xpath("//div[@itemprop = 'offers']/span[contains(@class, 'item__price')]");
    private Button comparisonButton = new Button(
            By.xpath("//span[@class = 'item-tools__li']/a[contains(@class, 'compare__link')]"), "");
    private Button comparisonPageButton = new Button(
            By.xpath("//span[@class = 'item-tools__li']//a[contains(text(), 'Сравнить товары')]"), "");

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

    public void addFreezerToComparison() {
        comparisonButton.press();
    }

    public void goToComparisonPage() {
        comparisonPageButton.press();
    }
}
