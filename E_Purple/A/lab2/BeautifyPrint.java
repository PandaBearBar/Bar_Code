package E_Purple.A.lab2;

public class BeautifyPrint {
    public static void draw (FullYear fullYear){
        for (Date date:
                fullYear.getDates()) {
            System.out.println(date);

        }
    }
}
/*

import E_Sgola.A.lab2.BeautifyPrint;
import E_Sgola.A.lab2.FullYear;

import java.time.LocalDate;

        System.out.println(LocalDate.ofYearDay(2010, 350));
        System.out.println(LocalDate.ofYearDay(2010, 350).getMonthValue());
        System.out.println(LocalDate.ofYearDay(2010, 350).getDayOfMonth());
        FullYear fullYear = new FullYear(2058);
        BeautifyPrint.draw(fullYear);
 */