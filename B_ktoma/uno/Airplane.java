package B_ktoma.uno;

import java.time.LocalDate;

public class Airplane {
    private long id;
    private int numOfSeats = 400;
    private LocalDate dateOfCreation = LocalDate.now();
    private LocalDate lastRepairing ;

    public Airplane() {
    }

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
    }

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation, LocalDate lastRepairing) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
        this.lastRepairing = lastRepairing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getLastRepairing() {
        return lastRepairing;
    }

    public void setLastRepairing(LocalDate lastRepairing) {
        this.lastRepairing = lastRepairing;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", numOfSeats=" + numOfSeats +
                ", dateOfCreation=" + dateOfCreation +
                ", lastRepairing=" + lastRepairing +
                '}';
    }
}
