package A_etc.ExtraTirgol; // start at 00:15 end at 01:35

import java.util.Scanner;

public class tiktaktoe {
    public static void main(String[] args) {
        start();
        mainGameCode(makeSarr());
        end();
    }

    public static Scanner sc = new Scanner(System.in);

    public static void start() {
        System.out.println("Hello User This is ur board for this 'tik tak toe' : ");
        print(makeSarr());
    }

    public static void print(String[] sarr) {
        int index = 0;
        for (int i = 0; i < sarr.length / 3; i++) {
            for (int j = 0; j < sarr.length / 3; j++) {
                System.out.printf("%3s", sarr[index]);
                index++;
            }
            System.out.println("");

        }
    }

    public static String[] makeSarr() {
        String[] sarr = new String[9];
        int[] arr = arrosh();
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = arr[i] + "";
        }

        return sarr;
    }

    public static int[] arrosh() {
        int[] arr = new int[9];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void mainGameCode(String[] sarr) {
        int index = 1;
        while (index <= 9 && !winCon(sarr)) {
            if (index % 2 == 0) {
                turnO(sarr);
            } else {
                turnX(sarr);
            }
            print(sarr);
            index++;
        }
    }

    public static String[] turnX(String[] sarr) {
        System.out.println("X's Turn :\nWhere u want to put ur X ?");
        int tzova = sc.nextInt() - 1;
        if (sarr[tzova].charAt(0) != 'X' && sarr[tzova].charAt(0) != 'O') {
            sarr[tzova] = "X";
        } else while (sarr[tzova].charAt(0) == 'X' || sarr[tzova].charAt(0) == 'O') {
            System.out.println("U cant fool me try again !");
            tzova = sc.nextInt() - 1;
            if (sarr[tzova].charAt(0) != 'X' && sarr[tzova].charAt(0) != 'O') {
                sarr[tzova] = "X";
                break;
            }
        }
        return sarr;
    }

    public static String[] turnO(String[] sarr) {
        System.out.println("O's Turn :\nWhere u want to put ur O ?");
        int tzova = sc.nextInt() - 1;
        if (sarr[tzova].charAt(0) != 'X' && sarr[tzova].charAt(0) != 'O') {
            sarr[tzova] = "O";
        } else while (sarr[tzova].charAt(0) == 'X' || sarr[tzova].charAt(0) == 'O') {
            System.out.println("U cant fool me try again !");
            tzova = sc.nextInt() - 1;
            if (sarr[tzova].charAt(0) != 'X' && sarr[tzova].charAt(0) != 'O') {
                sarr[tzova] = "O";
                break;
            }
        }
        return sarr;
    }

    public static boolean winCon(String[] sarr) {
        for (int i = 0; i < sarr.length / 3; i++) {
            if (sarr[i].charAt(0) == sarr[i + 3].charAt(0) && sarr[i].charAt(0) == sarr[i + 6].charAt(0) && sarr[i].charAt(0) == 'X') {
                System.out.println("Its X's win");
                return true;
            } else if (sarr[i].charAt(0) == sarr[i + 3].charAt(0) && sarr[i].charAt(0) == sarr[i + 6].charAt(0) && sarr[i].charAt(0) == 'O') {
                System.out.println("Its O's win");
                return true;
            }

        } //row
        for (int i = 0; i < sarr.length; i += 3) {
            if (sarr[i].charAt(0) == sarr[i + 1].charAt(0) && sarr[i].charAt(0) == sarr[i + 2].charAt(0) && sarr[i].charAt(0) == 'X') {
                System.out.println("Its X's win");
                return true;
            } else if (sarr[i].charAt(0) == sarr[i + 1].charAt(0) && sarr[i].charAt(0) == sarr[i + 2].charAt(0) && sarr[i].charAt(0) == 'O') {
                System.out.println("Its O's win");
                return true;
            }
        } //colons
        int i = 0;
        if (sarr[i].charAt(0) == sarr[i + 4].charAt(0) && sarr[i].charAt(0) == sarr[i + 8].charAt(0) && sarr[i].charAt(0) == 'X') {
            System.out.println("Its X's win");
            return true;
        } else if (sarr[i].charAt(0) == sarr[i + 4].charAt(0) && sarr[i].charAt(0) == sarr[i + 8].charAt(0) && sarr[i].charAt(0) == 'O') {
            System.out.println("Its O's win");
            return true;
        }
        i = 2;
        if (sarr[i].charAt(0) == sarr[i + 2].charAt(0) && sarr[i].charAt(0) == sarr[i + 4].charAt(0) && sarr[i].charAt(0) == 'X') {
            System.out.println("Its X's win");
            return true;
        } else if (sarr[i].charAt(0) == sarr[i + 2].charAt(0) && sarr[i].charAt(0) == sarr[i + 4].charAt(0) && sarr[i].charAt(0) == 'O') {
            System.out.println("Its O's win");
            return true;
        }
        return false;
    }

    public static void end() {
        System.out.println("Would you like to play again ?\n|Y / N|");
        char tzova = sc.next().toUpperCase().charAt(0);
        while (true) {
            while (tzova == 'Y') {
                start();
                mainGameCode(makeSarr());
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
}

