package Nowcoder;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-06 0:04
 */
/*
最小的K个数
题目描述
给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
如果K>数组的长度，那么返回一个空的数组
https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tab=answerKey
 */
public class NowCoder03 {
    public static void main(String[] args) {
        int[] ints = {2, 4, 6, 1, 8, 4, 6};
        ArrayList<Integer> integers = GetLeastNumbers_Solution(ints, 0);
        System.out.println(integers.toString());
    }

    //冒泡排序
    public ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (k > input.length) {
            return al;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;
    }
    //堆排序
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input == null || input.length == 0 || k>input.length || k == 0){
            return new ArrayList<>(0);
        }

        //默认为小顶堆，需要自定义compare变成大顶堆
        //构建PriorityQueue时，k!=0,否则会报错java.lang.IllegalArgumentException,上面要先对k=0进行限制
        PriorityQueue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
        for (Integer e : input) {
            if(heap.isEmpty() || heap.size()<k || e < heap.peek()){
                heap.offer(e);
            }
            //PriorityQueue会自动扩容
            if(heap.size()>k){
                heap.poll();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        for (Integer integer : heap) {
            list.add(integer);
        }
        return list;
    }
/*
    //利用堆排序，O(N logK)，适合处理海量数据
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] arr) {
        return null;
    }

    //利用快速排序中的获取分割（中轴）点位置函数getPartition。
    public ArrayList<Integer> GetLeastNumbers_Solution1(int [] arr) {

        return null;
    }
*/
}
