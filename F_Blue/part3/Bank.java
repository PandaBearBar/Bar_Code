package F_Blue.part3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final int MAX_SIZE = 9;
    private final String name = "John Bryce Bank";
    private List<Client> clients = new ArrayList<>();
    private static double totalCommission;
    private static Bank instance = new Bank();
    private Thread thread;


    private Bank() {
        totalCommission = 0;
        startAccountUpdater();
    }

    public Thread getThread() {
        return thread;
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
        //todo - need to be checked;
        if (client == findClientById(client.getIdClient())) {
            System.out.println("Client already exist");
        } else if (clients.size() == MAX_SIZE) System.out.println("there is no space for new client");
        else {
            clients.add(client);
            System.out.println("Client added successfully");
            Logger.getInstance().addLog(new Log(client.getIdClient(), "Client added", client.getFortune()));
        }
    }

    public void removeClient(Client client) {
        //todo - need to be checked;
        if (client == findClientById(client.getIdClient())) {
            clients.remove(client);
            System.out.println("Client removed successfully");
            Logger.getInstance().addLog(new Log(client.getIdClient(), "Removing Client", client.getFortune()));
        } else System.out.println("Client does not exist");
    }

    public Client findClientById(int id) {
        for (Client c: clients) if (c != null && c.getIdClient() == id) return c;
        return null;
    }

    public void viewLogs() {
        //todo - need to be checked;
        Logger.getInstance().display();
    }

    public double getFortune() {
        double sum = 0;
        for (Client c: clients) sum += c.getFortune();
        return sum;
    }

    public void startAccountUpdater() {
        thread = new Thread(new AutoUpdater(clients));
        thread.start();
    }

    public void updateTotalCommission(double commission) {
        totalCommission += commission;
    }

    public static Bank getInstance() {
        return instance;
    }
    public void bankDisplay () {
        for (Client c : clients) {
            System.out.println(c);
        }
    }
}
