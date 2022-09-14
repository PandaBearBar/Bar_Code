package C_Red.B.lab5;

import java.util.Arrays;

public class Room {
    private Guest[] guests;
    private int MaxGuests;
    private int numOfGuests;
    private String roomName;
    private double roomPrice;

    public Room(int MAX_GUESTS, String roomName, double roomPrice) {
        if (MAX_GUESTS > 0) this.MaxGuests = MAX_GUESTS;
        else System.out.println("Invalid Max Guest");
        this.roomName = roomName;
        if (roomPrice >= 0) this.roomPrice = roomPrice;
        else System.out.println("Invalid Price");
        this.guests = new Guest[this.MaxGuests];
    }

    public Room(Room room) {
        //this(room.MaxGuests, room.getRoomName(), room.roomPrice);
        this.MaxGuests = room.MaxGuests;
        this.roomPrice = room.roomPrice;
        this.roomName = room.roomName;
        this.numOfGuests = room.numOfGuests;
        this.guests = new Guest[room.numOfGuests];
    }

    public Guest[] getGuests() {
        return guests;
    }

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public int getMAX_GUESTS() {
        return MaxGuests;
    }

    public void setMAX_GUESTS(int MAX_GUESTS) {
        this.MaxGuests = MAX_GUESTS;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "guests=" + Arrays.toString(guests) +
                ", maxGuests=" + MaxGuests +
                ", numOfGuests=" + numOfGuests +
                ", name='" + roomName + '\'' +
                ", pricePerNight=" + roomPrice +
                '}';
    }


    private boolean isFull() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                return false;
            }
        }

        return true;
    }

    public boolean isEmpty() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean addGuest(Guest guest) {
        if (isFull()) {
            return false;
        }
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                guests[i] = guest;
                return true;
            }
        }

        return false;
    }

    public boolean hasGuest(Guest guest) {
        for (int i = 0; i < getGuests().length; i++) {
            if (guests[i] != null && this.guests[i].equals(guest)) {
                return true;
            }
        }
        return false;
    }
}
