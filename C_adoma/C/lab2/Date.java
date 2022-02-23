package C_adoma.C.lab2;

import java.time.Year;

public class Date {
    private int days;
    private int month;
    private int year;

    public Date(int days, int month, int year) {
        this.days = days;
        this.month = month;
        this.year = year;
    }

    public int checkMonth(int month) {
        return (month > 0 && month < 13) ? month : 1;
    }
    public int checkDay(int day ){
       switch (checkMonth(this.month)){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               return (day>0&&day<32)?day:1;
           case 4:
           case 6:
           case 9:
           case 11:
               return (day>0&&day<31)?day:1;
           case 2:
               return (day>0&&day<29&&Year.isLeap(this.year))?day:(day>0&&day<30&&!Year.isLeap(this.year))?day:1;
           default:
               return 1;
       }
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "days=" + checkDay(days) +
                ", month=" + checkMonth(this.month) +
                ", year=" + year +
                '}';
    }
}
