package F_Blue.part2;

public class GoldClient extends Client{
    public GoldClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 2, 0.3);
    }

    @Override
    void draw() {
        System.out.println(
                "   ____       _     _    ____ _ _            _   \n" +
                "  / ___| ___ | | __| |  / ___| (_) ___ _ __ | |_ \n" +
                " | |  _ / _ \\| |/ _` | | |   | | |/ _ \\ '_ \\| __|\n" +
                " | |_| | (_) | | (_| | | |___| | |  __/ | | | |_ \n" +
                "  \\____|\\___/|_|\\__,_|  \\____|_|_|\\___|_| |_|\\__|\n" +
                "                                                 ");
    }

    @Override
    public String toString() {
        return "GoldClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
