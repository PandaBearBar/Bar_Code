package C_Red.B.lab5;

import java.util.Objects;

public class Guest {

    private String fullName;
    private String ID;

    public Guest(String fullName, String ID) {
        this.fullName = fullName;
        this.ID = ID;
    }

    public Guest(Guest guest) {
        this.fullName = guest.fullName;
        this.ID = guest.ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "fullName='" + fullName + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public boolean equals(Guest other) {
        return Objects.equals(this.ID, other.getID());
    }
}
