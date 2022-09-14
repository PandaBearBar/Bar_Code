package F_Blue.part1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final int MAX_SIZE = 5;
    private final String name = "John Bryce Bank";
    private List<Client> clients = new ArrayList<Client>();
    private static double totalCommission;

    public Bank() {
        totalCommission = 0;
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }

    public void addClient(Client client) {
        //todo - not implemented yet;
    }

    public void removeClient(Client client) {
        //todo - not implemented yet;
    }

    public Client findClientById(int id) {
        for (Client c: clients) if (c != null && c.getIdClient() == id) return c;
        return null;
    }

    public void viewLogs() {
        //todo - not implemented yet;
    }

    public double getFortune() {
        double sum = 0;
        for (Client c: clients) sum += c.getFortune();
        return sum;
    }

    public void startAccountUpdater() {
        //todo - not implenebted yet;
    }

    public static void updateTotalCommission(double commission) {
        totalCommission += commission;
    }
}
