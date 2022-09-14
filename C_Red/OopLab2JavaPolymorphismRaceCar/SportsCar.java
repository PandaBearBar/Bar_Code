package C_Red.OopLab2JavaPolymorphismRaceCar;

public class SportsCar extends Vehicle {

    public SportsCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }

    @Override
    public int getDistance() {
        return 7;
    }

    @Override
    public int getCompetitionNumber() {
        return 101;
    }
}
