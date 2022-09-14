package A_etc.mivhan.lab2;
// EX One Section two
public class Person {
    private String name;
    private int age ;


    public Person(String name, int age) {
        this.name = name;
        this.age = (age>=20&&age<=120)?age:1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (age==1) System.out.printf("Invalid age  of : ");
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
