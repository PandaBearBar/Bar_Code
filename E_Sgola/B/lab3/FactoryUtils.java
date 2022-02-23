package E_Sgola.B.lab3;

public class FactoryUtils {
    public static Item[] initItems() {
        Item [ ] items = new Item[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = initItem();
        }
        return items;
    }
    public static Item initItem(){
        String [] category = {"Fruits", "Cables","Drinks"};
        Item item = new Item();
        item.setCategory(category[initRand(0,3)]);
        item.setAmount(initRand(50, 75));
        item.setName("Item "+ item.getId());
        return item;
    }
    private static int initRand(int min , int max){
        return (int)(Math.random()*(max-min)+min);
    }

    @Override
    public String toString() {
        return "FactoryUtils{}";
    }

    public static int totalSize(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        return ((inventory1.size())+(inventory2.size())+(inventory3.size()));
    }
    public static int totalCount(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        return ((inventory1.count())+(inventory2.count())+(inventory3.count()));
    }
}
