package K_Simolation.API_S1_V2.Beans;

public  class Client extends Person{
    private float interestRate;
    private Account account;

    public Client(float interestRate, double num) {
        account = new Account();
        this.interestRate = interestRate;
        this.account.setBalance(account.getBalance()*num);
    }


    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "interestRate=" + interestRate +
                ", account=" + account +
                "} " + super.toString();
    }
}
