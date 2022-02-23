package B_ktoma.dus;

public class Light {
    private int totalHours;
    private String color = "White";
    private double cost = 19.99;
    public Light(){}

    public Light(int totalHours, String color) {
        this.totalHours = totalHours;
        this.color = color;
    }

    public Light(String color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public Light(int totalHours, String color, double cost) {
        this.totalHours = totalHours;
        this.color = color;
        this.cost = cost;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Light{" +
                "totalHours=" + totalHours +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
