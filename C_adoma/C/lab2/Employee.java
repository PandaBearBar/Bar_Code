package C_adoma.C.lab2;

public class Employee {
    private String first;
    private String last;
    private Date birth;
    private Date employed;

    public Employee(String first, String last, Date birth, Date employed) {
        this.first = first;
        this.last = last;
        this.birth = birth;
        this.employed = employed;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", birth=" + birth +
                ", employed=" + employed +
                '}';
    }

}
/*
import C_adoma.C.lab2.Date;
import C_adoma.C.lab2.Employee;

        Date birth = new Date(27, 11, 1986);
        Date hire = new Date(29, 2, 2000);
        Employee employee = new Employee("Rany", "Albeg Wein", birth, hire);
        System.out.println(employee);
 */
