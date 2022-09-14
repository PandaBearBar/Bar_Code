package B_Orange.dus;

import java.time.LocalDate;

public class Airplane {
    private long id;
    private int numOfSeats = 400;
    private LocalDate dateOfCreation = LocalDate.now();
    private LocalDate lastReparing;
    public Airplane(){}

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
    }

    public Airplane(long id, int numOfSeats, LocalDate dateOfCreation, LocalDate lastReparing) {
        this.id = id;
        this.numOfSeats = numOfSeats;
        this.dateOfCreation = dateOfCreation;
        this.lastReparing = lastReparing;
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

    public LocalDate getLastReparing() {
        return lastReparing;
    }

    public void setLastReparing(LocalDate lastReparing) {
        this.lastReparing = lastReparing;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", numOfSeats=" + numOfSeats +
                ", dateOfCreation=" + dateOfCreation +
                ", lastReparing=" + lastReparing +
                '}';
    }
}
