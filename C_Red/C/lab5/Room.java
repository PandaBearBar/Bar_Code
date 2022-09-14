package C_Red.C.lab5;

import java.util.Arrays;

public class Room {
    private Guest[] guests;
    private final int maxGuests;
    private int numOfGuests = 0;
    private final String name;
    private double pricePerNight;

    public Room(int maxGuests, String name, double pricePerNight) {
        this.maxGuests = (maxGuests >= 0) ? maxGuests : 404;
        this.name = name;
        this.pricePerNight = (pricePerNight >= 0) ? pricePerNight : 404;
        guests = new Guest[maxGuests];
    }

    public Room(Room room) {
        this(room.maxGuests, room.name, room.pricePerNight);
    }

    private boolean isFull() {
        return numOfGuests == maxGuests;
    }

    private boolean isEmpty() {
        return numOfGuests == 0;
    }

    public boolean addGuest(Guest guest) {
        if (isFull()) return false;
        this.guests[numOfGuests] = guest;
        numOfGuests++;
        return true;
    }

    public boolean hasGuest(Guest guest) {
        for (Guest g : this.guests) {
            if (guest.equals(g)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "guests=" + Arrays.toString(guests) +
                ", maxGuests=" + maxGuests +
                ", numOfGuests=" + numOfGuests +
                ", name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
