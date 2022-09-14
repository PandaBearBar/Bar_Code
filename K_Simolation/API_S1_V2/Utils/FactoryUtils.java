package K_Simolation.API_S1_V2.Utils;

import K_Simolation.API_S1_V2.Beans.Client;
import K_Simolation.API_S1_V2.Beans.RegularClient;
import K_Simolation.API_S1_V2.Beans.VipClient;

import java.util.Scanner;

public class FactoryUtils {

    public static double initDouble(double max, double min) {
        return Math.random() * (max - min) + min;
    }

    public static Client initClient(String ans) {
            if (ans.toUpperCase().charAt(0) == 'R') return initRegular();
            else if (ans.toUpperCase().charAt(0) == 'V') return initVip();
            System.out.println("Invalid Answer...\nYou gor Regular Client\n");
            return initRegular();
    }

    private static Client initVip() {
        return new VipClient();
    }

    private static Client initRegular() {
        return new RegularClient();
    }
}
