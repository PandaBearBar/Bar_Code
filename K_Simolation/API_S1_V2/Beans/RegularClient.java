package K_Simolation.API_S1_V2.Beans;

public class RegularClient extends Client{
    public RegularClient() {
        super(0.05f,1f);
    }

    @Override
    public String toString() {
        return "RegularClient{} " + super.toString();
    }
}
