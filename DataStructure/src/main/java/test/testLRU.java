package test;

import java.util.LinkedHashMap;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-07-25 22:35
 */
public class testLRU {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(8, 075f, true);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map.get(2));
        System.out.println(map.toString());

    }
}
