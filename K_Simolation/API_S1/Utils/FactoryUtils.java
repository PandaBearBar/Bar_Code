package K_Simolation.API_S1.Utils;

import K_Simolation.API_S1.Beans.Client;
import K_Simolation.API_S1.Beans.RegularClient;
import K_Simolation.API_S1.Beans.VipClient;

public class FactoryUtils {
    public static Client initClient(String ans){
        char answer = ans.toLowerCase().charAt(0);
        if (answer=='r')return initRegularClient();
        else if (answer == 'v')return initVipClient();
        System.out.println("You Have Entered Invalid Answer...\nI gonna open for u a Regular Client account have fun....");
        return initRegularClient();
    }
    private static Client initVipClient() {
        return new VipClient();
    }

    private static Client initRegularClient() {
        return new RegularClient();
    }
}
