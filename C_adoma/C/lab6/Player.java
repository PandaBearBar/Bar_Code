package C_adoma.C.lab6;

abstract class Player {
    protected String name;
    protected int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
    protected boolean isAlive() {
        return strength>0;
    }
    protected int konkOut(){
        int last = this.strength;
        strength =0 ;
        return last;
    }
}
