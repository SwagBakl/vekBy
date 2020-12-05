package Content.Pages;

import Content.framework.BasePage;
import Content.framework.Elements.Button;
import Content.framework.Elements.Input;
import org.openqa.selenium.By;

public class FilterForm extends BasePage {

    private static By locator = By.xpath("//h1[text()='Морозильники']");
    private static String name = "";
    private Input minPriceInput = new Input(By.xpath("//input[@name = 'filter[price][from]']"), "");
    private Input maxPriceInput = new Input(By.xpath("//input[@name = 'filter[price][to]']"), "");
    private Button showProductsButton = new Button(By.xpath("//button[contains(@class, 'filter__button')]"), "");

    public FilterForm() {
        super(locator, name);
    }

    public void setPriceFilter(Integer minPrice, Integer maxPrice) {
        minPriceInput.sendKeys(minPrice.toString());
        maxPriceInput.sendKeys(maxPrice.toString());
    }

    public void pressShowProducts() {
        showProductsButton.press();
    }
}
