package B_ktoma.uno;

public class Printer {
    private long id ;
    private String model;
    private String manufacturer;
    private boolean isColorful;

    public Printer() {
    }

    public Printer(long id, String model, String manufacturer) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Printer(long id, String model, String manufacturer, boolean isColorful) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
                ", manufacturer='" + manufacturer + '\'' +
                ", isColorful=" + isColorful +
                '}';
    }
}
