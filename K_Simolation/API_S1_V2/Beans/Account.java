package K_Simolation.API_S1_V2.Beans;

import K_Simolation.API_S1_V2.Utils.FactoryUtils;

public class Account {
    private double balance;

    public Account() {
        this.balance = FactoryUtils.initDouble(15_001, 5_000);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
