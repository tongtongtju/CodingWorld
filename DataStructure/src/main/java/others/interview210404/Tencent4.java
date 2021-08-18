package others.interview210404;


import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 21:40
 */
public class Tencent4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int power = sc.nextInt();
            int[] init = new int[num];
            int[] per = new int[num];
            for (int j = 0; j < num; j++) {
                init[j] = sc.nextInt();
                per[j] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < num; j++) {
                sum += init[j];

            }
            sum -= power; //每秒总共耗电量
            //初试总的电量
            int sum1 = 0;
            for (int j = 0; j < num; j++) {
                sum1 += init[j];
            }
            float total = sum1;
            float con = sum;
            float time0 = sum1/con;
            float[] times = new float[num];
            for (int j = 0; j < num; j++) {
                times[j] = (float)init[j]/(float) per[j];
            }
        }
    }

}
