package tests.freezersTest;

import Content.enums.FreezerNames;
import org.testng.annotations.DataProvider;

public class FreezersModelsDataProvider {

    @DataProvider(name = "twoFreezersModels")
    public static Object[][] twoFreezersModels() {
        return new Object[][] {{FreezerNames.DSZ_4150}, {FreezerNames.DSZ_5175}};
    }

    @DataProvider(name = "fourFreezersModels")
    public static Object[][] fourFreezersModels() {
        return new Object[][] {{FreezerNames.DSZ_4150}, {FreezerNames.DSZ_5175}, {FreezerNames.ITU_1175},
                {FreezerNames.M_7204_100}};
    }
}
