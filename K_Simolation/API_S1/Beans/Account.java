package K_Simolation.API_S1.Beans;

public class Account {
    private double balance = Math.random()*5001 + 5000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + String.format("%.3f", balance) +
                '}';
    }
}
