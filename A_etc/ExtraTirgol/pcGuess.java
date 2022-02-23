package A_etc.ExtraTirgol;

import java.util.Scanner;

public class pcGuess {
    public static void main(String[] args) {

        start();

        end(theGame());

    }

    public static Scanner sc = new Scanner(System.in);

    public static void start() {
        System.out.println("Choose a number between 1 - 31");
        int[] row1 = new int[16];
        int[] row2 = new int[16];
        int[] row3 = new int[16];
        int[] row4 = new int[16];
        int[] row5 = new int[16];
        print(makeArr(1, row1));
        print(makeArr(2, 3, row2));
        print(makeArr(4, 5, 6, 7, row3));
        print(makeArr(8, 9, 10, row4));
        print(makeArr(16, row1));
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%4d", arr[i]);
        }
        System.out.println("");
    }

    public static int[] makeArr(int a, int[] arr) {
        arr[0] = a;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = (a % 2 == 0) ? arr[i] + 1 : arr[i] + 2;
        }
        return arr;
    }

    public static int[] makeArr(int a, int b, int[] arr) {
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i < arr.length - 1; i += 2) {
            arr[i] = arr[i - 2] + 4;
            arr[i + 1] = arr[i - 1] + 4;

        }
        return arr;
    }

    public static int[] makeArr(int a, int b, int c, int d, int[] arr) {
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        for (int i = 4; i < arr.length - 3; i += 4) {
            arr[i] = arr[i - 4] + 8;
            arr[i + 1] = arr[i - 3] + 8;
            arr[i + 2] = arr[i - 2] + 8;
            arr[i + 3] = arr[i - 1] + 8;
        }
        return arr;
    }

    public static int[] makeArr(int a, int b, int c, int[] arr) {
        arr[0] = a;
        for (int i = 8; i < arr.length; i++) {
            arr[i - 7] = arr[i - 8] + 1;
            arr[i] = arr[i - 8] + 16;
            arr[8] = 24;

        }
        return arr;
    }

    public static int[] theGame() {
        System.out.println("Hello user tell me how many times u wee ur number:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("tell me in which lines do u see ur number ? ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println("ok them u saw him at row : " + arr[i]);
            if (i != arr.length - 1) {
                System.out.println("and ? ");
            }
        }
        return arr;
    }

    public static void end(int[] arr) {
        int theNum = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    theNum += 1;
                    break;
                case 2:
                    theNum += 2;
                    break;
                case 3:
                    theNum += 4;
                    break;
                case 4:
                    theNum += 8;
                    break;
                case 5:
                    theNum += 16;
                    break;
                default:
                    break;

            }
        }
        System.out.println("This is ur number ? \n"+theNum);
        sc.close();
    }
}
