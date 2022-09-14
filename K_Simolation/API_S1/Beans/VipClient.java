package K_Simolation.API_S1.Beans;

public class VipClient extends Client{
    public VipClient() {
        super.setInterestReat(0.1f);
        super.getAccount().setBalance(super.getAccount().getBalance()*1.5);
    }
}
