package C_adoma.C.lab7;

public class PrivateCar extends Vehicle {
    private int index =0;
    public PrivateCar(String manuFacturerName, String frameNumber) {
        super(manuFacturerName, frameNumber);
        index ++ ;
    }

    @Override
    public int getDistance() {
        return 10+index;
    }

    @Override
    public int getCompetitionNumber() {
        return 69+index;
    }
}
