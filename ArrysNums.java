public class ArrysNums {
    private static int initRand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    private static int[] makeArr(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initRand(0, 10);
        }
        return arr;
    }

    private static int[] AllMinus(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        return arr;
    }

    private static int[] arr1 = makeArr(15);
    private static int[] arr2 = makeArr(15);
    private static int[] arr0 = AllMinus(makeArr(10));
    private static int index = 0;
    private static int copy = 0;
    private static int theNum = 0;

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        print(arr1);
        makeNoDouble(arr1);
        print(arr1);
        System.out.println("*******************");
        print(arr2);
        makeNoDouble(arr2);
        print(arr2);
        System.out.println("*******************");
        print(arr0);
        onlyUno(arr1, arr2);
        onlyUno(arr2, arr1);
        System.out.println("*******************");
        print(arr0);
        System.out.println("*******************");
        makeNum();
        System.out.println(theNum);
        afoh();
        System.out.println(theNum);
    }

    private static void makeNoDouble(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            copy = arr1[i];
            for (int j = i + 1; j < arr1.length; j++) {
                if (copy != -1 && copy == arr1[j]) {
                    arr1[j] = -1;
                }
            }
        }
    }

    private static void onlyUno(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean there = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    there = true;
                }
            }
            if (!there) {
                arr0[index] = arr1[i];
                index++;
            }
        }
    }

    private static void makeNum() {
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] != -1) {
                theNum = theNum * 10 + arr0[i];
            }
        }
    }

    private static void afoh() {
        theNum = 0 ;
        for (int i = arr0.length - 1; i >= 0; i--) {
            if (arr0[i] != -1) {
                theNum = theNum * 10 + arr0[i];
            }
        }
    }
}

