package Content.Pages;

import Content.framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparisonPage extends BasePage {

    private static final By comparisonPageLocator = By.xpath("//div[@class = 'b-compare_container']");
    private static final String comparisonsPageName = "Comparison page";
    private final By itemNameLocator = By.xpath(
            "//div[contains(@class, 'compare_container__front')]//div[contains(@class, 'cr-attr__itemheader')]/a");

    public ComparisonPage() {
        super(comparisonPageLocator, comparisonsPageName);
    }

    public Set<String> getProductsNames() {
        return findElements(itemNameLocator).stream().map(WebElement::getText).collect(Collectors.toSet());
    }

    public boolean isComparisonItemsAmountCorrect(int amount) {
        return amount == getProductsNames().size();
    }
}
