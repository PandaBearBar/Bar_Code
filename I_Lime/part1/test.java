package I_Lime.part1;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<Employee>(FactoryUtils.initEmployees());
        System.out.println(employees.toString());
        Helper.report(employees);
    }
}
