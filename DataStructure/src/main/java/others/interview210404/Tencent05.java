package others.interview210404;

import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 21:23
 */
public class Tencent05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num1 =sc.nextInt();
            int m = sc.nextInt();
            int[] ints = new int[num1];
            for (int j = 0; j < num1; j++) {
                ints[j] = sc.nextInt();
            }
            for (int j = 0; j < ints.length; j++) {
                if(ints[j]%m == 0){
                    System.out.println(1);
                }
            }
        }
    }
}
