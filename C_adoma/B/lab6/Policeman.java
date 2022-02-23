package C_adoma.B.lab6;

import java.util.Arrays;

public class Policeman extends Player {
    private Criminal[] arrestedCriminal;
    private int totalArrested;
    private final int MAX_NUM_CRIMINAL = 3;

    public Policeman(String name, int strength) {
        super(name, strength);
        this.arrestedCriminal = new Criminal[MAX_NUM_CRIMINAL];
    }
    public Policeman(Policeman policeman){
        this(policeman.name, policeman.strength);
    }

    public boolean arrestedAll() {
        totalArrested = arrested();
        return totalArrested == MAX_NUM_CRIMINAL;
    }

    private int arrested() {
        int sofer = 0;
        for (Criminal criminal : this.arrestedCriminal) {
            if (criminal != null) sofer++;
        }
        return sofer;
    }

    public boolean arrest(Criminal criminal) {
        if (this.isAlive() && criminal.isAlive()) {
            if (!arrestedAll()) {
                int dmg = 0;
                if (this.strength > criminal.strength) {
                    dmg = criminal.konkOut();
                    this.strength -= dmg;
                    this.arrestedCriminal[arrested()] = criminal;
                    return true;
                }
                dmg = this.konkOut();
                criminal.strength -= dmg;
            }
        }
        return false;
    }

    public void showArrestedCriminals() {
        if (arrested() == 0) System.out.println("The policeman " + name + " didn't arrest any one....");
        else System.out.println("The policeman " + name + " arrested" + Arrays.toString(arrestedCriminal));
    }
}
