package E_Purple.B.lab1;

public class FactoryUtils {
    public static Group initGroup() {

        return new Group(initPeople(3, 7));
    }

    public static Group initGroup(boolean isSmoking) {
        int smokers = (isSmoking) ? 10 : 0;
        int non_smokers = (isSmoking) ? 0 : 10;
        return new Group(initPeople(smokers, non_smokers));
    }

    private static int initRand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static Person intiPerson(boolean isSmoking) {
        String[] city = {"TLV", "JLM", "HFA"};
        Person person = new Person();
        person.setSmoking(isSmoking);
        person.setFirstName("John " + person.getId());
        person.setLastName("Bryce " + person.getId());
        person.setCity(city[initRand(0, 3)]);
        return person;
    }
    private static Person [] initPeople (int smokers, int non_smokers){
        int len = smokers+non_smokers;
        Person[] people = new Person[len];
        for (int i = 0; i < people.length; i++) {
            if (smokers > i) people[i] = intiPerson(true);
            else people[i] = intiPerson(false);
        }
        return people;
    }
}
