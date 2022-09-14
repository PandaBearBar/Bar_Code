package C_Red.OopLab2JavaPolymorphismRaceCar;

public class Competition {
    public static int go(RaceCompetitor[] competitors) {
        for (int i = 0; i <competitors[0].getDistance(); i++) {
            System.out.print("-");


            }
        System.out.println();
        for (int j = 0; j <competitors[1].getDistance(); j++) {
            System.out.print("-");
        }
        if (competitors[0].getDistance()>competitors[1].getDistance())
        return competitors[0].getCompetitionNumber();
        else return competitors[1].getCompetitionNumber();
    }
}

