package I_Lime.part3;

abstract class Employee implements Comparable{
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + String.format("%.2f",salary) +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        return this.name.equals(((Employee) other).getName()) && this.salary == ((Employee) other).getSalary();
    }

    @Override
    public int compareTo(Object other) {
        return (this.name.compareTo(((Employee)other).name));
    }

    public abstract void draw();

}
