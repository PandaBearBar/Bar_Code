package K_Simolation.BankSystemElad.simulation1.simulation1.beans;

/*
Created by Elad on 16/03/2022

*/

public class Account {
    private double balance;

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
