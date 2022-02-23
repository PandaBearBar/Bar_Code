package C_adoma.B.lab7;

public class Competition {

    public static int go(RaceCompetitor[] competitors){
        int kav = 0;
        int winner = 0;
        int tmp = 0 ;
        for (RaceCompetitor competitor: competitors) {
            kav = competitor.getDistance();
            for (int i = 0; i < kav; i++) {
                System.out.printf("-");
            }
            System.out.println("");
            if (kav > tmp){
                tmp = kav;
                winner = competitor.getCompetition();
            }
        }
        return winner;
    }

}
