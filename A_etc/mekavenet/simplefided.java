
package A_etc.mekavenet;
import java.util.Random;
import java.util.Scanner;
public class simplefided {
    public static void For_loop(int a, int b, String word) {
        int chek = b > 0 ? 1 : 2;
        if (chek == 1) {
            for (int i = 1; i <= a; i = i + b) {
                System.out.printf("%s \n", word);
                System.out.println(a + " " + i);
            }
        } else {
            for (int i = 1; i <= a; a = a + b) {
                System.out.printf("%s \n", word);
                System.out.println(a + " " + i);
            }

        }
    }

    public static void While_loop(int a, int b, String word) {
        int check = b > 0 ? 1 : 2;
        int i = 0;
        switch (check) {
            case 1:
                while (i < a) {
                    i += b;
                    System.out.println(word + i + " " + a);
                }
                break;
            case 2:
                while (i < a) {
                    a += b;
                    System.out.println(word + i + " " + a);
                }
        }
    }


    public static void main(String[] args) {
        /*
        System.out.println("EX 1 _:");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("EX 2 _:");
        For_loop(10, 1, "Hello World");
        System.out.println("EX 3 _:");
        For_loop(10, -1, "Hello World");
        System.out.println("EX 4 _");
        While_loop(10, 1, "Holla World");
        System.out.println("EX 5 _");
        While_loop(10, -1, "Holla World");
        int i = 0;
        do {
            System.out.println("ello numuru :" + i);
            i++;
        } while (i != 10);{
        }
*/
        System.out.println("EX 7 :");
        Scanner I = new Scanner(System.in);
        System.out.println("pls enter a num :");
        int num = I.nextInt();
        for (int i = 0; i <= num; i+=2) {
                System.out.println(i);
        }
        System.out.println("EX 8 :");
        Random r = new Random();
        int a = r.nextInt(50)+51;
        int b = r.nextInt(50)+51;
        int e = r.nextInt(10)+1;
        int f = r.nextInt(100)+1;
        int c = a>=b? 1 : 2 ;
        int d = e>=f? 1 : 2 ;
        for (int j = 1; j <= a; j++) {
            System.out.println(j);

        }
        System.out.println("ex9");
        switch (c){
            case 1 :
                for (int l = b; l <= a; l++) {
                    System.out.println(l);
                }
                break;
            case 2 :
                for (int l = a; l <= b; l++) {
                    System.out.println(l);
                }
                break;
            default:
                break;
        }
        System.out.println("ex10");
        System.out.println(1);
        switch (d){
            case 1 :
                for (int l = f; l <= e; l+=f) {
                    System.out.println(l);
                }
                break;
            case 2 :
                for (int l = e; l <= f; l+=e) {
                    System.out.println(l);
                }
                break;
            default:
                break;
        }


    }
}
