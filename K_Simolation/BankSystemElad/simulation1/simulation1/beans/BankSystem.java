package K_Simolation.BankSystemElad.simulation1.simulation1.beans;

/*
Created by Elad on 16/03/2022

*/



import K_Simolation.BankSystemElad.simulation1.simulation1.exceptions.DeleteException;
import K_Simolation.BankSystemElad.simulation1.simulation1.exceptions.WithdrawException;
import K_Simolation.BankSystemElad.simulation1.simulation1.tasks.InterestTask;
import K_Simolation.BankSystemElad.simulation1.simulation1.utils.BankStatistics;

import java.time.Instant;
import java.util.*;

import static K_Simolation.BankSystemElad.simulation1.simulation1.utils.FactoryMethods.initRegClient;
import static K_Simolation.BankSystemElad.simulation1.simulation1.utils.FactoryMethods.initVipClient;


public class BankSystem {
    private Set<Client> clients = new TreeSet<>(new Comparator<Client>() {
        @Override
        public int compare(Client c1, Client c2) {
            if (c1.getAccount().getBalance() > c2.getAccount().getBalance()) {
                return 1;
            } else if (c1.getAccount().getBalance() < c2.getAccount().getBalance()) {
                return -1;
            } else if (c1.getId() > c2.getId()) {
                return 1;
            } else if (c1.getId() < c2.getId()) {
                return -1;
            }
            return 0;
        }
    });
    private InterestTask task = new InterestTask(clients);
    private static Scanner scanner = new Scanner(System.in);
    private boolean continueProgram = true;

    public BankSystem() {
        Thread t1 = new Thread(task);
        t1.start();
    }

    public Set<Client> getClients() {
        return clients;
    }

    public boolean isContinueProgram() {
        return continueProgram;
    }

    public void showMenu() {
        System.out.println(
                "1. Add Client\n" +
                        "2. Delete Client\n" +
                        "3. Withdraw money\n" +
                        "4. Deposit money\n" +
                        "5. Print all clients\n" +
                        "6. Print richest client\n" +
                        "7. Print Poorest Client\n" +
                        "8. Print sum of money in the bank\n" +
                        "9. Exit Program\n" +
                        "Please choose your action");
    }

    public void startSystem() throws DeleteException, WithdrawException {
        int choice = 0;
        do {
            List<Person> clientsList = new ArrayList<>(clients);
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please choose 'R' for regular client or 'V' for VIP client");
                    char clientType = scanner.next().charAt(0);
                    if (clientType == 'R') {
                        addClient(initRegClient());
                    } else if (clientType == 'V') {
                        addClient(initVipClient());
                    } else {
                        System.out.println("Illegal request");
                    }
                    break;
                case 2:
                    System.out.println("Please enter client id to delete: ");
                    deleteClient(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Please enter amount to withdraw: ");
                    withdraw(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Please enter amount to deposit: ");
                    deposit(scanner.nextInt());
                    break;
                case 5:
                    printAll();
                    break;
                case 6:
                    System.out.println(BankStatistics.getRichestClient(clientsList));
                    break;
                case 7:
                    System.out.println(BankStatistics.getPoorestClient(clientsList));
                    break;
                case 8:
                    System.out.println(BankStatistics.getBankBalance(clients));
                    break;
                case 9:
                    continueProgram = false;
                    endSystem();
            }
        } while (choice != 9);

    }

    public void endSystem() {
        System.out.println("Thank you and goodbye");
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void deleteClient(int id) throws DeleteException {
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() >= 0) {
                    clients.remove(client);
                    return;
                }
                throw new DeleteException("Client cannot be deleted before paying his debt",
                        Date.from(Instant.now()), id, client.getName(), client.getAccount().getBalance());
            }
        }
        System.out.println("Client does not exist");
    }

    public void withdraw(double amount) throws WithdrawException {
        System.out.println("Please specify your client id");
        int id = scanner.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() > amount) {
                    client.getAccount().setBalance(client.getAccount().getBalance() - amount);
                    return;
                }
                throw new WithdrawException("Not enough money to withdraw",
                        Date.from(Instant.now()), id, client.getName(), client.getAccount().getBalance());
            }
        }
        System.out.println("Client does not exist");
    }

    public void deposit(double amount) {
        System.out.println("Please specify your client id");
        int id = scanner.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                client.getAccount().setBalance(client.getAccount().getBalance() + amount);
                return;
            }
        }
        System.out.println("Client does not exist");
    }

    public void printAll() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

}
