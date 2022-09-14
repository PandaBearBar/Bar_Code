package K_Simolation.API_S1.Beans;

public abstract class Person {
    private static int count = 1;
    private int id = count;
    private String name = "Client " + id ;
    private double age = Math.random()*105 + 16;

    public Person() {
        count++;
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
                ", age=" + String.format("%.2f", age) +
                '}';
    }
}
