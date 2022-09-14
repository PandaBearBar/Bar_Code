package D_Pink.lab2;

public class Challenge_2 {
    public static void main(String[] args) {
        int [] arr = {1,54,7,2,87,3,4,2,3};
        int min;
        int max = min = arr [0];
        for(int a : arr){
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(max);
        System.out.println(min);
    }
}
