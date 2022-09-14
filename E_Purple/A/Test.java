package E_Purple.A;

import E_Purple.A.lab4.ConstantFactory;
import E_Purple.A.lab4.DogGarden;

public class Test {
    public static void main(String[] args) {
        DogGarden dogGarden = ConstantFactory.initDogGarden();
        System.out.println(dogGarden);
    }
}
