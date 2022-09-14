package E_Purple.A.lab5;

public class OceanReport {
    public static void info(Ocean ocean){
        System.out.println("Total Teeth = " + OceanStatistics.totalTeeth(ocean));
        System.out.println("Total Meters = " + OceanStatistics.totalMeters(ocean));
        System.out.println("Domination of " + OceanStatistics.domFish(ocean) + " in this continent!");
        System.out.println("AVG of Teeth per Shark =" + OceanStatistics.avgTeeth(ocean));
        System.out.println("AVG of Meters per Whale =" + OceanStatistics.avgLength(ocean));
        System.out.println("Total Sharks = "+ ocean.totalSharks());
        System.out.println("Total Whales = "+ ocean.totalWhale());
        System.out.println("Total Entities = "+ ocean.totalEntities());
    }
}
