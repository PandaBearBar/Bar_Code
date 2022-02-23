package E_Sgola.A.lab3;

import java.util.Arrays;

public class Inventory {
    /*
    private Item[] items;


    public Inventory() {
        this.items = new Item[10];

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
        return this.items.length;
    }

    public int count() {
        int sofer = 0;
        for (Item item : items) {
            if (item.getAmount() != -1 && !item.getCategory().equals("N") && !item.getName().equals("N")) {
                sofer++;
            }
        }
        return sofer;
    }*/
    private Item[] items;

    public Inventory() {
        this.items = new Item[10];
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
        return this.items.length;
    }

    public int count() {
        int sofer = 0;
        for (Item item : this.items) {
            if (item != null) sofer++;
        }
        return sofer;
    }
}