package D_Pink.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Challange_5 {
    public static void main(String[] args) {
        int[] arr1 = {25, 14, 56, 15, 35, 56, 77, 18, 29, 49};
        // {25, 14, 5, 56, 15, 35, 56, 77, 18, 29};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index num");
        int index = sc.nextInt();
        System.out.println("enter the num");
        int num = sc.nextInt();
        for (int i = arr1.length-1; i >= index; i--) {
            arr1[i] = arr1[i-1];
        }
        arr1[index] = num;
        System.out.println(Arrays.toString(arr1));
        System.out.println("25, 14, 56, 15, 35, 56, 77, 18, 29, 49");
        sc.close();
    }
}
