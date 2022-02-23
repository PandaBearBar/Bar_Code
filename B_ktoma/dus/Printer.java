package B_ktoma.dus;

public class Printer {
    private long id;
    private String model;
    private String manufactuer;
    private boolean isColorful;
    public Printer(){}

    public Printer(long id, String model, String manufactuer) {
        this.id = id;
        this.model = model;
        this.manufactuer = manufactuer;
    }

    public Printer(long id, String model, String manufactuer, boolean isColorful) {
        this.id = id;
        this.model = model;
        this.manufactuer = manufactuer;
        this.isColorful = isColorful;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public void setManufactuer(String manufactuer) {
        this.manufactuer = manufactuer;
    }

    public boolean isColorful() {
        return isColorful;
    }

    public void setColorful(boolean colorful) {
        isColorful = colorful;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", manufactuer='" + manufactuer + '\'' +
                ", isColorful=" + isColorful +
                '}';
    }
}
