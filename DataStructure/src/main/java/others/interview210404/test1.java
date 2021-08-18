package others.interview210404;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 20:22
 */
public class test1 {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
//        StringBuilder stringBuilder = new StringBuilder(str);
//        stringBuilder.delete(1, 2);
//        System.out.println(stringBuilder);

    }
}
