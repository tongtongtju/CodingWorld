package others.interview210411;

import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-11 11:42
 */
public class Meituan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int num0 = 0, num1 = 0;
            String str1 = scanner.next();
            char[] charArray = str1.toCharArray();
            for (int i = 0; i < str1.length(); i++) {
                if('0'==charArray[i]){
                    num0 += 1;
                }else {
                    num1 += 1;
                }
            }
            //不适用魔法
            System.out.println(Math.abs(num0-num1));

        }
    }
}
