package K_Simolation.API_S2.Utils;

import K_Simolation.API_S2.Beans.Person;

public class FactoryUtils {
    public static int initR(int max , int min){
        return (int)(Math.random()*(max-min)+min);
    }
}
