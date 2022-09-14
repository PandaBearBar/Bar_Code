package E_Purple.A.lab5;

public class OceanFactory {
    public static Shark initShark(){
        return new Shark(ConstantFactory.rand(1000, 1501));
    }
    public static Whale initWhale(){
    return new Whale(ConstantFactory.rand(40, 131));
    }
    public static Fish initFish (){
        int rand = ConstantFactory.rand(1, 3);
        switch (rand){
            case 1:
                return initShark();
            case 2:
                return initWhale();
            default:
                return null;
        }
    }
    public static Fish[] init(int len){
        Fish [] fishes = new Fish[len];
        int sofer = 0;
        for (Fish uno: fishes) {
            fishes[sofer] = initFish();
            sofer++;
        }
        return fishes;
    }
}
