package K_Simolation.BankSystemElad.simulation1.simulation1.beans;

/*
Created by Elad on 16/03/2022

*/


public abstract class Client extends Person {
    private float interestRate;
    private Account account;

    public Client(float interestRate, Account account) {
        this.interestRate = interestRate;
        this.account = account;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "interestRate=" + interestRate +
                ", account=" + account +
                "} " + super.toString();
    }

    public static double getBalance(Client client) {
        return client.getAccount().getBalance();
    }


}
