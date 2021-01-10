package Content.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public enum FreezerNames implements ConcreteItem {

    ITU_1175("Морозильник Indesit ITU 1175"),
    DSZ_5175("Морозильник Indesit DSZ 5175"),
    DSZ_4150("Морозильник Indesit DSZ 4150"),
    M_7204_100("Морозильник ATLANT М 7204-100");

    public String item;

    FreezerNames(String item) {
        this.item = item;
    }

    @Override
    public String getItem() {
        return item;
    }

    public static ArrayList<FreezerNames> getConcreteFreezersAmountList(int limit) {
        return Arrays.stream(FreezerNames.values()).limit(limit).collect(Collectors.toCollection(ArrayList::new));
    }
}
