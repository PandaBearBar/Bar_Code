package K_Simolation.API_S1_V2.Task;

import K_Simolation.API_S1_V2.Beans.Client;

import java.util.Set;
import java.util.TreeSet;

public class InterestTask implements Runnable{
    private Set<Client> clients = new TreeSet<>();

    public InterestTask(Set<Client> clients) {
        this.clients = clients;
    }
    @Override
    public void run() {
        System.out.println("" +
                "████████╗██╗  ██╗██████╗ ███████╗ █████╗ ██████╗     ███████╗████████╗ █████╗ ██████╗ ████████╗███████╗██████╗ \n" +
                "╚══██╔══╝██║  ██║██╔══██╗██╔════╝██╔══██╗██╔══██╗    ██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
                "   ██║   ███████║██████╔╝█████╗  ███████║██║  ██║    ███████╗   ██║   ███████║██████╔╝   ██║   █████╗  ██║  ██║\n" +
                "   ██║   ██╔══██║██╔══██╗██╔══╝  ██╔══██║██║  ██║    ╚════██║   ██║   ██╔══██║██╔══██╗   ██║   ██╔══╝  ██║  ██║\n" +
                "   ██║   ██║  ██║██║  ██║███████╗██║  ██║██████╔╝    ███████║   ██║   ██║  ██║██║  ██║   ██║   ███████╗██████╔╝\n" +
                "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝     ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝ \n" +
                "                                                                                                               ");
        while(true){
            try{
                System.out.println("" +
                        "████████╗██╗  ██╗██████╗ ███████╗ █████╗ ██████╗     ███████╗██╗     ███████╗███████╗██████╗ \n" +
                        "╚══██╔══╝██║  ██║██╔══██╗██╔════╝██╔══██╗██╔══██╗    ██╔════╝██║     ██╔════╝██╔════╝██╔══██╗\n" +
                        "   ██║   ███████║██████╔╝█████╗  ███████║██║  ██║    ███████╗██║     █████╗  █████╗  ██████╔╝\n" +
                        "   ██║   ██╔══██║██╔══██╗██╔══╝  ██╔══██║██║  ██║    ╚════██║██║     ██╔══╝  ██╔══╝  ██╔═══╝ \n" +
                        "   ██║   ██║  ██║██║  ██║███████╗██║  ██║██████╔╝    ███████║███████╗███████╗███████╗██║     \n" +
                        "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═════╝     ╚══════╝╚══════╝╚══════╝╚══════╝╚═╝     \n" +
                        "                                                                                             ");
                Thread.sleep(1000*30);
                for (Client c : clients) {
                    double newBalance = c.getAccount().getBalance()*(1+c.getInterestRate());
                    c.getAccount().setBalance(newBalance);
                    System.out.println(c);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}