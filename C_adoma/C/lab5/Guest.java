package C_adoma.C.lab5;

public class Guest {
    private final String name;
    private final String ID;

    public Guest(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Guest(Guest guest) {
        this(guest.name, guest.ID);
    }

    public String getID() {
        return ID;
    }

    public boolean equals(Guest other) {
        if (other == null) return false;
        return other.getID().equals(this.ID);
    }

    @Override
    public String toString() {
        return "Guest{" + name + '\'' + ID + '\'' + '}';
    }
}
