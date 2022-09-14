package F_Blue.part3;

import java.util.ArrayList;
import java.util.List;

abstract class Client {
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

    public void addAccount(Account account) {
        if (account == findAccountById(account.getAccountID())) System.out.println("Account id already exist");
        else if (this.accounts.size() == MAX_SIZE) System.out.println("There is no space for new account");
        else {
            this.accounts.add(account);
            System.out.println("Account added successfully");
            Logger.getInstance().addLog(new Log(account.getAccountID(), "Adding account", account.getBalance()));
        }
    }

    public void removeAccount(Account account) {
        //todo - need to be checked;
        if (account == findAccountById(account.getAccountID())) {
            accounts.remove(account);
            System.out.println("Account removed successfully");
            Logger.getInstance().addLog(new Log(account.getAccountID(), "Removing account", account.getBalance()));
        } else System.out.println("Account does not exist");
    }

    public Account findAccountById(int id) {
        for (Account a: accounts) if (a != null && a.getAccountID() == id) return a;
        return null;
    }

    public void deposit(Account account, double amount) {
        //todo - need to be checked;
        if (account == findAccountById(account.getAccountID())) {
            double netoDeposit = amount - (amount * commissionRate / 100);
            System.out.println("Deposit successfully");
            account.setBalance(account.getBalance() + netoDeposit);
            Logger.getInstance().addLog(new Log(account.getAccountID(), "Deposit money", amount));
            //todo - " Make sure to update total Commission after you create Bank Class
            Bank.getInstance().updateTotalCommission(amount * commissionRate / 100);
        } else System.out.println("Account does not exist");

    }

    public void withdraw(Account account, double amount) throws WithdrawExecption {
        //todo - need to be checked;
        if (account == findAccountById(account.getAccountID())) {
            double netoWithdraw = amount + (amount * commissionRate / 100);
            if (account.getBalance() < netoWithdraw) throw new WithdrawExecption(getIdClient(), account.getBalance(), amount);
            else {
                System.out.println("Deposit successfully");
                account.setBalance(account.getBalance() - netoWithdraw);
                Logger.getInstance().addLog(new Log(account.getAccountID(), "Withdraw money", amount));
            }
        } else System.out.println("Account does not exist");
    }

    public double getFortune() {
        double fortune = 0;
        for (Account a: accounts) fortune += a.getBalance();
        return fortune;
    }

    public void autoUpdateAccount() {
        //todo - need to be checked;
        for (int j = 0; j < accounts.size(); j++) {
            double interestAmount = accounts.get(j).getBalance() + (accounts.get(j).getBalance() * interestRate / 100);
            accounts.get(j).setBalance(interestAmount);
            Logger.getInstance().addLog(new Log(accounts.get(j).getAccountID(), "Interest added", interestAmount));
        }
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void fullReport() {
        System.out.println(
                "ID : " + idClient +
                        "\n Name : " + getFullName() +
                        "\n Commission rate : " + getCommissionRate() +
                        "\n Interest Rate : " + getInterestRate() +
                        "\n Client definition : " + getClass().getSimpleName()
        );
    }

    abstract void draw();

    public void showAccounts() {
        for (Account a: accounts) {
            System.out.println(a);
        }
    } // this is for me as a developer to check

}
