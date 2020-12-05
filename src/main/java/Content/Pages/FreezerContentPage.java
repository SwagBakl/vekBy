package Content.Pages;

import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.models.FreezerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class FreezerContentPage extends BasePage {

    private static By locator = By.xpath("//h1[contains(@class, 'content__header') and (text() = 'Морозильники')]");
    private static String name = "";
    private By freezersPriceListLocator = By.xpath("//ul[@class = 'b-result']/li//span[contains(@class, 'cr-price__in')]");
    private By freezerNameLabel = By.xpath("//span[@class = 'result__name']");
    private Button selectFreezerButton = new Button(By.xpath("//span[@class = 'result__img']"), "");
    private Button addToCartButton = new Button(By.xpath("//button[@data-ga_label = 'result_buybtn']"), "");

    public FreezerContentPage() {
        super(locator, name);
    }

    public List<String> getFreezersPriceList() {
        List<WebElement> freezersList = findElements(freezersPriceListLocator);
        return freezersList
                .stream()
                .map(WebElement::getText)
                .map(element -> element.replace("р.", ""))
                .map(el -> el.replace(",", "."))
                .collect(Collectors.toList());
    }

    private String getFreezerName() {
        return findElement(freezerNameLabel).getText();
    }

    private Double getFreezerPrice() {
        return Double.parseDouble(findElement(freezersPriceListLocator).getText()
                .replace("р.", "")
                .replace(",", "."));
    }

    public FreezerModel getFreezerNameAndPrice() {
        return new FreezerModel(getFreezerName(), getFreezerPrice());
    }

    public void pressOnConcreteFreezer() {
        selectFreezerButton.press();
    }

    public void addToCart() {
        addToCartButton.press();
    }

}
