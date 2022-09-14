package C_Red.B.lab6;

public class Criminal extends Player {

    public Criminal(String name, int strength) {
        super(name, strength);
    }
    public Criminal (Criminal criminal){
        this(criminal.name, criminal.strength);
    }
/* TESTS:
    public static void main(String[] args) {
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

        Criminal [] criminals1 = new Criminal[6];
        for (int i = 0; i < criminals1.length; i++) {
            criminals1[i]=new Criminal(criminals[i]);
        }
        Policeman [] policemen1 = new Policeman[3];
        for (int i = 0; i < policemen1.length; i++) {
            policemen1[i] = new Policeman(policemen[i]);
        }


        for (int i = 0; i < policemen.length; i++) {
            for (int j = 0; j < criminals.length; j++) {
                if (policemen[i].arrest(criminals[j])) {
                    System.out.println(policemen1[i] + " arrested " + criminals1[j]);
                }
            }
        }

        for (int i = 0; i < policemen.length; i++) {
            policemen[i].showArrestedCriminals();
        }
    }
 */
}
