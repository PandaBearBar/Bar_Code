package H_Yellow.A.lab1;

import java.util.ArrayList;
import java.util.List;

public class MusicSupplier {
    private ArrayList<Track> tracks = new ArrayList<>();

    private String [] Bands = {"Queen" , "The Beatles"};
    private double randPrices(int max, int min){
        return (Math.random()*(max - min) + min);
    }
    private int initRand (int max, int min){
        return (int) (Math.random()*(max - min) + min);
    }


    public MusicSupplier() {
        for (int i = 0; i < initRand(11,1); i++) {
            tracks.add(new Track("Name" , Bands[initRand(2, 0)],randPrices(1001, 1),initRand(601, 100) ));
        }

    }

    public MusicSupplier(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public Track getTrackByName(String name) {
        return new Track(name, Bands[initRand(2, 0)],randPrices(1001, 1),initRand(601, 100));
    }

    public List<Track> gerAllTracksBelowPrice(double price) {
        List<Track> list = new ArrayList<Track>();
        for (Track t: tracks) {
            if (t != null && t.getPrice() < price) {
                list.add(t);
            }
        }
        return list;
    }

    public List<Track> getAllBandTRacks(String bandName) {
        List<Track> list = new ArrayList<Track>();
        for (Track t: tracks) if (t != null && t.getBandName().equals(bandName)) list.add(t);
        return list;
    }

    public int getTotalTracksLength (String bandName){
        int sofer = 0;
        for (Track t : tracks)if (t != null && t.getBandName().equals(bandName))sofer +=t.getLengthSeconds();
        return sofer;
    }

    @Override
    public String toString() {
        return "MusicSupplier{" +
                "tracks=" + tracks +
                '}';
    }
}

