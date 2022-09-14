package K_Simolation.API_S1_V2.Beans;

public class VipClient extends Client{
    public VipClient() {
        super(0.1f, 1.5f);
    }

    @Override
    public String toString() {
        return "VipClient{} " + super.toString();
    }
}
