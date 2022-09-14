package C_Red.OopLab2JavaPolymorphismRaceCar;

public class PrivateCar extends Vehicle {

    public PrivateCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }



    @Override
    public int getDistance() {
        return 5;
    }

    @Override
    public int getCompetitionNumber() {
        return 545;
    }
}
