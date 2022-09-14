package I_Lime.part5;

import java.time.LocalDateTime;

public class Helper {

    public static void report() throws CompanySystemException {
        System.out.println("Total Employee : " + Company.getInstance().getTotalNumOfEmployees());
        System.out.println("Total Managers : " + Company.getInstance().getTotalNunOfManagers());
        System.out.println("Total Monthly Payment : "+ String.format("%.2f", Company.getInstance().getMonthlyPayment()));
        System.out.println("Total Yearly Payment : "+ String.format("%.2f", Company.getInstance().getYearlyPayment()));
        System.out.println("Average Salary : " + String.format("%.2f", Company.getInstance().getAverageSalary()));
        System.out.println("Average Managers Salary : " + String.format("%.2f", Company.getInstance().getAverageManagementSalary()));
    }
    public static String format(LocalDateTime time){
        int day = time.getDayOfMonth();
        int month = time.getDayOfMonth();
        int year = time.getYear();
        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        return String.format("%d/%d/%d - %d:%d:%d",day,month,year,hour,min,sec);
    }

}
