package A_etc.mekavenet;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class all_in_one {
    public static void main(String[] args) {
        afoh();
    }

    public static Scanner sc = new Scanner(System.in);

    // all those are a spageti code line ::::::
    public static void perek9ex1_5_6_10() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("pls enter ur name, last name and ur city :) ");
        String name = sc.next();
        String maspaha = sc.next();
        String city = sc.next();
        System.out.println("pls enter ur age ");
        float age = sc.nextFloat();
        System.out.printf("Hello %s %s from %s and you are %.1f years old\n", name, maspaha, city, age);
        boolean isHoki = age >= 18;
        if (isHoki) {
            System.out.println("WOW lets drink ur hoki");
        } else {
            System.out.println("lets go drink when ur hoki");
        }
        if (name.startsWith("M")) {
            System.out.println("u start with M ");
        } else if (name.startsWith("m")) {
            System.out.println("u start with m");
        }
        sc.close();
    } // no need for v2

    public static void perek9ex2_3_4_7_8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nums");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float sum = (num1 + num2 + num3);
        float avg = (sum) / 3;
        float max = Math.max(num1, Math.max(num2, num3));
        float min = Math.min(num1, Math.min(num2, num3));
        boolean isZugi1 = num1 % 2 == 0;
        boolean isZugi2 = num2 % 2 == 0;
        boolean isZugi3 = num3 % 2 == 0;
        System.out.printf("the sum is %d \nthe avg is %.2f \nthe max number is %.2f \nthe min number is %.2f\n num1 is zugi %b\n num2 is zugi %b\n num3 is zugi %b", (int) sum, avg, max, min, isZugi1, isZugi2, isZugi3);
        sc.close();
    }

    public static void p9exfromupV2() {
        float[] nums = new float[3];
        boolean[] IsZugi = new boolean[3];
        float[] paramterim = new float[3];
        paramterim[2] = 100;
        Makearr(nums, paramterim, IsZugi);
        System.out.println("ur number are : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f is Zugi : %b", nums[i], IsZugi[i]);
            System.out.println(" ");
        }
        System.out.println(paramterim[0] + " is the sum " + paramterim[0] / 3 + " is the avg");
        System.out.println(paramterim[1] + " is the max");
        System.out.println(paramterim[2] + " is the min");


    }// alenbi 56 mol a shoarama

    public static void Makearr(float[] nums, float[] paramterim, boolean[] IsZugi) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter a num : ");
            nums[i] = sc.nextInt();
            IsZugi[i] = nums[i] % 2 == 0;
            paramterim[0] += nums[i];
            paramterim[1] = Math.max(nums[i], paramterim[1]);
            paramterim[2] = Math.min(nums[i], paramterim[2]);
        }
    }

    public static void perek9ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to continue ?\n #_#Y__/N__#_# ");
        char check = sc.next().toUpperCase().charAt(0);
        boolean isY = check == 'Y';
        boolean isN = check == 'N';
        boolean isnt = check != 'Y' && check != 'N';
        if (isY) {
            System.out.println("Yay!");
        } else if (isN) {
            System.out.println("Nay");
        }
        while (isnt) {
            System.out.println("Lets try again ....");
            System.out.println("Would you like to continue ?\n #_#Y__/N__#_# ");
            check = sc.next().toUpperCase().charAt(0);
            isY = check == 'Y';
            isN = check == 'N';
            isnt = check != 'Y' && check != 'N';
        }
        if (isY) {
            System.out.println("Yay!");
        } else if (isN) {
            System.out.println("Nay");
        }
    }

    public static void perek10ex1_2_4() {

        Random r = new Random();
        int num1 = r.nextInt(101) + 1;
        int num2 = r.nextInt(101) + 1;
        int num3 = r.nextInt(101) + 1;
        System.out.printf("First number : %d\nSecond number : %d\nThird number is : %d\n", num1, num2, num3);
        if (num1 > 50) {
            System.out.println("The first number is bigger them 50");
        }
        if (num1 < 50) {
            System.out.println("The first number is smaller them 50");
        }
        if (num1 == 50) {
            System.out.println("The first number is 50");
        }
        if (num2 > 50) {
            System.out.println("The second number is bigger then 50");
        } else if (num2 < 50) {
            System.out.println("The second number is smaller then 50");
        } else if (num2 == 50) {
            System.out.println("The second number is 50");
        }
        int Max = 0, Min = 0, Middle = 0;
        Max = Math.max(num1, Math.max(num2, num3));
        Min = Math.min(num1, Math.min(num2, num3));
        Middle = num1 + num2 + num3 - Max - Min;
        System.out.printf("The biggest number is %d\nThe smallest number is %d\nThe middle number %d", Max, Min, Middle);
    }

    public static void perek10ex3() {
        Random r = new Random();
        float sal = r.nextInt(1000) + 5001;
        System.out.println(sal + " is your starter sallary\n");
        if (sal < 6000) {
            sal *= 1.1;
        } else {
            sal *= 1.05;
        }
        System.out.printf("Your salry has been got rase to %.2f", sal);
    }

    public static void perek10ex5_6() {
        Random r = new Random();
        int sal = r.nextInt(120_001);
        double tax = 0, neto = 0;
        int[] arr = {23_000, 50_000, 100_000};
        if (sal < arr[0]) {
            tax = sal * 0.1;
            neto = sal - tax;
        } else if (sal > arr[0] && sal < arr[1]) {
            tax = 2_300 + (sal - arr[0]) * 0.2;
            neto = sal - tax;
        } else if (sal > arr[1] && sal < arr[2]) {
            tax = 2_300 + 5_400 + (sal - arr[1]) * 0.3;
            neto = sal - tax;
        } else if (sal > arr[2]) {
            tax = 2_300 + 5_400 + 7_500 + (sal - arr[2]) * 0.4;
            neto = sal - tax;
        }
        System.out.printf("Your neto is %.2f\nYoyr tax is %.2f", neto, tax);
    }

    public static void perek10ex7_8_9() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter an year and a number of a month : ");
        int Year = sc.nextInt();
        int Month = sc.nextInt();
        boolean IsLeapYear = Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0;
        if (IsLeapYear) {
            System.out.printf("The year %d is a leap year !\n", Year);
        }
        switch (Month) {
            case 12:
            case 1:
            case 2:
                System.out.println("This month is in the winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This month is in the fall");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This month is in the summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This month is in the spring");
                break;
            default:
                break;
        }
        switch (Month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There is 31 days at this month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days at this month");
                break;
            case 2:
                if (IsLeapYear) {
                    System.out.println("this month have 28 day at this year");
                } else {
                    System.out.println("This month have 29 days this year");
                }
                break;
            default:
                break;
        }
        sc.close();
    }

    public static void perek10ex10() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello enter your age : ");
        float age = sc.nextFloat();
        boolean Is21 = age >= 21;
        if (Is21) {
            System.out.println("Yow u can Enter !");
        } else {
            System.out.println("Mep mep u cant Enter ! ");
        }
        sc.close();
    }

    public static void perek12ex1_2_3_4_5_6() {
        System.out.println("-----ex1-----");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("-----ex2-----");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println("-----ex3-----");
        for (int i = 10; i > 0; i--) {
            System.out.println("Hello World");
        }
        System.out.println("-----ex4-----");
        int i = 0;
        while (i < 10) {
            System.out.println("Hello World");
            i++;
        }
        System.out.println("-----ex5-----");
        while (i > 0) {
            System.out.println("Hello World");
            i--;
        }
        System.out.println("-----ex6-----");
        do {
            System.out.println("Hello World");
            i++;

        } while (i < 10);
    }

    public static void perek12ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls ennter ur num:");
        int a = sc.nextInt();
        for (int i = 0; i < a; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void perek12ex8_9_10() {

        int max = (int) (Math.random() * 50) + 51;
        int den = (int) (Math.random() * 50) + 51;
        if (den > max) {
            int tmp = den;
            den = max;
            max = tmp;
        }
        System.out.println("-----ex8-----");
        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----ex9-----");
        for (int j = den; j <= max; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n-----ex10-----");
        System.out.print(1 + " ");
        for (int q = den; q <= max; q += den) {
            System.out.print(q + " ");
        }
    }

    public static void perek12ex11_12_13_14() {
        Random r = new Random();
        int num = r.nextInt(6) + 1;
        int azeret = 1;
        for (int i = 1; i <= num; i++) {
            azeret *= i;
        }
        System.out.println(azeret);
        azeret = 1;
        for (int i = num; i > 0; i--) {
            azeret *= i;
        }
        System.out.println(azeret);
        azeret = 1;
        int i = 1;
        while (i <= num) {
            azeret *= i;
            i++;
        }
        System.out.println(azeret);
        azeret = 1;
        i = num;
        while (i > 0) {
            azeret *= i;
            i--;
        }
        System.out.println(azeret);
    }

    public static void perek12ex15_16_17_18_19_20() {
        Random r = new Random();
        int num = r.nextInt(10_001);
        int sofer = 0, meaphes = num, zmani = 0, doper = 0, moper = 0;
        for (int i = 0; i < meaphes; meaphes /= 10) {
            sofer++;
        }
        meaphes = num;
        System.out.println(num + " =======> " + sofer);
        System.out.println(num + " =======> " + num % 10);
        for (int i = 0; i < meaphes; meaphes /= 10) {
            zmani = meaphes;
        }
        System.out.println(num + " =======> " + zmani);
        zmani = 0;
        meaphes = num;
        for (int i = 0; i < meaphes; meaphes /= 10) {
            zmani = meaphes % 10 + zmani * 10;
        }
        meaphes = num;
        System.out.println(num + " =======> " + zmani);
        zmani = 0;
        for (int i = 0; i < meaphes; meaphes /= 10) {
            zmani = meaphes % 10 + zmani * 10;
        }
        if (zmani == num) {
            System.out.println("the numer is palindrome");
        } else {
            System.out.println("the number isn't palindrome");
        }
        meaphes = num;
        sofer = zmani = 0;
        for (int i = 0; i < meaphes; meaphes /= 10) {
            sofer++;
            zmani = meaphes % 10 + zmani * 10;
            doper += meaphes % 10;
            moper = meaphes;
        }
        System.out.printf("left : %d\nright : %d\nsum : %d\nsofer : %d\n", moper, num % 10, doper, sofer);
        if (zmani == num) {
            System.out.println("the numer is palindrome");
        } else {
            System.out.println("the number isn't palindrome");
        }

    }

    public static void perek12ex21_22_23_24_25_26_27_28_29() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a1 = 1, a2 = 1;
        for (int i = 2; i <= 30; i += 2) {
            System.out.print(a1 + "  " + a2 + "  ");
            a1 = a1 + a2;
            a2 = a1 + a2;
        }
        System.out.println("\n-----ex21");
        System.out.println("pls enter an index :");
        int index = sc.nextInt();
        a1 = a2 = 1;
        for (int i = 2; i <= index - 1; i += 2) {
            a1 += a2;
            a2 += a1;
        }
        if (index % 2 == 0) {
            System.out.println(a2);
        } else {
            System.out.println(a1);
        }
        System.out.println("-----ex22");
        int random = r.nextInt(31) + 10;
        System.out.println(random);
        a1 = a2 = 1;
        while (random > a1 && random > a2) {
            System.out.print(a1 + " " + a2 + " ");
            a1 += a2;
            a2 += a1;
        }
        System.out.println("\n-----ex23");
        a1 = a2 = 1;
        while (random > a1 && random > a2) {
            boolean IsEvena1 = a1 % 2 == 0;
            boolean IsEvena2 = a2 % 2 == 0;
            if (IsEvena1) {
                System.out.print(a1 + " ");
            }
            if (IsEvena2) {
                System.out.print(a2 + " ");
            }
            a1 += a2;
            a2 += a1;
        }
        System.out.println("\n-----ex24");
        a1 = a2 = 1;
        while (random > a1 && random > a2) {
            boolean IsOdda1 = a1 % 2 != 0;
            boolean IsOdda2 = a2 % 2 != 0;
            if (IsOdda1) {
                System.out.print(a1 + " ");
            }
            if (IsOdda2) {
                System.out.print(a2 + " ");
            }
            a1 += a2;
            a2 += a1;
        }
        System.out.println("\n-----ex25");
        a1 = a2 = 1;
        int sum = 0;
        while (random > a1 && random > a2) {
            sum += a1 + a2;
            a1 += a2;
            a2 += a1;
        }
        System.out.println(sum);
        System.out.println("-----ex26");
        a1 = a2 = 1;
        sum = 0;
        int soferon = 0;
        while (random > a1 && random > a2) {
            soferon += 2;
            sum += a1 + a2;
            a1 += a2;
            a2 += a1;
        }
        System.out.println((double) sum / soferon);
        System.out.println("-----ex27");
        int a = r.nextInt(96) + 5;
        int b = r.nextInt(96) + 5;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        a1 = a2 = 1;
        System.out.println(min + " " + max + "");
        while (max > a2 || max > a1) {
            if (min < a1 && a1 < max) {
                System.out.print(a1 + " ");
            }
            if (min < a2 && a2 < max) {
                System.out.print(a2 + " ");
            }
            a1 += a2;
            a2 += a1;
        }
        System.out.println("\n-----ex28");
        a1 = a2 = 1;
        int even = 0;
        min = 5;
        System.out.println(min + " " + max + "");
        while (max > a2 || max > a1) {
            int aa = min < a1 && max > a1 ? 1 : 0;
            int bb = min < a2 && max > a2 ? 3 : 2;
            switch (aa) {
                case 1:
                    System.out.print(a1 + " ");
                    if (a1 % 2 == 0) {
                        even = Math.max(even, a1);
                    }
                    break;
                case 0:
                default:
                    break;
            }
            switch (bb) {
                case 3:
                    System.out.print(a2 + " ");
                    if (a2 % 2 == 0) {
                        even = Math.max(even, a2);
                    }
                    break;
                case 2:
                default:
                    break;
            }
            a1 += a2;
            a2 += a1;
        }
        System.out.println("\nis the biggest even number = " + even);
        System.out.println("-----ex29");
        sc.close();

    }

    public static void perek12ex30() {

        Random r = new Random();
        int starter = r.nextInt(101) + 100;
        for (int i = 1; i < starter; i++) {
            int demo = i;
            while (demo > 9 && i % 10 != 7) {
                if (demo % 7 == 0) {
                    break;
                }
                demo /= 10;
            }
            if (i % 10 == 7 || demo % 7 == 0) {
                System.out.print("Boom! ");
            } else {
                System.out.print(i + " ");
            }


        }

    }

    public static void perek12ex31_32_33_34_35_36() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int kelet = sc.nextInt();
        int sum = 0, count = 0;
        while (kelet >= 0) {
            sum += kelet;
            System.out.println("enter number");
            kelet = sc.nextInt();
        }
        System.out.println(sum + " is the sum of the numbers u entered ----ex21----");
        System.out.println("enter number");
        kelet = sc.nextInt();
        sum = 0;
        while (kelet >= 0) {
            sum += kelet;
            count++;
            System.out.println("enter number");
            kelet = sc.nextInt();
        }
        if (count > 0) {
            count = sum / count;
        } else {
            count = sum / 1;
        }
        System.out.println(count + " is the avg of the numbers u entered ----ex22----");

        System.out.println("enter number");
        kelet = sc.nextInt();
        sum = 1;
        while (kelet > 0) {
            for (int i = 1; i <= kelet; i++) {
                sum *= i;
            }
            System.out.println("the azeret of ur number is :" + sum);
            sum = 1;
            System.out.println("enter number");
            kelet = sc.nextInt();
        }
        System.out.println("------ex23-------");
        System.out.println("enter number");
        kelet = sc.nextInt();
        sum = 0;
        while (kelet > 0) {
            for (int i = 1; i <= (int) Math.sqrt(kelet); i++) {
                if (kelet % i == 0) {
                    sum++;
                }
            }
            if (sum == 1) {
                System.out.println(kelet + " is resoni");
            } else {
                System.out.println(kelet + " is not resoni");
            }
            sum = 0;
            System.out.println("enter number");
            kelet = sc.nextInt();
        }
        System.out.println("------ex24------");
        System.out.println("enter a num");
        kelet = sc.nextInt();
        int max = 0;
        while (kelet != -999) {
            max = Math.max(max, kelet);
            System.out.println("enter a num if u want to enter -999");
            kelet = sc.nextInt();
        }
        System.out.println(max + " is the biigest number of ur inputs");
        System.out.println("------ex25------");
        System.out.println("enter a num");
        kelet = sc.nextInt();
        int min = kelet;
        while (kelet != -999) {
            min = Math.min(min, kelet);
            System.out.println("enter a num if u want to enter -999");
            kelet = sc.nextInt();
        }
        System.out.println(min + " is the samallest number of ur inputs");
        System.out.println("------ex 26-------");
        sc.close();
    }

    public static void perek12ex37_38_39() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            num--;
            System.out.println("\n");
        }
        System.out.println("enter rows and colones ");
        int raw = sc.nextInt();
        int colones = sc.nextInt();
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < colones; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        sc.close();
    }

    public static void perek12ex40() {
        int azerek = 1;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " azeret is :");
                for (int j = 1; j <= i; j++) {
                    azerek *= j;
                }
                System.out.println(azerek);
                azerek = 1;
            }

        }

    }

    public static void perek14ex1() {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c'};
        int sofera = 0, soferca = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean IsA = arr[i] == 'a';
            boolean IsC = arr[i] == 'c';
            if (IsA) {
                sofera++;
            }
            if (IsA || IsC) {
                soferca++;
            }
        }
        System.out.printf("a have been found %d times\na or c have been found %d times", sofera, soferca);
    }

    public static void perek14ex2_3() {
        String name1 = "John Bryce";
        String name2 = "Sara Shara Shir Cameach";
        char[] aeiou = {'a', 'e', 'o', 'i', 'u'};
        char[] n1 = name1.toLowerCase().toCharArray();
        char[] n2 = name2.toLowerCase().toCharArray();
        int sofer = 0;
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < aeiou.length; j++) {
                boolean IsCheck = aeiou[j] == n1[i];
                if (IsCheck) {
                    sofer++;
                }
            }
        }
        System.out.printf("The String %s have %d times of the aeiou lerrers", name1, sofer);
        sofer = 0;
        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < aeiou.length; j++) {
                boolean IsCheck = aeiou[j] == n2[i];
                if (IsCheck) {
                    sofer++;
                }
            }
        }
        System.out.printf("\nThe String %s have %d times of the aeiou lerrers", name2, sofer);
    }

    public static void perek14ex4() {
        int[] arr = {1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9};
        int sofer1 = 0, sofer3 = 0, sofer2or5 = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean Is1 = arr[i] == 1;
            boolean Is3 = arr[i] == 3;
            boolean Is2or5 = arr[i] == 2 || arr[i] == 5;
            if (Is1) {
                sofer1++;
            } else if (Is3) {
                sofer3++;
            } else if (Is2or5) {
                sofer2or5++;
            }
        }
        System.out.printf("One is %d times\nThree is %d times\nTwo or Five is %d times", sofer1, sofer3, sofer2or5);
    }

    public static void perek14ex5_6_7_8_9() {

        int[] arr = new int[10];
        int max = 0, min = 100, avg = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 80) + 10;
            System.out.print(arr[i] + " ");
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.printf("\nthe max number is %d\nthe min number is %d\nthe sum is %d\nthe avg is %d", max, min, sum, avg);
    }

    public static void perek14ex10() {

        int[] arr = new int[100];
        int max = 0, min = 100, avg = 0, sum = 0, sumz = 0, sumi = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arr[i] + " ");
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            sum += arr[i];
            if (arr[i] % 2 == 0) {
                sumz += arr[i];
            } else {
                sumi += arr[i];
            }
        }
        avg = sum / arr.length;
        System.out.printf("\nthe max number is %d\nthe min number is %d\nthe sum is %d\nthe avg is %d\nthe sum of the zugi is %d\nthe sum of izugi is %d", max, min, sum, avg, sumz, sumi);
    }

    public static void perek14ex11_16() {

        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            arr[i] = random;
            System.out.println(arr[i]);
        }
        System.out.println("ex11");
        System.out.print("{");
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            arr[i] = random;
            System.out.print("|" + arr[i] + "|");
        }
        System.out.print("}");
        System.out.println("\nex12");
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            if (random % 2 == 0) {
                arr[i] = random;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nex13");
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            if (random % 2 != 0) {
                arr[i] = random;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nex14");
        int evensum = 0;
        int sofer = 0;
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            if (random % 2 == 0) {
                arr[i] = random;
                evensum += random;
                sofer++;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.printf("\nthe sum is %d\nthe avg is %.2f", evensum, (double) evensum / sofer);
        System.out.println("\nex15");
        int oddsum = 0;
        sofer = 0;
        for (int i = 0; i < 10; i++) {
            int random = r.nextInt(101);
            if (random % 2 != 0) {
                arr[i] = random;
                oddsum += random;
                sofer++;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.printf("\nthe sum is %d\nthe avg is %.2f", oddsum, (double) oddsum / sofer);
        System.out.println("\nex16");


    }

    public static void perek14ex17() {
        int[] arr = new int[50];
        int max = 0, min = 100;
        int zoher1 = 0, zoher2 = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(101);
            arr[i] = ran;
            System.out.print(arr[i] + " ");
            if (max < arr[i]) {
                max = arr[i];
                zoher1 = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                zoher2 = i;
            }
        }
        System.out.printf("\nThe biggest num is %d and he at %d in this array\nThe smallest num is %d and he at %d in this array", max, zoher1 + 1, min, zoher2 + 1);
    }

    public static void perek14ex18_19() {
        int[] arr = new int[15];
        arr[0] = arr[1] = 1;
        int evens = 0, odds = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            int bodek = arr[i] % 2 == 0 ? 0 : 1;
            switch (bodek) {
                case 0:
                    evens += arr[i];
                    break;
                case 1:
                    odds += arr[i];
                    break;
                default:
                    break;
            }

        }
        System.out.println("}");
        System.out.printf("The sum of the even is : %d\nThe sum of the odds is : %d\nThe bigger sum is : %d", evens, odds, Math.max(evens, odds));
    }

    public static void perek14ex20() {
        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(9) + 1;
            while (ran % 2 != 0) {
                ran = r.nextInt(9) + 1;
            }
            arr[i] = ran;
            System.out.printf(" %d ", arr[i]);
        }
    }

    public static void perek14ex21_25() {
        int[] arr1 = {3, 2, 7, 6, 4, 2, 1, 7, 9, 4};
        int[] arr2 = {8, 2, 9, 8, 4, 2, 1, 4, 9, 1};
        int[] arr3 = new int[10];
        int lasindex = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean IsNotThere = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    IsNotThere = false;
                    break;
                }
            }
            if (IsNotThere) {
                arr3[lasindex] = arr1[i];
                lasindex++;
            } else {
                arr3[i] = 0;
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] == arr3[j]) {
                    arr3[j] = 0;
                }
            }
            System.out.printf("%d ", arr3[i]);
        }
        System.out.println("\n ex 21 + 22 ");
        int[] arr4 = new int[10];
        lasindex = 0;
        for (int i = 0; i < arr2.length; i++) {
            boolean IsnThere = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    IsnThere = false;
                    break;
                }
            }
            if (IsnThere) {
                arr4[lasindex] = arr2[i];
                lasindex++;
            } else {
                arr4[i] = 0;
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.printf("%d ", arr4[i]);
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[i] == arr4[j]) {
                    arr4[j] = 0;
                }
            }

        }
        System.out.println("");
        for (int i = 0; i < arr4.length; i++) {
            System.out.printf("%d ", arr4[i]);
        }
        System.out.println("\n ex 23 + 24 ");
        int shikindex = 0;
        int[] Larr = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            boolean IsntThere = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    IsntThere = false;
                    break;
                }
            }
            if (IsntThere) {
                Larr[shikindex] = arr1[i];
                shikindex++;
            } else {
                Larr[i] = 0;
            }

        } // spacial individuals of arr1 with doubles;
        for (int i = 0; i < arr2.length; i++) {
            boolean IsntThere = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    IsntThere = false;
                    break;
                }
            }
            if (IsntThere) {
                Larr[shikindex] = arr2[i];
                shikindex++;
            }
        } // adding the spacial indv if arr2 with doubles;
        int index = 0;
        for (int i = 0; i < Larr.length; i++) {
            for (int j = i + 1; j < Larr.length; j++) {
                if (Larr[i] == Larr[j]) {
                    Larr[j] = 0;
                    break;
                }
            }
            if (Larr[i] != 0) {
                Larr[index] = Larr[i];
                index++;
            } else {
                Larr[index] = 0;
            }
            System.out.printf("%d ", Larr[i]);
        }
        System.out.println("");
        for (int i = 0; i < Larr.length; i++) {
            System.out.printf("%d ", Larr[i]);
        }
    }

    public static void perek14ex26_28() {
        int[] stat = {1, 2, 5, 1, 6, 1, 5, 4, 8};
        int index = 0;
        int[] res1 = new int[stat.length];
        for (int i = 0; i < stat.length; i++) {
            boolean IsDigit = true;
            for (int j = i + 1; j < stat.length; j++) {
                if (stat[i] == 0) {
                    IsDigit = false;
                    break;
                }// check if this is a digit;
                if (stat[i] == stat[j]) {
                    stat[j] = 0;
                }
            }
            if (IsDigit) {
                res1[index] = stat[i];
                index++;
            }
        }
        int[] nres = new int[index];
        for (int s = 0; s < nres.length; s++) {
            nres[s] = res1[s];
            System.out.printf("%d ", nres[s]);
        }
        System.out.println("\n****ex26*****");
        int[] arr = {6, 8, 4, 2, 7, 5};
        int[] res2 = new int[arr.length];
        int negdi = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res2[negdi] = arr[i];
            System.out.printf("%d ", res2[negdi]);
            negdi++;
        }
        System.out.println("\n****ex27*****");
        int[] arr3 = {1, 2, 5, 1, 6, 1, 5, 4, 8};
        int tmp = 0;
        boolean IsMove = true;
        while (IsMove) {
            IsMove = false;
            for (int i = 0; i < arr3.length - 1; i++) {
                if (arr3[i] > arr3[i + 1]) {
                    tmp = arr3[i + 1];
                    arr3[i + 1] = arr3[i];
                    arr3[i] = tmp;
                    IsMove = true;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);
        }
    }

    public static void perek14ex29() {
        int[] arr = {1, 2, 0, 1, 9, 0, 0, 0, 0};
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0 || arr[i + 1] != 0) {
                num = arr[i] + num * 10;
            }
        }
        System.out.println(num);
    }

    public static void perek14ex30() {
        int[] arr = {1, 2, 5, 1, 6, 1, 5, 4, 8};
        int[] info = new int[3];
        int max = 0;
        int min = arr[0];
        int sofer = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            if (arr[i] == 1) {
                sofer++;
            }
            info[0] = max;
            info[01] = min;
            info[2] = sofer;
        }
        System.out.printf("[");
        for (int i = 0; i < info.length; i++) {
            if (i == info.length - 1) {
                System.out.printf("%d", info[i]);
                break;
            }
            System.out.printf("%d,", info[i]);
        }
        System.out.printf("]");

    }

    public static void pererk14ex31_33() {
        int[][] gradeds = new int[10][3];
        String[] student = {"Ron", "Mor", "Dan"};
        Random r = new Random();

        float avgR = 0, avgM = 0, avgD = 0, avgAll = 0, max, min;
        for (int i = 0; i < student.length; i++) {
            System.out.printf("|  %s  |", student[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < gradeds.length; i++) {
            for (int j = 0; j < gradeds[i].length; j++) {
                int ran = r.nextInt(40) + 61;
                gradeds[i][j] = ran;
                switch (j) {
                    case 0:
                        avgR += gradeds[i][j];
                        break;
                    case 1:
                        avgM += gradeds[i][j];
                        break;
                    case 2:
                        avgD += gradeds[i][j];
                        break;
                    default:
                        break;
                }
                System.out.printf("|  %3d  |", gradeds[i][j]);
            }
            System.out.println("");
        }

        avgD /= gradeds.length;
        avgM /= gradeds.length;
        avgR /= gradeds.length;
        max = Math.max(avgD, Math.max(avgM, avgR));
        min = Math.min(avgD, Math.min(avgM, avgR));
        avgAll = (avgD + avgM + avgR) / gradeds[9].length;
        int b = max == avgM ? 1 : 0;
        int a = max == avgD ? 2 : b;
        int c = min == avgM ? 1 : 0;
        int d = min == avgD ? 2 : c;
        System.out.printf("Ron : %.1f\nMor : %.1f\nDan : %.1f\nThe total average : %.1f\nThe spot of the highest average is : %d\nThe spot of the lowest average is : %d \n", avgR, avgM, avgD, avgAll, a, d);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++EX31+++++++++++++++++++++++++++++++++++++++++++");
        int[][] age = new int[10][5];
        float[] average = new float[10];
        float[] Max = new float[10];
        float[] Min = new float[10];
        float real = 0;
        int sofer = 0;
        int counter = 0;
        for (int i = 0; i < age.length; i++) {
            age[i][0] = i + 1;
            for (int j = 1; j < age[i].length; j++) {
                int ran1 = r.nextInt(121);
                age[i][j] = ran1;
                average[i] += age[i][j];
            }
            average[i] /= (age[i].length - 1);
            Max[i] = Min[i] = average[i];
        }
        for (int i = 0; i < average.length; i++) {
            System.out.println("Apartment " + age[i][0] + "|: have the average age of : " + average[i]);
            real += average[i];
        }
        max = 0;
        min = 120;
        System.out.println("The total age average is : " + (real / average.length));
        for (int i = 0; i < Max.length; i++) {
            max = Math.max(max, Max[i]);
            if (max == Max[i]) {
                sofer = i + 1;
            }
            min = Math.min(min, Min[i]);
            if (min == Min[i]) {
                counter = i + 1;
            }
        }
        System.out.println("Apartment " + counter + " is the youngest\nApartment " + sofer + " is the oldest");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++EX32+++++++++++++++++++++++++++++++++++++++++++");
        int[][] sal = new int[50][12];
        float[] average2 = new float[50];
        float[] MaxorMin = new float[50];
        for (int i = 0; i < sal.length; i++) {
            for (int j = 0; j < sal[i].length; j++) {
                int ran = r.nextInt(3_000) + 14_000;
                sal[i][j] = ran;
                average2[i] += sal[i][j];
            }
            MaxorMin[i] = average2[i] /= sal[i].length;
        }
        min = max = MaxorMin[0];
        int avg = 0, zoher1 = 0, zoher2 = 0;
        for (int i = 0; i < average2.length; i++) {
            avg += average2[i];
            max = Math.max(max, MaxorMin[i]);
            min = Math.min(min, MaxorMin[i]);
            if (max == MaxorMin[i]) {
                zoher1 = i;
            }
            if (min == MaxorMin[i]) {
                zoher2 = i;
            }
            System.out.println("Employ No' : " + (i + 1) + " got average salary of " + average2[i]);
        }
        System.out.println("The total average of all the employs is : " + avg / average2.length + "\nEmploy No:" + (zoher1 + 1) + " have the highest average salary of :" + MaxorMin[zoher1] + "\nEmploy No:" + (zoher2 + 1) + " have the lowest average salary of :" + MaxorMin[zoher2]);
    }

    public static void pererk14ex34_37() {
        int[][] matrix = new int[10][10];
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int ran = r.nextInt(100);
                matrix[i][j] = ran;
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nex 34\n");
        int[][] matrix2 = new int[10][10];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (i == j || i == matrix2[i].length - j - 1) {
                    matrix2[i][j] = 1;
                } else {
                    matrix2[i][j] = 0;
                }
                System.out.printf("%2d ", matrix2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nex 35\n");
        int[][] matrix3 = new int[10][10];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                int ran = r.nextInt(101) + 100;
                if (ran % 5 == 0 || ran % 7 == 0) {
                    matrix3[i][j] = 0;
                } else {
                    matrix3[i][j] = ran;
                }
                System.out.printf("%3d ", matrix3[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nex 36\n");
        int[] sumLine = new int[10];
        int[][] matrix4 = new int[10][10];
        int zoher = 0;
        int max = 0;
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                int ran = r.nextInt(101) + 100;
                matrix4[i][j] = ran;
                sumLine[i] += matrix4[i][j];
                System.out.printf("%3d ", matrix4[i][j]);
            }
            System.out.printf("%3d", sumLine[i]);
            System.out.println("");
            max = Math.max(max, sumLine[i]);
            if (max == sumLine[i]) {
                zoher = i;
            }
        }
        System.out.println("");
        for (int i = 0; i < sumLine.length; i++) {
            System.out.printf("%d ", matrix4[zoher][i]);

        }
        System.out.println("\nex37\n");
        int[][] matrix5 = new int[10][10];
        for (int i = 0; i < matrix5.length; i++) {
            for (int j = 0; j < matrix5[i].length; j++) {
                if (j % 2 == 0 && i % 2 != 0 || i % 2 == 0 && j % 2 != 0) {
                    matrix5[i][j] = 0;
                } else {
                    matrix5[i][j] = 1;
                }
                System.out.printf("%2d ", matrix5[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\nex38\n ");
        int[][] matrix6 = new int[10][10];
        int index = 4;
        for (int k = 0; k < matrix6.length / 2; k++) {
            int Pindex = index + 1;
            int Nindex = index + 1;
            for (int i = 0; i < matrix6.length; i++) {
                for (int j = 0; j < matrix6[i].length; j++) {
                    matrix6[index][j] = Pindex;
                    matrix6[matrix6[i].length - Nindex][j] = Pindex;
                }
                matrix6[i][index] = Pindex;
                matrix6[i][matrix6.length - Nindex] = Pindex;
            }
            index--;
        }


        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                System.out.printf("%2d ", matrix6[i][j]);
            }
            System.out.println("");
        }
        System.out.println("ex39");
    }

    public static void pererk14ex40() {
        int[][] matrix = new int[10][10];
        Random r = new Random();
        int[] Rsum = new int[10];
        int[] Csum = new int[10];
        int[] cross = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
                Rsum[i] += matrix[i][j];
                Csum[j] += matrix[i][j];
                if (j == i) {
                    cross[0] += matrix[i][j];
                } else if (matrix.length - 1 - i == j) {
                    cross[1] += matrix[i][j];
                }
            }

        }
        System.out.printf("%4d ", cross[0]);

        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%3d", Csum[i]);
        }
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%3d|", Rsum[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.printf("|%3d", Rsum[i]);
            System.out.println("");
        }
        System.out.printf("%4d ", cross[1]);
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%3d", Csum[i]);
        }
        boolean IsMagicSqure = false;
        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < Rsum.length; j++) {
                if (cross[i] == Rsum[j] && cross[i] == Csum[j]) {
                    IsMagicSqure = true;
                }
            }

        }
        System.out.println("\nIs this is a Magic Qube ? \n" + IsMagicSqure);
    }

    // perek 16 ex 1 :
    public static void name() {
        System.out.println("my name is bar");
    }

    // perek  ex 2 :
    public static void zogis() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.printf("%4d", i);

        }
    }

    //perek 16 ex 3 :
    public static void f3() {
        System.out.println("f3");
    }

    public static void f2() {
        System.out.println("f2");
        System.out.println("-------------");
        f3();
    }

    public static void f1() {
        System.out.println("f1");
        System.out.println("-------------");
        f2();
    }

    // perek 16 ex 4 :
    public static double f4(short a, short b, short c, short d, short e) {
        double avg = (double) (a + b + c + d + e) / 5;
        return avg;
        /*         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers :: ");
        short a = sc.nextShort();
        short b = sc.nextShort();
        short c = sc.nextShort();
        short d = sc.nextShort();
        short e = sc.nextShort();
        System.out.println(f4(a,b,c,d,e));

         */
    }

    // perek 16 ex 5 :
    public static int MaxToMin(int max, int min) {
        Random r = new Random();
        int num = r.nextInt(max - min + 1) + min;
        return num;
        /*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a max number and min ::");
        int Max  = sc.nextInt();
        int Min  = sc.nextInt();
        System.out.println( MaxToMin(Max, Min));

         */
    }

    // perek 16 ex 6 :
    public static void Ya(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
    }

    // perek 16 ex 7 :
    public static boolean ReShoni(int num) {
        int sofer = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sofer++;
            }

        }
        if (sofer != 0) {
            return false;
        } else {
            return true;
        }
    }

    // perek 16 ex 8 :
    public static int[] First(int[] num) {
        Random r = new Random();
        int[] makearry = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            makearry[i] = r.nextInt(401) - 200;
        }
        return makearry;
    }

    public static void Alpha(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%5d", num[i]);
        }
        System.out.println("");
    }

    public static int SumOfArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static double AvgOfArray(int[] num) {
        double avg = SumOfArray(num);
        avg /= num.length;
        return avg;
    }

    public static int Max(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;
    }

    public static int Min(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            min = Math.min(min, num[i]);
        }
        return min;
    }

    public static int WhereisMax(int[] num) {
        int max = num[0];
        int po = 0;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
            if (max == num[i]) {
                po = i;
            }
        }
        return po;
    }

    public static int WhereisMin(int[] num) {
        int min = num[0];
        int po = 0;
        for (int i = 0; i < num.length; i++) {
            min = Math.min(min, num[i]);
            if (min == num[i]) {
                po = i;
            }
        }
        return po;
    }

    public static int ThereZugi(int[] num) {
        int[] a = new int[num.length];
        int indexzu = 0;
        for (int i = 0; i < a.length; i++) {
            if (num[i] % 2 == 0) {
                a[indexzu] = num[i];
                indexzu++;
            }
        }
        return indexzu;
    }

    public static int ThereEi(int[] num) {
        int[] b = new int[num.length];
        int indexei = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                b[indexei] = num[i];
                indexei++;
            }
        }
        return indexei;
    }

    public static boolean FoundNum(int[] num, int number) {
        boolean IsThere = false;
        for (int i = 0; i < num.length; i++) {
            if (number == num[i]) {
                IsThere = true;
                break;
            }

        }
        return IsThere;

    }

    public static int NumPlace(int[] num, int number) {
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (number == num[i]) {
                index = i;
                break;
            }

        }
        return index;
    }

    // all the writing :
    /*
            int[] oneHundred = new int[100];
      oneHundred = First(oneHundred);
      Alpha(oneHundred);
        System.out.println(SumOfArray(oneHundred));
        System.out.println(AvgOfArray(oneHundred));
        System.out.println(Max(oneHundred));
        System.out.println(WhereisMax(oneHundred));
        System.out.println(Min(oneHundred));
        System.out.println(WhereisMin(oneHundred));
        System.out.println(ThereZugi(oneHundred));
        System.out.println(ThereEi(oneHundred));
        System.out.println(FoundNum(oneHundred, 0));
        System.out.println(NumPlace(oneHundred, 0));
     */
    // perek 16 ex 9 :
    public static void MakeSquare(int side) {
        for (int i = 0; i < side; i++) {
            if (i == 0 || i == side - 1) {
                for (int j = 0; j < side; j++) {
                    System.out.printf(" * ");
                }
            } else {
                System.out.printf(" * ");
                for (int j = 0; j < side - 2; j++) {
                    System.out.printf("   ");
                }
                System.out.printf(" * ");
            }
            System.out.println("");
        }

    }

    /*
            for (int q = 1; q < 17; q++) {
            MakeSquare(q);
            System.out.println("");
        }
     */
    //perek 16 ex 10 :
    public static void RightNow() {
        LocalDateTime now = LocalDateTime.now();
        int sec = now.getSecond();
        int min = now.getMinute();
        int hour = now.getHour();
        System.out.printf("%2d : %2d : %2d", hour, min, sec);
    }

    // perek 16 ex extra :
    /*
    public static void UniCorn() {
        System.out.println("  \\.");
        System.out.println("   \\\\      .");
        System.out.println("    \  \\\ _,.+;)_");
        System.out.println("    .  \\\\;~%:88%%.");
        System.out.println("   (( a   `)9,8;%.");
        System.out.println("   /`   _) ' `9%%%?");
        System.out.println("  (' .-' j    '8%%'");
        System.out.println("   `\"+   |    .88%)+._____..,,_   ,+%$%.");
        System.out.println("         :.   d%9`             `-%*'\"'~%$.");
        System.out.println("      ___(   (%C                 `.   68%%9");
        System.out.println("    .  \"        \7                  ;  C8%%)`");
        System.out.println("    : .\"-.__,'.____________..,`   L.  \\86' ,");
        System.out.println("    : L    : :            `  .'\\.   '.  %$9%)");
        System.out.println("    ;  -.  : |             \\  \  \  \  " +"-._ `. `~\"");
        System.out.println("     `. !  : |              )  >     \". ?");
        System.out.println("       `'  : |            .' .'       : |");
        System.out.println("           ; !          .' .'         : |");
        System.out.println("          ,' ;         ' .'           ; (");
        System.out.println("         .  (         j  (            `  \\");
        System.out.println("         \"\"\"'          \"\"'             `\"\"");
        System.out.println("\n\n");
    }
    */
    //perek 17 ex 1 :
    public static void GuessTheNumber() {
        int[] Binery = new int[4];
        Random r = new Random();
        int pitaron = r.nextInt(16);
        Binery = ToB2(Binery, pitaron);
        for (int i = 0; i < Binery.length; i++) {
            System.out.printf("%d", Binery[i]);
        }
        System.out.println("");
        System.out.println(pitaron);
        TheGame(Binery, pitaron);
    }

    public static void TheGame(int[] bit, int pit) {
        int times = 0;
        int nichos = 0;
        Scanner sc = new Scanner(System.in);
        while (times < bit.length && nichos != pit) {
            System.out.println("The Guess Game :");
            System.out.println("The numbers you know of : ");
            for (int i = times; i < bit.length; i++) {
                System.out.printf("- ");
            }
            for (int i = bit.length - times; i < bit.length; i++) {
                System.out.printf(" %d", bit[i]);
            }
            //print(bit, times);
            System.out.println("\nLets Try To Guess:");
            nichos = sc.nextInt();
            times++;
        }
        if (times == bit.length && nichos != pit) {
            System.out.println("YOU FAILED.....\n the number was : " + pit);
        } else {
            System.out.println("Good Job");
        }

    }

    // only because this i hezlahti :
    public static void print(int[] num, int times) {
        switch (times) {
            case 0:
                System.out.println("- - - -");
                break;
            case 1:
                System.out.println("- - - " + num[3]);
                break;
            case 2:
                System.out.println("- - " + num[2] + " " + num[3]);
                break;
            case 3:
                System.out.println("- " + num[1] + " " + num[2] + " " + num[3]);
                break;
            default:
                break;
        }


    }

    public static int[] ToB2(int[] num, int random) {
        for (int i = 0; i < num.length; i++) {
            if (random >= Math.pow(2, num.length - 1 - i)) {
                random -= Math.pow(2, num.length - 1 - i);
                num[i] = 1;
            } else {
                num[i] = 0;
            }
        }
        return num;
    }

    public static void Game2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think about a number between 1 - 31");
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
        int[] arr2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
        int[] arr3 = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
        int[] arr4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
        int[] arr5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
        printArr(arr4);
        printArr(arr5);
        System.out.println("How many times ur number exsist ? ");
        int shora = sc.nextInt();
        int[] shorot = new int[shora];
        System.out.println("Enter in which rows the number exsist : \nenter number and then 'enter': ");
        for (int i = 0; i < shorot.length; i++) {
            shorot[i] = sc.nextInt();
        }
        //printArr(shorot);
        System.out.println(TheNum(shorot));
    }

    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%3d", num[i]);
        }
        System.out.println("");
    }

    public static int TheNum(int[] num) {
        int numa = 0;
        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case 1:
                    numa += 1;
                    break;
                case 2:
                    numa += 2;
                    break;
                case 3:
                    numa += 4;
                    break;
                case 4:
                    numa += 8;
                    break;
                case 5:
                    numa += 16;
                    break;
                default:
                    break;
            }

        }
        return numa;
    }

    public static void TikTakTok() {
        Scanner sc = new Scanner(System.in);
        String[][] ttt = new String[3][3];
        int index = 1;
        printString(TTT(ttt, index));
        int sofer = 1;
        while (sofer <= 9) {
            String makom = "";
            if (sofer % 2 == 0) {
                System.out.println("O's turn :\nWhere would u want to put ur knight ?\nChose between the available numbers :");
                makom += sc.next();
                ToO(ttt, makom);
                sofer++;
            } else {
                System.out.println("X's turn :\nWhere would u want to put ur knight ?\nChose between the available numbers :");
                makom += sc.next();
                ToX(ttt, makom);
                sofer++;
            }
            Switcho(ttt, sofer);
            printString(ttt);
            if (Switcho(ttt, sofer)) {
                break;
            }
        }
        sc.close();
    }

    public static String[][] TTT(String[][] ttt, int index) {
        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[i].length; j++) {
                ttt[i][j] = "" + index;
                index++;
            }
        }
        return ttt;
    }

    public static void printString(String[][] ttt) {
        System.out.println(" ___ ___ ___ ");
        for (int i = 0; i < ttt.length; i++) {
            System.out.print("|");
            for (int j = 0; j < ttt[i].length; j++) {
                System.out.printf("%2s |", ttt[i][j]);
            }
            System.out.println("\n ___ ___ ___ ");
        }
    }

    public static String[][] ToO(String[][] ttt, String makom) {
        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[i].length; j++) {
                if (Objects.equals(makom, ttt[i][j])) {
                    ttt[i][j] = "O";
                }
            }
        }
        return ttt;
    }

    public static String[][] ToX(String[][] ttt, String makom) {
        for (int i = 0; i < ttt.length; i++) {
            for (int j = 0; j < ttt[i].length; j++) {
                if (Objects.equals(makom, ttt[i][j])) {
                    ttt[i][j] = "X";
                }
            }
        }
        return ttt;
    }

    public static boolean Switcho(String[][] ttt, int a) {
        boolean isTie = true;
        for (int i = 0; i < ttt.length; i++) {
            if (Objects.equals(ttt[i][0], ttt[i][1]) && Objects.equals(ttt[i][2], ttt[i][1]) && Objects.equals(ttt[i][2], "X") ||
                    Objects.equals(ttt[0][i], ttt[1][i]) && Objects.equals(ttt[1][i], ttt[2][i]) && Objects.equals(ttt[i][2], "X") ||
                    Objects.equals(ttt[0][0], ttt[1][1]) && Objects.equals(ttt[1][1], ttt[2][2]) && ttt[2][2] == "X") {
                System.out.println("X won");
                isTie = false;
                return true;

            } else if (Objects.equals(ttt[i][0],
                    ttt[i][1]) && Objects.equals(ttt[i][2], ttt[i][1]) && Objects.equals(ttt[i][2], "O") ||
                    Objects.equals(ttt[0][i], ttt[1][i]) && Objects.equals(ttt[1][i], ttt[2][i]) && Objects.equals(ttt[i][2], "O") ||
                    Objects.equals(ttt[0][0], ttt[1][1]) && Objects.equals(ttt[1][1], ttt[2][2]) && Objects.equals(ttt[2][2], "O")) {
                System.out.println("O won");
                isTie = false;
                return true;
            }
        }
        if (isTie && a == 9) {
            System.out.println("This is a tie !");
            return true;
        }

        return false;
    }

    public static void afoh() {
        String a = "Leo Messi";
        String b = "";
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            b = b + a.charAt(a.length()-1-i);
        }
        System.out.println(b);
    }
}