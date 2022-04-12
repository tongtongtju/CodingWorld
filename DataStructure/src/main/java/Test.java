import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-14 22:24
 */

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        String method_Name = "name";
//        String name = "set"+method_Name.substring(0,1).toUpperCase()+method_Name.substring(1);
        Semaphore semaphore = new Semaphore(2);
        semaphore.release(2);
        System.out.println(semaphore.drainPermits());
    }

//        Person person = new Person();
//        Method m1 = person.getClass().getMethod("walk", String.class, Integer.class);
//        String friend = "xiaoniu";
//        Integer age = 20;
//        m1.invoke(person,friend,age);

//        int total = 10000; // 总数量
//        BloomFilter<Integer> bf =
//                BloomFilter.create(Funnels.integerFunnel(), total);
//        // 初始化 1000000 条数据到过滤器中
//        for (int i = 0; i < total; i++) {
//            bf.put( i);
//        }
//        // 判断值是否存在过滤器中
//        int count = 0;
//        for (int i = 0; i < total + 100; i++) {
//            if (bf.mightContain( i)) {
//                count++;
//            }
//        }
//        System.out.println("已经匹配的数量"+ count);





/*
//        InputStream in = System.in;
        List<String> list = Arrays.asList("tong,xiang".split(","));
        String s1 = "hello";
        System.out.println(add(1,2));
        StringBuffer str = new StringBuffer("aad");
        System.out.println(str.append(2).append(2.2d).append('t').append('-').append("tong"));
        Student stu1 = new Student(18, "ming");
        Student stu2 = new Student(13, "qi");
        System.out.println(stu1.compareTo(stu2));
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
//        MyComparator comparator = new MyComparator();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age-o1.age;
            }
        });
        System.out.println(students.toString());
    }

    private static int add(int a,int b){
        return a+b;
    }
    static class MyComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.age-o2.age);
        }
    }
*/

}
