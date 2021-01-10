package Content.enums;

public enum KitchenMenuItems implements ConcreteMenuItem {

    LARGE_APPLIANCES("Крупная техника"),
    FREEZERS("Морозильники");

    public String item;

    KitchenMenuItems(String item) {
        this.item = item;
    }

    @Override
    public String getItem() {
        return item;
    }
}
