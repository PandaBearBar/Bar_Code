package E_Purple.A.lab1;

public class FactoryUtils {

    private static int sofer = 1;

    private static String[] city = {"TLV", "JLM", "HFA"};

    private static int init(int min, int max) {

        return (int) (Math.random() * (max - min) + min);
    }

    public static Group initGroup() {
        return new Group(initPeople(3, 7));
    }


    public static Group initGroup(boolean isSmoking) {
        return (isSmoking) ? new Group(initPeople(10, 0)) : new Group(initPeople(0, 10));
//        Group newGroup = new Group();
//        for (int i = 0; i < newGroup.getPeople().length; i++) {
//            newGroup.getPeople()[i].setSmoking(isSmoking);
//        }
//        return newGroup;
    }

    public static Person initPerson(boolean isSmoking) {
        Person person = new Person();
        person.setId(sofer);
        person.setFirstName("John " + sofer);
        person.setLastName("Bryce " + sofer);
        person.setCity(FactoryUtils.city[init(0, 3)]);
        person.setSmoking(isSmoking);
        sofer++;
        return person;
    }

    public static Person[] initPeople(int smokers, int non_smokers) {
        int len = smokers + non_smokers;
        Person[] people = new Person[len];
        for (int i = 0; i < len; i++) {
            people[i] = (i < smokers) ? initPerson(true) : initPerson(false);
        }
        return people;
    }
}
