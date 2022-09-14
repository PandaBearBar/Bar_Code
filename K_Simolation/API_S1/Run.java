package K_Simolation.API_S1;


import K_Simolation.API_S1.Beans.BankSystem;
import K_Simolation.API_S1.Beans.RegularClient;
import K_Simolation.API_S1.Beans.VipClient;

public class Run {
    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();
        try {
            bankSystem.startSystem();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
