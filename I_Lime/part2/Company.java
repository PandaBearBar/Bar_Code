package I_Lime.part2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Company {
    private static Company Instance = new Company();
    private final List<Employee> list = new LinkedList<Employee>();

    private Company() {
        list.addAll(FactoryUtils.initEmployees());
    }

    public static Company getInstance() {
        return Instance;
    }

    public List<Employee> getList() {
        return list;
    }

    public void addEmployees(Employee employee) {
        list.add(employee);
    }

    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }

    public void display() {
        Collections.sort(list);
        for (Employee employee: list) System.out.println(employee);
    }

    public double avgSalary() {
        return getMonthlyPayment() / getTotalNumOfEmployees();
    }

    public double avgManagementSalary() {
        return getMonthlyPayment() / getTotalNunOfManagers();
    }
    public double getMonthlyPayment(){
        double sum = 0;
        for (Employee e: list) sum += e.getSalary();
        return sum;
    }
    public double getYearlyPayment(){
        return 12 * getMonthlyPayment();
    }
    public double getTotalNumOfEmployees(){
        return list.size();
    }
    public double getTotalNunOfManagers(){
        int managers = 0;
        for (Employee e: list) if (e.getClass().equals(Manager.class)) managers++;
        return managers;
    }
}
