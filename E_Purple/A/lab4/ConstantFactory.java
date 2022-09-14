package E_Purple.A.lab4;

public class ConstantFactory {
    public static final String[] randomHumanName = {"Jonny", "Gal", "Moshe", "Ravid", "Tal"};
    public static final float randomWeight = (float) (Math.random() * (6.6) + 3.2);
    public static final String[] randomColor = {"White", "Brown", "Black", "Dotted", "Leopard Strips"};
    public static final String[] randomDogName = {"Dogush", "Dogidog", "Dogaldo", "Dogile", "Doginiiho", "Doginoin", "Dogxer", "Dogolon", "Dogonihikio", "Dogio"};
    public static final String[] randomGardenName = {"Dog Kingdom", "Dog Heaven", "Funfunfun Place !"};

    private static int initRand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    private static boolean initRandBool() {
        switch (initRand(1, 11)) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static Dog initDog() {
        return new Dog(randomDogName[initRand(0, 10)],
                randomWeight,
                randomColor[initRand(0, 5)],
                initRandBool());
    }

    public static Dog[] initDogs(int len) {
        if (len < 1) {
            len = 5;
            System.out.println("Invalid length, default to len = 5");
        }
        Dog[] dogs = new Dog[len];
        len = 0;
        for (Dog dog: dogs) {
            dogs[len] = initDog();
            len++;
        }
        return dogs;
    }

    public static DogWalker initDogWalker(String name) {
        return new DogWalker(name, initDogs(5));
    }

    public static DogWalker[] initDogWalkers(int len) {
        if (len < 1) {
            len = 5;
            System.out.println("Invalid length, default to len = 5");
        }
        DogWalker[] dogWalkers = new DogWalker[len];
        len = 0;
        for (DogWalker d: dogWalkers) {
            dogWalkers[len] = initDogWalker(randomHumanName[initRand(0, 5)]);
            len++;
        }
        return dogWalkers;
    }

    public static DogGarden initDogGarden (){
        return new DogGarden(randomGardenName[initRand(0, 3)],initDogWalkers(25));
    }
}
