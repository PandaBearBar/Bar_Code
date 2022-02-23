package A_etc.ExtraTirgol;

import java.util.Random;

public class ex5from14_5A {
    public static void main(String[] args) {
        int[] nums1 = makeArr();
        int[] nums2 = makeArr();
        //----------------------------------------
        /*
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = r.nextInt(10);
            System.out.printf("%3d", nums1[i]);
        }
        System.out.println("");

         */// the spageti
        print(nums1);
        //----------------------------------------
        /*
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = r.nextInt(10);
            System.out.printf("%3d", nums2[i]);
        }

         *///the spageti
        print(nums2);
        //----------------------------------------
        int[] copy1 = new int[10];
        int[] copy2 = new int[10];
        //----------------------------------------
        //System.arraycopy(nums1, 0, copy1, 0, copy1.length);
        copyCat(copy1, nums1);
        print(copy1);
        //----------------------------------------
        //System.arraycopy(nums2, 0, copy2, 0, copy2.length);
        copyCat(copy2, nums2);
        print(copy2);
        //----------------------------------------
        /*
        for (int i = 0; i < copy1.length; i++) {
            for (int j = 0; j < copy1.length; j++) {
                if (copy1[i] == nums2[j]) {
                    copy1[i] = -1;
                    break;
                }
            }
        }

         */
        remover(copy1, nums2);
        //----------------------------------------
        /*
        for (int i = 0; i < copy2.length; i++) {
            for (int j = 0; j < copy2.length; j++) {
                if (copy2[i] == nums1[j]) {
                    copy2[i] = -1;
                    break;
                }
            }
        }

         */
        remover(copy2, nums1);
        //----------------------------------------
        /*
        for (int i = 0; i < copy1.length; i++) {
            for (int j = i+1; j < copy1.length; j++) {
                if (copy1[i] == copy1[j] && copy1[j] != -1) {
                     copy1[j] = -1;
                }
            }
            System.out.printf("%3d", copy1[i]);
        }
        System.out.println();

         */
        dobl(copy1);
        //----------------------------------------
        /*
        for (int i = 0; i < copy2.length; i++) {
            for (int j = i+1; j < copy2.length; j++) {
                if (copy2[i] == copy2[j] && copy2[j] != -1) {
                    copy2[i] = -1;
                }
            }
            System.out.printf("%3d", copy2[i]);
        }
        System.out.println();

         */
        dobl(copy2);
        //----------------------------------------
        int[] last = minusArr();
        /*new int[10];
        for (int i = 0; i < last.length; i++) {
            last[i] = -1;


        }

                 */
        //----------------------------------------
        /*
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (copy1[i] != -1) {
                last[index] = copy1[i];
                index++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (copy2[i] != -1) {
                last[index] = copy2[i];
                index++;
            }
        }
        */
        copyfrom2(last, copy1, copy2);
        //----------------------------------------
        print(last);
    }

    public static int [] makeArr () {
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);

        }

        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println("");
    }

    public static int[] copyCat(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
        return b;
    }

    public static int[] remover(int a[], int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j] && a[i] != -1) {
                    a[i] = -1;
                }
            }
        }
        return a;
    }

    public static int[] dobl(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[j] != -1) {
                    a[j] = -1;
                }

            }
        }

        return a;
    }

    public static int[] copyfrom2 (int [] a, int [] b , int [] c){
        int index = 0 ;
        for (int i = 0; i < a.length; i++) {
            if (b[i]!=-1){
                a[index]=b[i];
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (c[i]!=-1){
                a[index]=c[i];
                index++;
            }
        }


        return a;
    }

    public static int [] minusArr (){
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= -1;
        }

        return arr;
    }
}
