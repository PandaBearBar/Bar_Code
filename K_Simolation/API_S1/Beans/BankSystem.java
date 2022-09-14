package K_Simolation.API_S1.Beans;

import K_Simolation.API_S1.Exceptions.deleteException;
import K_Simolation.API_S1.Exceptions.withdrawException;
import K_Simolation.API_S1.Tasks.InterestTask;
import K_Simolation.API_S1.Utils.BankStatistics;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

import static K_Simolation.API_S1.Utils.FactoryUtils.initClient;

public class BankSystem {
    private Set<Client> clients = new TreeSet<Client>(new Comparator<Client>() {
        @Override
        public int compare(Client client1, Client client2) {
            return (int) (client1.getAccount().getBalance() - client2.getAccount().getBalance());
        }
    });
    private InterestTask task = new InterestTask(clients);
    private Thread thread;
    private static Scanner scanner = new Scanner(System.in);
    private boolean isWorking = true;

    public BankSystem() {
        thread = new Thread(task);
        thread.start();

    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public InterestTask getTask() {
        return task;
    }

    public void setTask(InterestTask task) {
        this.task = task;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public void showMenu() {
        System.out.println(
                "\nHello User pls Choose from the next options :\n" +
                        "1.Add Client\n" +
                        "2.Delete Client\n" +
                        "3.withdraw\n" +
                        "4.deposit\n" +
                        "5.print all clients\n" +
                        "6.Who is the richest ?\n" +
                        "7.Who is the poorest ?\n" +
                        "8.Bank's Fortune ?\n" +
                        "9.Exit The Program"
        );
    }

    private int returnNumber(String scanner) {
        return scanner.matches("[0-9]") ? Integer.parseInt(scanner) : 0;
    }

    public void startSystem() throws deleteException, withdrawException {
        int bhira = 0;
        while (isWorking) {
            showMenu();
            bhira = returnNumber(scanner.next());
            switch (bhira) {
                case 1:
                    System.out.println("Hello Choose:\n'R'-Regular_Client\n'V'-Vip_Client");
                    addClient(initClient(scanner.next()));
                    break;
                case 2:
                    System.out.println("what is the 'Account ID' That u want to delete ?");
                    deleteClient(scanner.nextInt());
                    break;
                case 3:
                    withdraw(clientID(), amountTo("withdraw"));
                    break;
                case 4:
                    deposit(clientID(), amountTo("deposit"));
                    break;
                case 5:
                    printAll();
                    break;
                case 6:
                    System.out.println(BankStatistics.getRichestClient(new ArrayList<Person>(clients)));
                    break;
                case 7:
                    System.out.println(BankStatistics.printPoorestClient(new ArrayList<Person>(clients)));
                    break;
                case 8:
                    System.out.printf("%.3f\n", BankStatistics.getBankBalance(clients));
                    break;
                case 9:
                    endSystem();
                    break;
                default:
                    System.out.println("INVALID ANSWER ! TRY AGAIN....");
            }
        }
    }

    public void printAll() {
        for (Client c: clients) {
            System.out.println(c);
        }
    }

    public void deposit(int clientID, double amount) {
        boolean isThere = false;
        for (Client c: clients) {
            if (c.getId() == clientID) {
                double balance = c.getAccount().getBalance();
                balance += amount;
                c.getAccount().setBalance(balance);
                System.out.println("After Deposit :\n" + c);
                isThere = true;
                break;
            }
        }
        if (!isThere) lastMessage();
    }

    public void withdraw(int clientID, double amount) throws withdrawException {
        boolean isThere = false;
        for (Client c: clients) {
            if (c.getId() == clientID) {
                if (c.getAccount().getBalance() < amount) {
                    throw new withdrawException("Withdraw Problem", c.getId(), Date.valueOf(LocalDate.now()), c.getName(), c.getAccount().getBalance());
                } else {
                    double balance = c.getAccount().getBalance();
                    balance -= amount;
                    c.getAccount().setBalance(balance);
                    System.out.println("After Withdraw :\n" + c);
                    isThere = true;
                    break;
                }
            }
        }
        if (!isThere) lastMessage();
    }

    private void lastMessage() {
        System.out.println("Client Haven't been found...");
    }

    public void deleteClient(int Id) throws deleteException {
        for (Client c: clients) {
            if (c.getId() == Id) {
                if (c.getAccount().getBalance() < 0) {
                    throw new deleteException("Debt Problem", c.getId(), Date.valueOf(LocalDate.now()), c.getName(), c.getAccount().getBalance());
                } else {
                    clients.remove(c);
                    System.out.println("Client have been deleted");
                    break;
                }
            }
        }
        lastMessage();
    }

    private double amountTo(String message) {
        System.out.println("How Much u want to " + message + " ?");
        return scanner.nextDouble();
    }

    private int clientID() {
        System.out.println("Which clientId u want to withdraw from ?");
        return scanner.nextInt();
    }

    public void endSystem() {
        System.out.println("Thank u for using Bar's Bank System !");
        isWorking = false;
        scanner.close();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

}
