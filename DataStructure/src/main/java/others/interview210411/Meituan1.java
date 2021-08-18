package others.interview210411;

import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-11 10:05
 */
public class Meituan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int res = 0;
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] house = new int[n];
            for (int i = 0; i < n; i++) {
                house[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (house[i] == 0){
                    index = i;
                }
            }
            int left = index, right = index;
            while(true){
                left--;
                right++;
                if(left>=0 && house[left]<(k+1) && house[left]>0){
                    res = left;
                    break;
                }
                if (right<n && house[right]<(k+1)&& house[right]>0){
                    res = right;
                    break;
                }
            }
            System.out.println(res+1);
        }

    }
}
