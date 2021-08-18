package others.interview210411;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-11 10:34
 */
public class test2 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        String str1 = "qwerababwccq";
        System.out.println(str1.indexOf("w", 2));
//        new ArrayDeque<>()
//        System.out.println(str1.substring(0, 4));
//        HashSet<String> strings = new HashSet<>();
//        strings.add("q");
//        strings.add("a");
//        System.out.println(strings.size());

    }
}
