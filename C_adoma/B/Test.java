package C_adoma.B;

import C_adoma.B.lab7.Competition;
import C_adoma.B.lab7.PrivateCar;
import C_adoma.B.lab7.RaceCompetitor;
import C_adoma.B.lab7.SportCar;

public class Test {

    public static void main(String[] args) {
        RaceCompetitor[] competitors = new RaceCompetitor[2];
        competitors[0] = new PrivateCar("Mazda", "AAA");
        competitors[1] = new SportCar("Ferrari", "BBB");

        int winner = Competition.go(competitors);
        System.out.printf("\nAnd the winner is : %d",winner);
    }

}
