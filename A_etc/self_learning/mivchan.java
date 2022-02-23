package A_etc.self_learning;

import java.util.Scanner;

public class mivchan {
    /* public static void main(String[] args) {
         int count = 0, avg = 0, sum = 0, num;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter num");
         num = sc.nextInt();
         while (num >= 0) {
             count++;
             sum += num;
             System.out.println("enter num");
             num = sc.nextInt();
         }
         if (count==0){
             System.out.println("your avg is 0");
         }else {
             avg = sum/count;
             System.out.println("your avg is " + avg );
         }
     }

     */
   /*public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count= 0;
      System.out.println("enter num");
      int num = sc.nextInt();
      for (int i = 1; i <= num/2 ; i++) {
         int bodek = num%i;
         if (bodek == 0){
            count ++;
         }
      }
      if(count==1){
         System.out.println("is reshoni");
      }else {
         System.out.println("isnt reshoni====");
      }
   }

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 num");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int zmani = 0;
        if (num1 > num2) {
            zmani = num1;
            num1 = num2;
            num2 = num1;
        }
        for (int i = num1; i <= num2; i++) {
            int boom = i;
            while (boom > 0) {
                if (boom % 10 == 7) {
                    break;
                }
                boom = boom / 10;
            }
            if (boom % 10 == 7 || i % 7 == 0) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }

        }
    }
}