package C_Red.B.lab2;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Date employedAt;

    public Employee(String firstName, String lastName, Date birthday, Date employedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.employedAt = employedAt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", employedAt=" + employedAt +
                '}';
    }
}
