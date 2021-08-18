package others.Interview210418;

import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-18 19:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] matrix = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = arr[i]*(j+1);
            }
        }
        int num=1;
        for (int i = 0; i < k; i++) {
            int[] arr1 = findMax(matrix, num,false);
            System.out.println(arr1[0] + 1);
            num = arr1[1];
        }
        //找出矩阵中大于num的值及对应的行号

    }

    public static int[] findMax(int[][] matrix, int num, boolean flag){
        if(flag){return null;}
        int a = 0;
        int seek = 0;
        int index=0;

        while (!flag) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == num) {
                        index = i;
                        matrix[i][j] = 0;
                        flag = true;
                        break;
                    }
                }
                if(flag){break;}
            }
            if(flag){break;}
            num++;
            findMax(matrix,num,flag);
        }
        int[] arr = {index, num};
        return arr;
    }
}
