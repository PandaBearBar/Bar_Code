package C_Red.OopLab2JavaPolymorphismRaceCar;

public class Test {
    public static void main(String[] args) {
RaceCompetitor[] competitors = new RaceCompetitor[3];
competitors[0] = new PrivateCar("KIA","1354135646");
competitors[1] = new SportsCar("Mazda","68546352468");

int winner = Competition.go(competitors);
        System.out.println();
        System.out.println(String.format("and whe winner is: %d", winner));

    }
}
