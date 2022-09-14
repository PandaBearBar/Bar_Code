package K_Simolation.API_S1.Utils;

import K_Simolation.API_S1.Beans.BankSystem;
import K_Simolation.API_S1.Beans.Client;
import K_Simolation.API_S1.Beans.Person;

import java.util.List;
import java.util.Set;

public class BankStatistics {
    public static Client printPoorestClient(List<Person> clients) {
        return (Client) (clients.get(0));
    }

    public static Client getRichestClient(List<Person> clients) {
        return (Client) clients.get(clients.size()-1);
    }

    public static double getBankBalance(Set<Client> clients) {
        double sum = 0;
        for (Client c : clients) {
            sum +=c.getAccount().getBalance();
        }
        return sum;
    }
    public static int countMembers(BankSystem bankSystem){
        return bankSystem.getClients().size();
    }
}
