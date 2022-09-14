package H_Yellow.A.lab1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MusicSupplier musicSupplier = new MusicSupplier();
        Track track = musicSupplier.getTrackByName("Let it be");
        List<Track> allBandTrack = musicSupplier.getAllBandTRacks("The Beatles");
        int length = musicSupplier.getTotalTracksLength("Queen");
        List<Track> allTRaksBelowPrice = musicSupplier.gerAllTracksBelowPrice(300);
        System.out.println(track);
        System.out.println(allBandTrack.toString());
        System.out.println(length);
        System.out.println(allTRaksBelowPrice.toString());
        System.out.println(musicSupplier);
    }
}
