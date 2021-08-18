package others.Interview210416;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-16 19:03
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        int[] arr = new int[]{4,5,1,3,2};
//        reverse(arr,2,5);
//        for (int i : arr) {
//            System.out.printf(i+" ");
//        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i <k ; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            reverse(arr,left,right);
        }
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }


        int num=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[i]){
                    num ++;
                }
            }
        }
        System.out.println(num);



    }
    public static void reverse(int[] arr, int left, int right){
        int temp;
        for (int i = left-1; i < (left + right-2)/2.0; i++) {
            temp = arr[i];
            arr[i] = arr[left+right-i-2];
            arr[left+right-i-2] = temp;
        }
    }
}