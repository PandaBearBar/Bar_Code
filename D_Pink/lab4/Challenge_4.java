package D_Pink.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Challenge_4 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,17,21,5};
        int [] arr2 = {6,76,42};
        addArry(arr2);
        addArry(arr1);
        System.out.println(list.toString());
    }
    private static void addArry (int [] arr){
        for (int a : arr)list.add(a);
    }
}
