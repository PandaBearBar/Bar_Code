package I_Lime.part2;

import java.util.Collection;
import java.util.List;

public class Helper {

    public static void report(){
        System.out.println("Total Employee : " + Company.getInstance().getTotalNumOfEmployees());
        System.out.println("Total Managers : " + Company.getInstance().getTotalNunOfManagers());
        System.out.println("Total Monthly Payment : "+ String.format("%.2f",Company.getInstance().getMonthlyPayment()));
        System.out.println("Total Yearly Payment : "+ String.format("%.2f",Company.getInstance().getYearlyPayment()));
        System.out.println("Average Salary : " + String.format("%.2f",Company.getInstance().avgSalary()));
        System.out.println("Average Managers Salary : " + String.format("%.2f",Company.getInstance().avgManagementSalary()));
    }

}
