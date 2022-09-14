package E_Purple.A.lab3;

public class FactoryUtilsSgola3 {
    private static int initRand(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static Item[] initItems() {
        Item[] items = new Item[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = initItem();
            items[i].setAmount(initRand(50, 76));
        }
        return items;
    }

    private static Item initItem() {
        String[] Category = {"Fruit", "Cables", "Drinks"};
        return new Item("Item", Category[initRand(0, 3)]);
    }

    @Override
    public String toString() {
        return "FactoryUtilsSgola3{}";
    }

    public static int totalSize(Inventory i1, Inventory i2, Inventory i3) {
        return i1.size() + i2.size() + i3.size();
    }

    public static int totalCount(Inventory i1, Inventory i2, Inventory i3) {
        return i1.count() + i2.count() + i3.count();
    }
}
