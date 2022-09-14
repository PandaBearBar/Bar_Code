package I_Lime.part1;

import java.util.List;

public class Helper {
    public static double avgSalary(List<Employee> employees){
        int sofer = 0;
        double avg =0;
        for (Employee e : employees){
            avg += e.getSalary();
            sofer++;
        }
        return avg/sofer;
    }
    public static double avgManagementSalary(List<Employee> employees){
        int sofer = 0;
        double avg =0;
        for (Employee e : employees) if (e.getClass().getSimpleName().equals("Manager")) {
            avg += e.getSalary();
            sofer ++;
        }
        return avg/sofer;
    }
    public static void display(List<Employee> employees){
        for (Employee e : employees) System.out.println(e);
    }
    public static void report(List<Employee> employees){
        System.out.println("AVERAGE SAL = " + String.format("%.2f",avgSalary(employees)));
        System.out.println("AVERAGE Manager SAL = " + String.format("%.2f",avgManagementSalary(employees)));
        display(employees);
    }

}
