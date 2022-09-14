package K_Simolation.API_S2_V2.Utils;

import java.time.LocalDate;

public class DateFactory {
    public static LocalDate getLocalDate(){
        return LocalDate.of(initI(2010, 1960),initI(12, 1),initI(28, 1));
    }
    public static int initI(int max, int min){
        return (int) (Math.random()*(max + 1 - min ) + min) ;
    }

}
