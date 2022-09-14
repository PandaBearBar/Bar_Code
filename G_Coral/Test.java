package G_Coral;

import G_Coral.lab1.Fact;
import G_Coral.lab2.Revesrse;
import G_Coral.lab3.Mult;

public class Test {
    public static void main(String[] args) {
        int a = Fact.fact(5);
        System.out.println(a);
        String b = Revesrse.reverseString("Moshe");
        System.out.println(b);
        int c = Mult.mult(3, 20);
        System.out.println(c);
    }
}
