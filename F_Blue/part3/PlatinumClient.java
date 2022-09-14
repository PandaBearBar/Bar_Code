package F_Blue.part3;

public class PlatinumClient extends Client {
    public PlatinumClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 1, 0.5);
    }

    @Override
    void draw() {
        System.out.println(
                "  ____  _       _   _                          ____ _ _            _   \n" +
                " |  _ \\| | __ _| |_(_)_ __  _   _ _ __ ___    / ___| (_) ___ _ __ | |_ \n" +
                " | |_) | |/ _` | __| | '_ \\| | | | '_ ` _ \\  | |   | | |/ _ \\ '_ \\| __|\n" +
                " |  __/| | (_| | |_| | | | | |_| | | | | | | | |___| | |  __/ | | | |_ \n" +
                " |_|   |_|\\__,_|\\__|_|_| |_|\\__,_|_| |_| |_|  \\____|_|_|\\___|_| |_|\\__|\n" +
                "                                                                       ");

    }

    @Override
    public String toString() {
        return "PlatinumClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
