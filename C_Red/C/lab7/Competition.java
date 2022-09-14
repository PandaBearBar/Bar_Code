package C_Red.C.lab7;

public class Competition {
    public static int go(RaceCompetitor [] competitors){
        int winnerPlate =0;
        int winnerDistance =0;
        for (RaceCompetitor comp : competitors) {
            for (int i = 0; i < comp.getDistance(); i++) {
                System.out.printf("-");
            }
            System.out.println();
            if (comp.getDistance()>winnerDistance){
                winnerDistance= comp.getDistance();
                winnerPlate = comp.getCompetitionNumber();
            }
        }
        return winnerPlate;
    }
}
