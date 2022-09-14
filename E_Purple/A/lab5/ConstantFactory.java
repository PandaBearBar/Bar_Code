package E_Purple.A.lab5;

public class ConstantFactory {
    public static int rand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    private static int checkStat(int stat){
        if (stat>=50&&stat<=100)return 1;
        else if (stat>=30)return 2;
        else if (stat>=15)return 3;
        else if (stat>=1)return 4;
        else return 5;
    }

    public static String color() {
        int stat = rand(1, 101);
        switch (checkStat(stat)){
            case 1:
                return "Yellow";
            case 2:
                return "Gray";
            case 3 :
                return"Dark Gray";
            case 4 :
                return "Dark Blue";
            default:
                return "error";

        }
    }
}
