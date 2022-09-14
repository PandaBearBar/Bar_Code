package E_Purple.A.lab4;

import java.util.Arrays;

public class DogGarden {
    private String name;
    private DogWalker [] dogWalkers;

    public DogGarden() {
        this.dogWalkers = new DogWalker[5];
    }
    public DogGarden(DogGarden dogGarden){
        this(dogGarden.name,dogGarden.dogWalkers);
    }

    public DogGarden(String name, DogWalker[] dogWalkers) {
        this.name = name;
        this.dogWalkers = dogWalkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogWalker[] getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(DogWalker[] dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    @Override
    public String toString() {
        return "DogGarden{" +
                "name='" + name + '\'' +
                ", dogWalkers=" + Arrays.toString(dogWalkers) +
                '}';
    }
}
