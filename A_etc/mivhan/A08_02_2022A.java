// Bar Saadi Test :)
package A_etc.mivhan;

import java.util.Random;

public class A08_02_2022A {
    public static void main(String[] args) {
        start();
        mainCode();
        end();

    }

    public static Random r = new Random();

    public static void start() {
        System.out.println("Hello User (I know its u Kobi) Tnx for using my code :\n");
    }

    public static void mainCode() {

        int[] num1 = makeRandArr();
        int[] num2 = makeRandArr(); // sof seif 1 ;

        printIntArr(num1);
        printIntArr(num2); // sof seif 2 ;

        System.out.println("\n  " + makeMaxTriple(num1) + "\n");//sof seif 3 :

        int[] distinct = makeDisinct();
        int[] newNum1 = new int[15];
        checkTheNums(num1, num2, newNum1);
        int[] newNum2 = new int[15];
        checkTheNums(num2, num1, newNum2);
        toDistinct(distinct, newNum1, newNum2); //sof seif 4;

        printIntArr(distinct);//sof seif 5

        System.out.println("\n  " + makeNumOutOfThis(distinct));

    }

    public static int[] makeRandArr() {
        int[] iarr = new int[15];
        for (int i = 0; i < iarr.length; i++) {
            int ran = r.nextInt(10);
            iarr[i] = ran;
        }

        return iarr;
    }

    public static void printIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println("");
    }

    public static int makeMaxTriple(int[] arr) {
        int max = 0;
        int zmani = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i; j < i + 3; j++) {
                zmani = arr[j] + zmani * 10;
            }
            max = Math.max(zmani, max);
            zmani = 0;
        }


        return max;
    }

    public static int[] makeDisinct() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        return arr;
    }

    public static int[] toDistinct(int[] distinct, int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                distinct[index] = arr1[i];
                for (int j = 0; j < arr1.length; j++) {
                    if (distinct[index] == arr1[j]) {
                        arr1[j] = -1;
                    }
                }
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != -1) {
                distinct[index] = arr2[i];
                for (int j = 0; j < arr2.length; j++) {
                    if (distinct[index] == arr2[j]) {
                        arr2[j] = -1;
                    }
                }
                index++;
            }
        }
        return distinct;
    }

    public static int[] checkTheNums(int[] arr1, int[] arr2, int[] newNum) {
        for (int i = 0; i < arr1.length; i++) {
            newNum[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (newNum[i] == arr2[j] && arr1[i] != -1) {
                    newNum[i] = -1;
                }
            }
        }

        return newNum;
    }

    public static int makeNumOutOfThis(int[] arr) {
        int theNum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != -1) {
                theNum = theNum * 10 + arr[i];
            }

        }
        return theNum;
    }

    public static void end() {
        System.out.println("\nBye Bye User (I know its u Kobi) have a nice day :)");
    }
}
