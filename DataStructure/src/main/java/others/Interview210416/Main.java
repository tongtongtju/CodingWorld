package others.Interview210416;



/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-16 19:42
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dis = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 3; j++) {

                dis[i][j] = sc.nextInt();
            }
        }

        int score = arr[0];;
        for (int i = 0; i < n - 1; i++) {
            if(dis[i][2] == 0 && (dis[i][0]== 1 || dis[i][1]== 1)){

                score+=arr[i];
            }
        }
        if (T == 0){
            System.out.println(score);
            return;
        }else {
            //判断时间是否够用
            //城堡是如何连接的
        }

        System.out.println(score);
    }
}
