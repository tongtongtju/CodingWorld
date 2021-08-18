package others.interview210411;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-11 10:30
 */
public class Meituan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] ints1 = new int[n];
            int[] ints2 = new int[m];
            for (int i = 0; i < n; i++) {
                ints1[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                ints2[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                set.add(ints1[i]);
            }
            for (int i = 0; i < m; i++) {
                set.add(ints2[i]);
            }
            int d; //距离
            int score = 0;
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                int res1 = 0; //分数1
                int res2 = 0; //分数2

                d = iterator.next();
                for (int i = 0; i < n; i++) {
                    if(ints1[i]<=d){
                        res1 += 1;
                    }else {
                        res1 +=2;
                    }
                }
                for (int i = 0; i < m; i++) {
                    if(ints2[i]<=d){
                        res2 += 1;
                    }else {
                        res2 +=2;
                    }

                }
//                score = (score<(res2-res1)?(res2-res1):score);
                if(score<((res2-res1))){
                    score = (res2 - res1);
                }
            }

            System.out.println(score);
        }


    }
}
