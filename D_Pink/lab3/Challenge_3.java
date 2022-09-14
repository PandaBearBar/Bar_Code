package D_Pink.lab3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        int[] arr = {1, 54, 7, 2, 87, 3, 4, 2, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int sofer = 0;
        boolean isThere = false;
        for (int a: arr) {
            if (a == num){
                isThere = true;
                break;
            }
            sofer ++;
        }
        if ((isThere)) {
            System.out.println(num + " is in index : " + sofer);
        } else {
            System.out.println("Error 404 ");
        }

        sc.close();
    }
}
