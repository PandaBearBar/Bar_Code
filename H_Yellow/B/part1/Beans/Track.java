package H_Yellow.B.part1.Beans;

public class Track {
    private String name;
    private String bandName;
    private double price;
    private int lengthSeconds;

    public Track(String name, String bandName, double price, int lengthSeconds) {
        this.name = name;
        this.bandName = bandName;
        this.price = price;
        this.lengthSeconds = lengthSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public void setLengthSeconds(int lengthSeconds) {
        this.lengthSeconds = lengthSeconds;
    }

    @Override
    public String toString() {
        return "\nTrack{" +
                "name='" + name + '\'' +
                ", bandName='" + bandName + '\'' +
                ", price=" + String.format("%.3f", price) +
                ", lengthSeconds=" + lengthSeconds +
                '}';
    }
}
