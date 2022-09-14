package E_Purple.A.lab5;

import java.util.Arrays;
/*
        Ocean ocean = new Ocean();
        OceanReport.info(ocean);
 */

public class Ocean {
    private Fish [] fish;

    public Ocean() {
        this.fish = OceanFactory.init(ConstantFactory.rand(1, 101));
    }

    public Fish[] getFish() {
        return fish;
    }

    public void setFish(Fish[] fish) {
        this.fish = fish;
    }

    public int totalEntities(){
        return this.fish.length;
    }
    public int totalSharks(){
        int sofer =0;
        for (Fish shark: fish) if (shark.getSpeed() == 120)sofer++;
        return sofer;
    }
    public int totalWhale(){
        int sofer =0;
        for (Fish whale: fish) if (whale.getSpeed() == 90)sofer++;
        return sofer;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "fish=" + Arrays.toString(fish) +
                '}';
    }
    public void drawAll(){
        for (Fish all: fish) {
            if (all.speed ==120){
                ((Shark) all).draw();
            }else {
                ((Whale) all).draw();
            }
        }
    }
}
