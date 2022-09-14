package E_Purple.B.lab1;

import java.util.Arrays;

public class Group {
    private static int sofer = 1;
    private int id = sofer++;
    private Person [] people;
    private String name = "Group" + id;

    public Group(Person[] people) {
        this.people = people;
    }

    public Group() {
        this.people = new Person[10];
    }

    public static int getSofer() {
        return sofer;
    }

    public static void setSofer(int sofer) {
        Group.sofer = sofer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", people=" + Arrays.toString(people) +
                "\n, name='" + name + '\'' +
                '}';
    }
    public int healthScore() {
        int somkers = 0;
        for (Person p : people) {
            if (p!=null && p.isSmoking()){
                somkers++;
            }
        }
        return somkers;
    }


}
