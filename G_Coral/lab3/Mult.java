package G_Coral.lab3;

public class Mult {
    public static int mult(int a, int b){
        if (b==1)return a;
        return a + mult(a, b-1);
    }
}
