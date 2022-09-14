package F_Blue.part1;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Log {
    private int id;
    private String description;
    private double amount;
    private final Timestamp timestamp;

    public Log(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
