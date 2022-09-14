package K_Simolation.BankSystemElad.simulation1.simulation1.beans;

/*
Created by Elad on 16/03/2022

*/

public abstract class Person {
    private static int counter = 1;
    private int id = counter;
    private String name = "Client " + counter++;
    private double age = (int) (Math.random() * 105) + 16;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
}
