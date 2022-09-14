package I_Lime.part1;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {
    private static double initRand(int max, int min){return Math.random()*(max-min) + min ;}
    public static double randSalary (Employee employee){
        if (employee.getClass().getSimpleName().equals("Director"))return initRand(35001, 18000);
        else if (employee.getClass().getSimpleName().equals("Engineer") )return initRand(11001, 9000);
        else if (employee.getClass().getSimpleName().equals("Manager"))return initRand(15501, 12000);
        else return initRand(8501, 7000);
    }
    public static List<Employee> initEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        Secretary secretary = new Secretary("A",0,"A");
        Engineer engineer = new Engineer("A",0,"A");
        Manager manager = new Manager("A",0,"A");
        Employee employee = new Employee("A",0);
        Director director = new Director("A",0,"A");
        employees.add(new Secretary(Name.getRandName(), randSalary(secretary), "A"));
        employees.add(new Secretary(Name.getRandName(), randSalary(secretary), "B"));
        employees.add(new Manager(Name.getRandName(), randSalary(manager), "A"));
        employees.add(new Manager(Name.getRandName(), randSalary(manager), "B"));
        employees.add(new Manager(Name.getRandName(), randSalary(manager), "C"));
        employees.add(new Employee(Name.getRandName(), randSalary(employee)));
        employees.add(new Employee(Name.getRandName(), randSalary(employee)));
        employees.add(new Employee(Name.getRandName(), randSalary(employee)));
        employees.add(new Director(Name.getRandName(), randSalary(director),"A"));
        employees.add(new Engineer(Name.getRandName(), randSalary(engineer),"A"));
        employees.add(new Engineer(Name.getRandName(), randSalary(engineer),"B"));
        return employees;
    }
}
