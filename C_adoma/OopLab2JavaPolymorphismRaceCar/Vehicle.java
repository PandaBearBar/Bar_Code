package C_adoma.OopLab2JavaPolymorphismRaceCar;

public abstract class Vehicle implements RaceCompetitor {
    private final String manufacturerName;
    private final String frameNumber;

    public Vehicle(String manufacturerName, String frameNumber) {
        this.manufacturerName = manufacturerName;
        this.frameNumber = frameNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", frameNumber='" + frameNumber + '\'' +
                '}';
    }
}
