package E_Purple.A.lab4;

public class Dog {
    private String name;
    private float weight;
    private String color = "Black";
    private boolean isVaccinated = true;

    public Dog() {
    }

    public Dog(Dog dog) {
        this(dog.name, dog.weight, dog.color, dog.isVaccinated);
    }

    public Dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, float weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Dog(String name, float weight, String color, boolean isVaccinated) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "\nDog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
