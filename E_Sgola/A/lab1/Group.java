package E_Sgola.A.lab1;

import java.util.Arrays;

public class Group {
    private static int sofer = 1;
    private int id = sofer;
    private Person[] people;
    private String name = "Group " + sofer++ ;

    public Group() {
        people = new Person[10];

    }

    public Group(Person[] people) {
        this.people = people;
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
                ", name='" + name + '\'' +
                '}';
    }
    public int healthScore(){
        int cencer = 0;
        for (int i = 0; i < this.people.length; i++) {
            if (people[i].isSmoking()){
                cencer ++;
            }
        }
        return cencer;
    }
}
