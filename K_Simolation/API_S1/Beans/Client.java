package K_Simolation.API_S1.Beans;

public abstract class Client extends Person{
    private float interestReat;
    private Account account = new Account();

    public float getInterestReat() {
        return interestReat;
    }

    public void setInterestReat(float interestReat) {
        this.interestReat = interestReat;
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
                "interestReat=" + interestReat +
                ", account=" + account +
                "} " + super.toString();
    }
}
