package F_Blue.part3;

public class RegularClient extends Client {
    public RegularClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 3, 0.1);

    }

    @Override
    void draw() {
        System.out.println(
                "  ____                  _               ____ _ _            _   \n" +
                " |  _ \\ ___  __ _ _   _| | __ _ _ __   / ___| (_) ___ _ __ | |_ \n" +
                " | |_) / _ \\/ _` | | | | |/ _` | '__| | |   | | |/ _ \\ '_ \\| __|\n" +
                " |  _ <  __/ (_| | |_| | | (_| | |    | |___| | |  __/ | | | |_ \n" +
                " |_| \\_\\___|\\__, |\\__,_|_|\\__,_|_|     \\____|_|_|\\___|_| |_|\\__|\n" +
                "            |___/                                               ");
    }

    @Override
    public String toString() {
        return "RegularClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
