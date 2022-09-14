package F_Blue.part1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final int MAX_SIZE = 5;
    private int idClient;
    private String lastName;
    private String firstName;
    private final List<Account> accounts = new ArrayList<Account>();
    protected double commissionRate;
    protected double interestRate;

    public Client(int idClient, String lastName, String firstName, double commissionRate, double interestRate) {
        this.idClient = idClient;
        this.lastName = lastName;
        this.firstName = firstName;
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", accounts=" + accounts +
                ", commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.idClient == ((Client) obj).getIdClient();
    }
    public void addAccount (Account account){
        //todo - not implemented yet;
    }
    public void removeAccount(Account account){
        //todo - not implemented yet;
    }
    public Account findAccountById(int id){
        for (Account a : accounts) if (a != null && a.getAccountID() == id) return a;
        return null;
    }
    public void deposit (Account account, double amount){
        //todo - not implemented yet;
    }
    public void withdraw  (Account account, double amount){
        //todo - not implemented yet;
    }
    public double getFortune (){
        double fortune = 0;
        for (Account a: accounts) fortune+=a.getBalance();
        return fortune;
    }
    public void autoUpdateAccount(){
        //todo - not implemented yet;
    }
}
