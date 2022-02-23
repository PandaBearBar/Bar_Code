package C_adoma.C.lab7;

abstract class Vehicle implements RaceCompetitor{
    private final String manuFacturerName;
    private final String frameNumber;


    public Vehicle(String manuFacturerName, String frameNumber) {
        this.manuFacturerName = manuFacturerName;
        this.frameNumber = frameNumber;

    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "manuFacturerName='" + manuFacturerName + '\'' +
                ", frameNumber='" + frameNumber + '\'' +
                '}';
    }
}
