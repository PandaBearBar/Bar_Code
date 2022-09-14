package I_Lime.part3;

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
