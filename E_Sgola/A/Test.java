package E_Sgola.A;

import E_Sgola.A.lab3.FactoryUtilsSgola3;
import E_Sgola.A.lab3.Inventory;
import E_Sgola.A.lab3.Item;

public class Test {
    public static void main(String[] args) {
        Item i1 = new Item(12, "a:", "aa", 12);
        Item i2 = new Item("a:", "aa");
        Item i3 = new Item("a:1", "a2a");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        Inventory inv1 = new Inventory();
        System.out.println(inv1);
        Item[] items = {i1, i2, i3};
        Inventory inv2 = new Inventory(items);
        System.out.println(inv2);
        inv1.setItems(FactoryUtilsSgola3.initItems());
        System.out.println(inv1);
        Inventory inv3 = new Inventory(inv2.getItems());
        System.out.println(FactoryUtilsSgola3.totalCount(inv1, inv2, inv3));
        System.out.println(FactoryUtilsSgola3.totalSize(inv1, inv2, inv3));
    }
}
