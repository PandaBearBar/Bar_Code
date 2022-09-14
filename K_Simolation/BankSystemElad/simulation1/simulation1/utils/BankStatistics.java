package K_Simolation.BankSystemElad.simulation1.simulation1.utils;

/*
Created by Elad on 16/03/2022

*/


import K_Simolation.BankSystemElad.simulation1.simulation1.beans.BankSystem;
import K_Simolation.BankSystemElad.simulation1.simulation1.beans.Client;
import K_Simolation.BankSystemElad.simulation1.simulation1.beans.Person;

import java.util.List;
import java.util.Set;

public class BankStatistics {

    public static int countMembers(BankSystem bank) {
        return bank.getClients().size();
    }

    public static double getBankBalance(Set<Client> clients) {
        double sum = 0;
        for (Client client : clients) {
            sum += client.getAccount().getBalance();
        }
        return sum;
    }

    public static Client getRichestClient(List<Person> clients) {
        return (Client) (clients.get(clients.size() - 1));
    }

    public static Client getPoorestClient(List<Person> clients) {
        return (Client) (clients.get(0));
    }
}
