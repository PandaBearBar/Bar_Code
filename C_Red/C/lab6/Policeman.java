package C_Red.C.lab6;

public class Policeman extends Player {
    private Criminal[] criminals;
    private int totalArrested = 0;
    private static final int MAX_NUM_CRIMINALS = 3;

    public Policeman(String name, int strength) {
        super(name, strength);
        this.criminals = new Criminal[MAX_NUM_CRIMINALS];
    }

    public boolean arrestedAll() {
        return totalArrested == MAX_NUM_CRIMINALS;
    }

    public boolean arrest(Criminal criminal) {
        Criminal copy = new Criminal(criminal);
        if (this.isAlive() && criminal.isAlive()) {
            if (!arrestedAll()) {
                if (this.strength > criminal.strength) {
                    criminals[totalArrested] = copy;
                    totalArrested++;
                    this.strength -= criminal.konkOut();
                    return true;
                } else {
                    criminal.strength -= this.konkOut();
                }
            }
        }
        return false;
    }

    public void showArrestedCriminals() {
        if (totalArrested == 0) System.out.println("HAve not arrested any one");
        else {
            for (Criminal criminal : criminals) {
                if (criminal != null) {
                    System.out.println(criminal);
                }
            }
        }
    }
}
/*


import C_adoma.C.lab6.Criminal;
import C_adoma.C.lab6.Policeman;


Criminal[] criminals = new Criminal[6];
        criminals[0] = new Criminal("Demian", 4);
        criminals[1] = new Criminal("Bella", 5);
        criminals[2] = new Criminal("Griselda", 5);
        criminals[3] = new Criminal("Spike", 6);
        criminals[4] = new Criminal("Lucifer", 8);
        criminals[5] = new Criminal("Baruch", 29);

        Policeman[] policemen = new Policeman[3];

        policemen[0] = new Policeman("David", 15);
        policemen[1] = new Policeman("James", 19);
        policemen[2] = new Policeman("Jax", 50);

        for (int i = 0; i < policemen.length; i++) {
            for (int j = 0; j < criminals.length; j++) {
                if (policemen[i].arrest(criminals[j])) {
                    System.out.println(policemen[i] + " arrested " + criminals[j]);
                }
            }
        }

        for (int i = 0; i < policemen.length; i++) {
            policemen[i].showArrestedCriminals();
        }
 */