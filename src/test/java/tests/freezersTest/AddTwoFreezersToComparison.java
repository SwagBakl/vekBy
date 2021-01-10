package tests.freezersTest;

import Content.Pages.ComparisonPage;
import Content.Pages.FreezerPage;
import Content.enums.FreezerNames;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.testSteps.FreezersTestSteps;

public class AddTwoFreezersToComparison extends BaseTest {
    final int FREEZERS_LIMIT = 2;
    
    @Test
    public void addFreezersToComparison() {
        ComparisonPage comparisonPage = new ComparisonPage();
        FreezerPage freezerPage = new FreezerPage();

        for (FreezerNames productName : FreezerNames.getConcreteFreezersAmountList(FREEZERS_LIMIT)) {
            FreezersTestSteps.selectConcreteFreezer(productName);
            freezerPage.addFreezerToComparison();
        }

        freezerPage.goToComparisonPage();
        Assert.assertTrue(comparisonPage.isPresent(), "This is not comparison page");
        Assert.assertTrue(comparisonPage.isComparisonItemsAmountCorrect(FREEZERS_LIMIT),
                "Comparison page contains incorrect amount of freezers");

    }
}
