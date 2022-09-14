package K_Simolation.API_S1.Tasks;

import K_Simolation.API_S1.Beans.Client;

import java.util.Set;
import java.util.TreeSet;

public class InterestTask implements Runnable {
    private Set<Client> clients = new TreeSet<Client>();

    public InterestTask(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void run() {
        System.out.println("The thread have started");
        while (true) {
            try {
                System.out.println("The thread have went to sleep");
                Thread.sleep(1000 * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Client c: clients) {
                c.getAccount().setBalance(c.getAccount().getBalance() * (1 + c.getInterestReat()));
                System.out.println(
                        "After Update :" +
                                "\nID : " + c.getId() +
                                "\nName : " + c.getName() +
                                "\nBalance : " + c.getAccount().getBalance()
                );
            }
        }
    }
}
