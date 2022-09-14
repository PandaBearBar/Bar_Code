package K_Simolation.API_S1_V2.System;

import K_Simolation.API_S1_V2.Beans.Client;
import K_Simolation.API_S1_V2.Exceptions.deleteException;
import K_Simolation.API_S1_V2.Exceptions.withdrawException;
import K_Simolation.API_S1_V2.Task.InterestTask;
import K_Simolation.API_S1_V2.Utils.BankStatistics;
import K_Simolation.API_S1_V2.Utils.FactoryUtils;


import java.util.*;

public class BankSystem {
    private Set<Client> clients = new TreeSet<>(new Comparator<Client>() {
        @Override
        public int compare(Client client1, Client client2) {
            return (int) (client1.getAccount().getBalance() - client2.getAccount().getBalance());
        }
    });
    private InterestTask task = new InterestTask(clients);
    private static Scanner scanner = new Scanner(System.in);
    public static List<Client> clientList;

    public BankSystem() {
        Thread thread = new Thread(task);
        thread.start();
    }

    public InterestTask getTask() {
        return task;
    }

    public void setTask(InterestTask task) {
        this.task = task;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        BankSystem.scanner = scanner;
    }

    public static List<Client> getClientList() {
        return clientList;
    }

    public static void setClientList(List<Client> clientList) {
        BankSystem.clientList = clientList;
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

    public void SystemStart(){
        boolean isWorking = true;
        while (isWorking) {
            clientList = new ArrayList<>(clients);
            showMenu();
            int bhira = veriftIn(scanner.next());
            switch (bhira) {
                case 1:
                    System.out.println("'R' - Regular Client\n'V' - Vip Client");
                    addClient(FactoryUtils.initClient(scanner.next()));
                    break;
                case 2:
                    try {
                        System.out.println("What is the client ID that u want to delete ?");
                        deleteClient(veriftIn(scanner.next()));
                    } catch (deleteException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("What is the amount that u want to withdraw ?");
                        withdraw(veriftInD(scanner.next()));
                    } catch (withdrawException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("What is the amount that u want to deposit ?");
                    deposit(veriftInD(scanner.next()));
                    break;
                case 5:
                    printAll();
                    break;
                case 6:
                    System.out.println(BankStatistics.getRichestClient(clientList));
                    break;
                case 7:
                    System.out.println(BankStatistics.getPoorestClient(clientList));
                    break;
                case 8:
                    System.out.println(BankStatistics.getBankBalance());
                    break;
                case 9:
                    SystemEnd();
                    isWorking = false;
                    break;
                default:
                    System.out.println("Invalid Input...\nTry Again...");
                    break;
            }
        }
    }

    public void printAll() {
        for (Client c: clients) {
            System.out.println(c);
        }
    }

    public void deposit(double amount) {
        System.out.println("What is ur Client ID ?");
        int clientsId = veriftIn(scanner.next());
        for (Client c: clients) {
            if (c.getId() == clientsId) {
                double newBalance = c.getAccount().getBalance() + amount;
                System.out.println("You have deposit : " + amount);
                c.getAccount().setBalance(newBalance);
            }
        }
    }

    public void withdraw(double amount) throws withdrawException {
        boolean isthere = false;
        System.out.println("What is ur Client ID ?");
        int clientsId = veriftIn(scanner.next());
        for (Client c: clients) {
            if (c.getId() == clientsId) {
                if (c.getAccount().getBalance() < amount)
                    throw new withdrawException("Withdraw Problem", new Date(), c.getId(), c.getName(), c.getAccount().getBalance());
                double newBalance = c.getAccount().getBalance() - amount;
                System.out.println("You have withdraw : " + amount);
                c.getAccount().setBalance(newBalance);
                isthere = true;
            }
        }
        if (!isthere) message();
    }

    public void deleteClient(int clientId) throws deleteException {
        boolean isthere = false;
        for (Client c: clients) {
            if (c.getId() == clientId) {
                if (c.getAccount().getBalance() < 0)
                    throw new deleteException("Delete Problem", new Date(), c.getId(), c.getName(), c.getAccount().getBalance());
                clients.remove(c);
                System.out.println("Removal Done\n");
                isthere = true;
            }
        }
        if (!isthere) message();
    }

    private void message() {
        System.out.println("Client haven't been found...");
    }

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Added Done\n");
    }

    public void SystemEnd() {
        scanner.close();
        System.out.println("" +
                "██████╗ ██╗   ██╗███████╗\n" +
                "██╔══██╗╚██╗ ██╔╝██╔════╝\n" +
                "██████╔╝ ╚████╔╝ █████╗  \n" +
                "██╔══██╗  ╚██╔╝  ██╔══╝  \n" +
                "██████╔╝   ██║   ███████╗\n" +
                "╚═════╝    ╚═╝   ╚══════╝\n" +
                "                         ");
    }

    private int veriftIn(String In) {
        boolean isNum = true;
        for (int i = 0; i < In.length(); i++) {
            if (!In.matches("[0-9]+")) isNum = false;
        }
        return (isNum) ? Integer.parseInt(In) : 0;
    }

    private double veriftInD(String In) {
        boolean isNum = true;
        for (int i = 0; i < In.length(); i++) {
            if (!In.matches("[0-9]+\\.[0-9]+") && !In.matches("[0-9]+")) {
                isNum = false;
                System.out.println("Invalid Input so the input changed to 0.0");
            }
        }
        return (isNum) ? Double.parseDouble(In) : 0;
    }
}
