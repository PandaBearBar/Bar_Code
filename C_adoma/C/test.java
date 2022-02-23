package C_adoma.C;

import C_adoma.C.lab7.Competition;
import C_adoma.C.lab7.PrivateCar;
import C_adoma.C.lab7.RaceCompetitor;
import C_adoma.C.lab7.SportsCar;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        RaceCompetitor [] competitors = new RaceCompetitor[3];

        competitors[1] = new PrivateCar("Ronald", "AAA");
        competitors[0] = new SportsCar("Riki", "BBB");
        competitors[2] = new SportsCar("Roko", "CCC");

        int winner = Competition.go(competitors);
        System.out.println("And the winner is : " + winner);
    }
}
