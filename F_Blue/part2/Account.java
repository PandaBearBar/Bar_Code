package F_Blue.part2;

public class Account {
    private int accountID;
    private double balance;

    public Account(int accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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
                "accountID=" + accountID +
                ", balance=" + balance +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        return this.accountID == ((Account) obj).getAccountID();
    }
}
