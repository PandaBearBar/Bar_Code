package H_Yellow.B.part1;

import H_Yellow.B.part1.Beans.MusicSupplier;
import H_Yellow.B.part1.Beans.Track;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        MusicSupplier musicSupplier = new MusicSupplier();
        System.out.println(musicSupplier);
        System.out.println("#####################################");
        Track track = musicSupplier.getTrackByName("Let it be");
        System.out.println(track);
        System.out.println("#####################################");
        List<Track> allBandTrack = musicSupplier.getAllBrandTracks("The Beatles");
        System.out.println(allBandTrack);
        System.out.println("#####################################");
        System.out.println(musicSupplier.getTotalLength("Queen"));
        List<Track> allTRaksBelowPrice = musicSupplier.getAllTracksBelowPrice(300);
        System.out.println("#####################################");
        System.out.println(allTRaksBelowPrice.toString());
        System.out.println("#####################################");
        System.out.println(musicSupplier);
    }
}

