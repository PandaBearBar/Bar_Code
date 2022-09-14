package K_Simolation.API_S1_V2.Utils;

import K_Simolation.API_S1_V2.Beans.Client;
import K_Simolation.API_S1_V2.System.BankSystem;

import java.util.List;

public class BankStatistics {
    public static int countMembers() {
        return BankSystem.getClientList().size();
    }

    public static double getBankBalance() {
        double sum =0 ;
        for (Client c : BankSystem.getClientList()) {
            sum += c.getAccount().getBalance();
        }
        return sum;
    }

    public static Client getRichestClient(List<Client> clients) {
        return clients.get(0);
    }

    public static Client getPoorestClient(List<Client> clients) {
        return clients.get(clients.size()-1);
    }
}
