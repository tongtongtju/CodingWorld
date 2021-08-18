package test;

import java.util.ArrayList;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-07-26 23:44
 */
public class testObject {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
        o1 = o2;
        System.out.println(o1 == o2);
        System.out.println(o1);
        System.out.println(o2);
//        new ArrayList<>()

    }
}
