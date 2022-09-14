package E_Purple.A.lab5;

public class OceanStatistics {
    public static int totalTeeth(Ocean ocean) {
        int total = 0;
        Fish[] fish = ocean.getFish();
        for (Fish f: fish) {
            if (f != null && f.getSpeed() == 120) {
                total += ((Shark) f).getNumOfTeeth();
            }
        }
        return (total>0)?total:1;
    }

    public static int totalMeters(Ocean ocean) {
        int total = 0;
        Fish[] fish = ocean.getFish();
        for (Fish f: fish) {
            if (f != null && f.getSpeed() == 90) {
                total += ((Whale) f).getLengthInMeters();
            }
        }
        return (total>0)?total:1;
    }

    public static String domFish(Ocean ocean) {
        return (ocean.totalSharks() > ocean.totalWhale()) ?
                "Sharks" :
                (ocean.totalWhale() > ocean.totalSharks()) ?
                        "Whales" : "Equuleus";
    }

    public static double avgTeeth(Ocean ocean) {
        return ((totalTeeth(ocean)) / (ocean.totalSharks()));
    }

    public static double avgLength(Ocean ocean) {
        return ((totalMeters(ocean)) / (ocean.totalWhale()));
    }
}
