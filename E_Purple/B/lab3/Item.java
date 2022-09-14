package E_Purple.B.lab3;

public class Item {
    private static long sofer = 1;
    private long id = sofer;
    private String name;
    private int amount = 100;
    private String category;

    public Item(long id, String name, int amount, String category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
        sofer++;
    }

    public Item() {
        sofer++;
    }

    public static long getSofer() {
        return sofer;
    }

    public static void setSofer(long sofer) {
        Item.sofer = sofer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}

/*
import E_Sgola.B.lab3.FactoryUtils;
import E_Sgola.B.lab3.Inventory;
import E_Sgola.B.lab3.Item;

        Item item1 = new Item("A", "A");
        Item item2 = new Item("B", "B");
        Item item3 = new Item(666, "C", 666, "C");
        Item[] items = {item1, item2, item3};
        Inventory inventory1 = new Inventory(items);
        Inventory inventory2 = new Inventory(FactoryUtils.initItems());
        Inventory inventory3 = new Inventory(FactoryUtils.initItems());
        Inventory inventory = new Inventory();
        System.out.println(FactoryUtils.totalSize(inventory1, inventory2, inventory3));
        System.out.println(FactoryUtils.totalCount(inventory1, inventory2, inventory3));
        System.out.println(FactoryUtils.totalSize(inventory1, inventory2, inventory));
        System.out.println(FactoryUtils.totalCount(inventory1, inventory2, inventory));
        System.out.println(inventory1);
        System.out.println(inventory2);
        System.out.println(inventory3);
        System.out.println(inventory);


 */