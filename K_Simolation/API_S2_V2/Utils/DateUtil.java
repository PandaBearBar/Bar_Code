package K_Simolation.API_S2_V2.Utils;

import java.time.LocalDate;

public class DateUtil {
    public static String BeautifyDate(LocalDate date){
        return String.format("| %02d/%02d/%04d |",date.getDayOfMonth(),date.getMonthValue(),date.getYear());
    }
}
