package others.interview210404;

import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 20:14
 */
public class Tencent2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        boolean flag = true;
        int len = sb.length();

        while (flag) {

            for (int i = 0; i < sb.length() - 1; i++) {
                len = sb.length();
                if (Integer.parseInt(String.valueOf(sb.charAt(i))) + Integer.parseInt(String.valueOf(sb.charAt(i + 1))) == 10) {
//                    sb.delete(i, i + 2);
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);

                    break;

                }

            }
            if(sb.length()==0){flag = false;}
            if(len==sb.length()){flag=false;}
        }
        System.out.println(sb.length());

    }
}
