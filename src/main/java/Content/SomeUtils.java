package Content;

import java.util.List;

public class SomeUtils {

    public static boolean checkFilteredPriceList(List<String> list, double minPrice, double maxPrice) {
        return list.stream().allMatch(l -> Double.parseDouble(l) <= maxPrice && Double.parseDouble(l) >= minPrice);
    }

    public static String priceFormatter(String price) {
        return price.replace("р.", "").replace(",", ".");
    }
}
