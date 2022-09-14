package I_Lime.part2;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {
    private static double initRand(int max, int min) {
        return Math.random() * (max - min) + min;
    }

    public static double randSalary(Class<?> employee) {
        if (employee.equals(Director.class)) return initRand(35001, 18000);
        else if (employee.equals(Engineer.class)) return initRand(11001, 9000);
        else if (employee.equals(Manager.class)) return initRand(15501, 12000);
        return initRand(8501, 7000);
    }

    public static List<Employee> initEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Secretary(Name.getRandName(), randSalary(Secretary.class), "A"));
        employees.add(new Secretary(Name.getRandName(), randSalary(Secretary.class), "B"));
        employees.add(new Manager(Name.getRandName(), randSalary(Manager.class), "A"));
        employees.add(new Manager(Name.getRandName(), randSalary(Manager.class), "B"));
        employees.add(new Director(Name.getRandName(), randSalary(Director.class), "A"));
        employees.add(new Engineer(Name.getRandName(), randSalary(Engineer.class), "A"));
        employees.add(new Engineer(Name.getRandName(), randSalary(Engineer.class), "B"));
        employees.add(new Engineer(Name.getRandName(), randSalary(Engineer.class), "C"));
        employees.add(new Engineer(Name.getRandName(), randSalary(Engineer.class), "D"));
        employees.add(new Engineer(Name.getRandName(), randSalary(Engineer.class), "E"));
        return employees;
    }
}
