package K_Simolation.API_S2.Utils;

import java.time.LocalDate;

public class DateUtils {
    public static String BeautifyDate(LocalDate date){
        return String.format("%02d/%02d/%4d", date.getDayOfMonth(),date.getMonthValue(),date.getYear());
    }
}
