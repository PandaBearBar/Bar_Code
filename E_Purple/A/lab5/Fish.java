package E_Purple.A.lab5;

abstract class Fish {
    private String name;
    private String color;
    protected int speed;
    private static int sofer = 1;
    private static int ID = sofer;

    public Fish() {
        this.name = "Nemo " + ID;
        sofer++;
        this.color = ConstantFactory.color();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static int getSofer() {
        return sofer;
    }

    public static void setSofer(int sofer) {
        Fish.sofer = sofer;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Fish.ID = ID;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void makeSound() {
        System.out.println("Blup Blup Blup");
    }

    public abstract void draw();

}
