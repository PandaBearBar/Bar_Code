package A_etc.ExtraTirgol;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        starter();
        theGame();
        ender();
    }

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();

    public static void starter() {
        System.out.println("Hello User lets play guess the number game :)\n so choose number between 1 - 16 ! ");
    }

    public static void ender() {
        System.out.println("Would you like to play again ?\n|Y / N|");
        char tzova = sc.next().toUpperCase().charAt(0);
        while (true) {
            while (tzova == 'Y') {
                starter();
                theGame();
                System.out.println("Would you like to play again ?\n|Y / N|");
                tzova = sc.next().toUpperCase().charAt(0);
            }
            if (tzova == 'N') {
                System.out.println("have a good day <3 ");
                sc.close();
                break;
            } else {
                System.out.println("U entered unvalidated answer try again : ");
                System.out.println("Would you like to play again ?\n|Y / N|");
                tzova = sc.next().toUpperCase().charAt(0);
            }
        }

    }

    public static void theGame() {
        int ran = r.nextInt(16) + 1;
        int nisyonot = 3;
        System.out.println(ran);
//        printArr(toBin(ran));
//        System.out.println("\n for developer");
        while (nisyonot > 0 && !winCon(firstThing(), ran)) {
            System.out.println("");
            printArr(toPassWord(toBin(ran), nisyonot));
            System.out.println("");
            System.out.println("YOU FAILED ME");
            nisyonot--;
            System.out.println("You got more " + nisyonot + " times");
        }
    }

    public static int firstThing() {
        System.out.println("pls enter a num");
        return sc.nextInt();
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);

        }
    }

    public static void printArr(String[] sarr) {
        for (int i = 0; i < sarr.length; i++) {
            System.out.printf("%3s", sarr[i]);

        }
    }

    public static String[] toPassWord(int[] arr, int timesThatLeft) {
        String[] sarr = new String[arr.length];
        for (int i = 0; i < sarr.length; i++) {
            if (timesThatLeft > 0) {
                timesThatLeft--;
                sarr[i] = "  *";
            } else {
                sarr[i] = "" + arr[i];
            }
        }

        return sarr;
    }

    public static int[] toBin(int number) {
        int index = number;
        int sofer = 0;
        while (index != 0) {
            sofer++;
            index /= 2;
        }
        if (sofer < 4) {
            sofer = 4;
        }
        int[] arr = new int[sofer];
        for (int i = 0; i < arr.length; i++) {
            if (Math.pow(2, arr.length - (i + 1)) <= number) {
                number -= Math.pow(2, arr.length - (i + 1));
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
        return arr;
    }

    public static boolean winCon(int num, int ran) {
        if (num == ran) {
            System.out.println("GOOD JOB U HAVE PLEASED ME !");
            return true;
        }
        return false;
    }
}
