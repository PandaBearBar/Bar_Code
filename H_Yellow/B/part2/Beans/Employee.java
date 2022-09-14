package H_Yellow.B.part2.Beans;

import H_Yellow.B.part2.Exception.InvalidEmployeeSalaryException;

public class Employee {
    private static final int MAXIMUM_SALARY =40_000;
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) throws InvalidEmployeeSalaryException {
        this.name = name;
        this.age = age;
        this.salary = chekSal(salary);
    }

    private double chekSal(double salary) throws InvalidEmployeeSalaryException {
        if (salary>=MAXIMUM_SALARY)throw new InvalidEmployeeSalaryException("Invalid Sal");
        return salary;
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
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
