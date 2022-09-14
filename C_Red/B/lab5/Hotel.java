package C_Red.B.lab5;


import java.util.Arrays;


public class Hotel {
    /*
        private Room[] rooms;
        private String name;
        private int stars;

        public Hotel(Room[] rooms, String name, int stars) {
            this.rooms = rooms;
            this.name = name;
            setStars(stars);
        }

        public void setStars(int stars) {
            if (stars < 1 || stars > 5) {
                System.out.println("Invalid stars rating");
                this.stars = 1;
            } else {
                this.stars = stars;
            }
        }

        public boolean hasGuest(Guest guest) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].hasGuest(guest)) {
                    return true;
                }
            }

            return false;
        }

        public boolean book(Guest guest, String roomName) {
            if (!hasGuest(guest)) {
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].getRoomName() == roomName) {
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

     */
    private Room[] rooms;
    private String name;
    private int stars;

    public Hotel(Room[] rooms, String name, int stars) {
        this.stars = (stars < 5 && stars > 0) ? stars : 1;
        this.name = name;
        this.rooms = rooms;
    }

    public boolean hasGuest(Guest guest) {
        for (int i = 0; i < this.rooms.length; i++) {
            if (rooms[i].hasGuest(guest)) return true;
        }
        return false;
    }

    public boolean book(Guest guest, String roomName) {
        if (!hasGuest(guest)) {
            for (int i = 0; i < this.rooms.length; i++) {
                if (rooms[i].getRoomName() == roomName) {
                    return this.rooms[i].addGuest(guest);
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
