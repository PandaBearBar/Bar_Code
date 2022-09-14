package E_Purple.A.lab3;

public class Item {
    /*
    private static int sofer = 1;
    private int id = sofer;
    private String name = "N";
    private int amount = 100 ;
    private String category = "N";

    public Item(int id, String name, int amount, String category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public Item(String name, String category) {
        sofer++;
        this.name = name;
        this.category = category;
    }

    public static int getSofer() {
        return sofer;
    }

    public static void setSofer(int sofer) {
        Item.sofer = sofer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    }*/
    private static long sofer = 1;
    private long id = sofer;
    private String name ;
    private String category ;
    private int amount = 100;

    public Item(long id, String name, String category, int amount) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    public Item(String name, String category) {
        sofer++;
        this.name = name;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "id=" + id +
                " name='" + name + '\'' +
                " category='" + category + '\'' +
                " amount=" + amount +
                '}';
    }
}
