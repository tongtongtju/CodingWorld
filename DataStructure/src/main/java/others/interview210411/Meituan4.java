package others.interview210411;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-11 11:01
 */
public class Meituan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String str1 = scanner.next();
            String str = str1.substring(0,n);
            int num = n;
            char[] chars = str.toCharArray();
            for (int i = 0; i < n-1; i++) {
                if(chars[i] == chars[i+1]){
                    num += 1;
                }
            }

            for (int i = 3; i <=n; i++) { //子串长度
                for (int j = 0; j < n - i + 1; j++) {
                    String string = str.substring(j,j+i);
                    if(testStr(string)){
                        num += 1;
                    }
                }
            }
            System.out.println(num);

        }
//        System.out.println(testStr("aa"));
    }
    private static boolean testStr(String str){
        char[] chars = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        if(set.size()>(chars.length/2+1)){
            return false;
        }
        Iterator<Character> iterator = set.iterator();

        while (iterator.hasNext()){
            Character cha = iterator.next();
            //判断每个char出现的次数
            int num = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == cha){
                    num += 1;
                }
            }
            if(num > chars.length/2){
                return true;
            };
        }

        return false;
    }

}
