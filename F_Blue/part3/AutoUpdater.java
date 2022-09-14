package F_Blue.part3;

import java.util.ArrayList;
import java.util.List;

public class AutoUpdater implements Runnable {
    private List<Client> clients;

    public AutoUpdater(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void run() {

        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).autoUpdateAccount();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
