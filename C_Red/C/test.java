package C_Red.C;

import C_Red.C.lab7.Competition;
import C_Red.C.lab7.PrivateCar;
import C_Red.C.lab7.RaceCompetitor;
import C_Red.C.lab7.SportsCar;

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
