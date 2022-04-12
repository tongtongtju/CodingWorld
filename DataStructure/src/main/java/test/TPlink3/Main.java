package test.TPlink3;

import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 1, 8, 0, 3, 5, 9, 4, 5};
        int[] arr2 = {3,7,1,8,0,2,6,9,4,5};
        System.out.println(testDup(arr1));
        System.out.println(testDup(arr2));
    }
    static String testDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])){
                target.add(arr[i]);
                continue;
            }
            set.add(arr[i]);

        }
        if(target.isEmpty()){
            target.add(-1);
        }
        return target.toString();
    }
}
