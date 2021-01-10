package Content.Pages;

import Content.SomeUtils;
import Content.enums.ConcreteItem;
import Content.enums.ConcreteMenuItem;
import Content.enums.FreezerNames;
import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.framework.Elements.Label;
import Content.models.FreezerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ContentPage extends BasePage {

    private static By locator = By.xpath("//h1[contains(@class, 'content__header')]");
    private Label concreteContentPageLocator;
    private static String name = "";
    private By productPriceListLocator = By.xpath("//ul[@class = 'b-result']/li//span[contains(@class, 'cr-price__in')]");
    private By productNameLabel = By.xpath("//span[@class = 'result__name']");
    private Button selectProductButton;
    private Button addToCartButton = new Button(By.xpath("//button[@data-ga_label = 'result_buybtn']"), "");

    public ContentPage() {
        super(locator, name);
    }

    public List<String> getPriceList() {
        List<WebElement> freezersList = findElements(productPriceListLocator);
        return freezersList
                .stream()
                .map(WebElement::getText)
                .map(SomeUtils::priceFormatter)
                .collect(Collectors.toList());
    }

    public boolean isOnConcreteContentPage(ConcreteMenuItem concreteMenuItem) {
        return new Label(By.xpath(String.format(
                "//h1[contains(@class, 'content__header') and (text() = '%s')]", concreteMenuItem.getItem())), "")
                .isEnabled();
    }

    public List<String> getProductNames() {
        List<WebElement> elements = findElements(productNameLabel);
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private String getFreezerName() {
        return findElement(productNameLabel).getText();
    }

    private Double getFreezerPrice() {
        return Double.parseDouble(SomeUtils.priceFormatter(findElement(productPriceListLocator).getText()));
    }

    public FreezerModel getFreezerNameAndPrice() {
        return new FreezerModel(getFreezerName(), getFreezerPrice());
    }

    public void pressOnConcreteProduct(ConcreteItem concreteItem) {
        selectProductButton = new Button(
                By.xpath(String.format("//span[contains(text(), '%s')]", concreteItem.getItem())), "");
        selectProductButton.press();
    }

    public void addToCart() {
        addToCartButton.press();
    }

}
