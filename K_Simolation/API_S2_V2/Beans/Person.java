package K_Simolation.API_S2_V2.Beans;

import K_Simolation.API_S2_V2.Utils.DateFactory;
import K_Simolation.API_S2_V2.Utils.DateUtil;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private static int count = 1;
    private int id = count;
    private String name;
    private LocalDate Birthday;

    public Person() {
        this.name = "Person " + String.format("%02d", id);
        this.Birthday = DateFactory.getLocalDate();
        count++;
    }

    public Person(LocalDate birthday) {
        Birthday = birthday;
        this.name = "Person " + String.format("%02d", id);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    @Override
    public int compareTo(Person other) {
        if (this.Birthday.getMonthValue() == other.getBirthday().getMonthValue())return this.Birthday.getDayOfMonth() - other.getBirthday().getDayOfMonth();
        return this.Birthday.getMonthValue() - other.getBirthday().getMonthValue();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + String.format("%02d", id) +
                ", name='" + name + '\'' +
                ", Birthday=" + DateUtil.BeautifyDate(Birthday) +
                '}';
    }
}
