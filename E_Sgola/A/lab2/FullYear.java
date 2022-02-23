package E_Sgola.A.lab2;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;

public class FullYear {
    private Date[] dates;

    public FullYear(int year) {
        int daysOfTheYear = LocalDate.of(year, 12, 31).getDayOfYear();
        dates = new Date[daysOfTheYear];
        for (int i = 0; i < dates.length; i++) {
            int month = LocalDate.ofYearDay(year, i + 1).getMonthValue();
            int day = LocalDate.ofYearDay(year, i + 1).getDayOfMonth();
            dates[i] = new Date(day, month, year);
        }

    }

    public Date[] getDates() {
        return dates;
    }

    public void setDates(Date[] dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "FullYear{" +
                "dates=" + Arrays.toString(dates) +
                '}';
    }
}
