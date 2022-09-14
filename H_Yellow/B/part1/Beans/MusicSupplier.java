package H_Yellow.B.part1.Beans;

import H_Yellow.B.part1.Utils.FactoryUtils;

import java.util.ArrayList;
import java.util.List;

public class MusicSupplier {
    private ArrayList<Track> tracks = new ArrayList<>();

    public MusicSupplier(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public MusicSupplier() {
        for (int i = 0; i < FactoryUtils.initDigit(11, 6); i++) {
            tracks.add(FactoryUtils.initTrack());
        }
    }

    public Track getTrackByName(String name) {
        for (Track t: tracks) {
            if (t.getName().equals(name)) return t;
        }
        return null;
    }

    public List<Track> getAllTracksBelowPrice(double price) {
        List<Track> underPrice = new ArrayList<>();
        for (Track t: tracks) {
            if (t.getPrice() < price) underPrice.add(t);
        }
        return underPrice;
    }

    public List<Track> getAllBrandTracks(String bandName) {
        List<Track> byBand = new ArrayList<>();
        for (Track t: tracks) {
            if (t.getBandName().equals(bandName)) byBand.add(t);
        }
        return byBand;
    }

    public int getTotalLength(String bandName) {
        int length = 0;
        for (Track t: getAllBrandTracks(bandName)) {
            length += t.getLengthSeconds();
        }
        return length;
    }

    @Override
    public String toString() {
        return "MusicSupplier{" +
                "tracks=" + tracks +
                '}';
    }
}
