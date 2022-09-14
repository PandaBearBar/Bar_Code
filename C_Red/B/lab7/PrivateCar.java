package C_Red.B.lab7;

public class PrivateCar extends Vehicle {

    public PrivateCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }

    @Override
    public int getDistance() {
        return 100;
    }

    @Override
    public int getCompetition() {
        return 101;
    }
}
