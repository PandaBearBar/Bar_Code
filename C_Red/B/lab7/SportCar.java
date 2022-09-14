package C_Red.B.lab7;

public class SportCar extends Vehicle {
    public SportCar(String manufacturerName, String frameNumber) {
        super(manufacturerName, frameNumber);
    }

    @Override
    public int getDistance() {
        return 404;
    }

    @Override
    public int getCompetition() {
        return 404;
    }
}
