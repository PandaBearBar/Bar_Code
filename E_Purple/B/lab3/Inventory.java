package E_Purple.B.lab3;

import java.util.Arrays;

public class Inventory {
    private Item[] items;

    public Inventory() {
        this(new Item[10]);
    }

    public Inventory(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public int size() {
        return items.length;
    }

    public int count() {
        int count =0;
        for (Item i: items) {
            if (i!=null) {
                count++;
            }
        }
        return count;
    }
}
