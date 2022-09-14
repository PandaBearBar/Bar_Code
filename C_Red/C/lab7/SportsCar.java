package C_Red.C.lab7;

public class SportsCar extends Vehicle{
    private static int index =0;

    public SportsCar(String manuFacturerName, String frameNumber) {
        super(manuFacturerName, frameNumber);
        index++;
    }

    @Override
    public int getDistance() {
        return 100+index;
    }

    @Override
    public int getCompetitionNumber() {
        return 404+index;
    }
}
