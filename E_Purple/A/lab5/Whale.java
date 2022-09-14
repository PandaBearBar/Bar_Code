package E_Purple.A.lab5;

public class Whale extends Fish {
    private int lengthInMeters;

    public Whale(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
        this.speed = 90;
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "speed=" + speed +
                ", lengthInMeters=" + lengthInMeters +
                "} " + super.toString();
    }

    public void makeSound() {
        System.out.println("WHOM WHOM WHOM");
    }

    @Override
    public void draw() {
        System.out.println(
                "       .\n" +
                        "      \":\"\n" +
                        "    ___:____     |\"\\/\"|\n" +
                        "  ,'        `.    \\  /\n" +
                        "  |  O        \\___/  |\n" +
                        "~^~^~^~^~^~^~^~^~^~^~^~^~"
        );

    }
}
