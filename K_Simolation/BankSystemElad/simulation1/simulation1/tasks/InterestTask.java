package K_Simolation.BankSystemElad.simulation1.simulation1.tasks;

/*
Created by Elad on 16/03/2022

*/


import K_Simolation.BankSystemElad.simulation1.simulation1.beans.Client;

import java.util.Set;
import java.util.TreeSet;

public class InterestTask implements Runnable {
    private Set<Client> clients = new TreeSet<>();

    public InterestTask(Set<Client> clients) {
        this.clients = clients;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread start");
            System.out.println("Thread goes to sleep");

            for (Client client : clients) {
                client.getAccount().setBalance(client.getAccount().getBalance() + client.getAccount().getBalance() * (client.getInterestRate() / 100));
                System.out.printf("client: %d named: %s balance after update: %.2f\n", client.getId(),
                        client.getName(), client.getAccount().getBalance());
            }
        }
    }
}
