package H_Yellow.A.lab2;

public class Employee {
    private static final int MAXIMUM_SALARY = 40_000;
    private final String employeName;
    private int age;
    private double salary;

    public Employee(String employeName, int age, double salary) {
        this.employeName = employeName;
        this.age = age;
        if (salary >= MAXIMUM_SALARY) throw new InvalidEmployeeSalaryExecption("Invalid Salary");
        else this.salary = salary;
    }

    public String getEmployeName() {
        return employeName;
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
                "employeName='" + employeName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
