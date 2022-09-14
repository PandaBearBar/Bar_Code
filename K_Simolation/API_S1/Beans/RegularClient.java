package K_Simolation.API_S1.Beans;

public class RegularClient extends Client{
    public RegularClient() {
        super.setInterestReat(0.05f);
    }

    @Override
    public String toString() {
        return "RegularClient{} " + super.toString();
    }
}
