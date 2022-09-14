package I_Lime.part1;

import java.util.Arrays;

public enum Name {
    MOSHE,
    DAVID,
    JACK,
    TAL,
    DANIEL;
    public static String getRandName(){
        return values()[(int) (Math.random() * Name.values().length)].name().toLowerCase();
    }
}
