package C_adoma.C.lab6;

public class Criminal extends Player{
    public Criminal(String name, int strength) {
        super(name, strength);
    }
    public Criminal(Criminal criminal){
        this(criminal.name, criminal.strength);
    }

    @Override
    public String toString() {
        return "Criminal{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                "} " + super.toString();
    }
}
