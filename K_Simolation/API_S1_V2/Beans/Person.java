package K_Simolation.API_S1_V2.Beans;

import K_Simolation.API_S1_V2.Utils.FactoryUtils;

public abstract class Person {
    private static int count = 1;
    private int id = count;
    private String name = "Client "+ String.format("%02d", id);
    private double age = FactoryUtils.initDouble(121, 16);

    public Person() {
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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + String.format("%.3f", age) +
                '}';
    }
}
