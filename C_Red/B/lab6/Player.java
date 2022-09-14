package C_Red.B.lab6;

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
        return this.strength > 0;
    }
    protected int konkOut(){
        int tmp = this.strength;
        this.strength = 0;
        return tmp;
    }
}
