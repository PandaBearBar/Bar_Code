package C_Red.C.lab5;

import java.util.Arrays;

public class Hotel {
    private final Room[] rooms;
    private final String name;
    private final int stars;

    public Hotel(Room[] rooms, String name, int stars) {
        this.rooms = rooms;
        this.name = name;
        this.stars = (stars > 0 && stars <= 5) ? stars : 1;
    }

    public boolean hasGuest(Guest guest) {
        for (Room r : rooms) {
            if (r.hasGuest(guest)) {
                return true ;
            }
        }
        return false;
    }

    public boolean book (Guest guest, String name){
        if (!hasGuest(guest)){
            for (int i = 0; i < rooms.length; i++) {
                if (name.equals(rooms[i].getName())){
                    return rooms[i].addGuest(guest);
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                '}';
    }
}
/*
import C_adoma.C.lab5.Guest;
import C_adoma.C.lab5.Hotel;
import C_adoma.C.lab5.Room;

Room[] rooms = new Room[3];

        rooms[0] = new Room(2,"Basic",250);
        rooms[1] = new Room(4,"Deluxe",780.66);
        rooms[2] = new Room(6,"Studio Luxury",1850.25);

        Hotel hotel = new Hotel(rooms,"Dan Eliat", 5);

        Guest[] guests = new Guest[4];

        guests[0] = new Guest("Nadav","303334700");
        guests[1] = new Guest("Omer","316524842");
        guests[2] = new Guest("Bar","318876851");
        guests[3] = new Guest("Haia","014350888");

        for (int i = 0; i < guests.length; i++) {
            if (hotel.book(guests[i],"Basic")){
                System.out.println("Welcome " + guests[i] + " to the basic room");
            }else if (hotel.book(guests[i],"Deluxe")){
                System.out.println("Welcome " + guests[i] + " to the deluxe room");
            }else if (hotel.book(guests[i],"Studio Luxury")){
                System.out.println("Welcome " + guests[i] + " to the studio luxury room");
            }else {
                System.out.println("we are sorry "+ guests[i] + " we are full");
            }
        }
        System.out.println(hotel);
 */