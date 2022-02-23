package C_adoma.B.lab2;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);
    }

    public int checkMonth(int month) {
        if (month > 0 && month < 13) return month;
        System.out.println("Invalid Month");
        return 1;
    }

    public int checkDay(int day) {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 0 && day < 32) return day;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 0 && day < 31) return day;
            case 2:
                if (day > 0 && day < 30 &&!Year.isLeap(this.year))return day;
                else if (day > 0 && day < 29 &&Year.isLeap(this.year))return day;
        }
        System.out.println("Invalid Month");
        return 1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
