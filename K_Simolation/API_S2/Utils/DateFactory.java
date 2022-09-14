package K_Simolation.API_S2.Utils;

import java.time.LocalDate;

public class DateFactory {
    public static LocalDate getLocalDate(){
        return LocalDate.of(
                FactoryUtils.initR(2011, 1960),
                FactoryUtils.initR(13, 1),
                FactoryUtils.initR(29, 1)
        );
    }
}
