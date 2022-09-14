package E_Purple.A.lab4;

import java.util.Arrays;

public class DogWalker {
    private String name ;
    private Dog [] dogs;

    public DogWalker() {
        this.dogs = new Dog[5];
    }
    public DogWalker(DogWalker walker){
        this(walker.name, walker.dogs);
    }

    public DogWalker(String name, Dog[] dogs) {
        this.name = name;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "\n\nDogWalker{" +
                "name='" + name + '\'' +
                ", dogs=" + Arrays.toString(dogs) +
                '}';
    }
}
