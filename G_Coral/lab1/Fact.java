package G_Coral.lab1;

public class Fact {
    public static int fact(int num){
        if (num == 1) return 1;
        return num * fact(num -1);
    }
}
