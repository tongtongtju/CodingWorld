package others.Interview210418;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-18 20:12
 */

public class Solution1 {
    public ListNode solve (ListNode S) {
        // write code here
        if(S == null){return null;}
        int min = S.val;
        int num1 = 0; //记录临时值
        int num = 0; //记录最长连续长度
        ListNode pointer = S;

        while (pointer.next != null){
            pointer = pointer.next;
            min = (min > pointer.val?pointer.val:min);
        }
        while (pointer.next != null){
            if (pointer.val == min){
                num1++;
                num = (num>num1?num:num1);
            }else{
                num1=0;
            }
        }
        int num2 = 1;
        //------------
        ListNode pointer1 = S;
        pointer1 = S;
        while (pointer1.val != min) {
            pointer1 = round(pointer1);
        }

        //还要判断最小值连起来的长度最多
        while (pointer1.next.val == min) {
            pointer1 = round(pointer1);
            num2++;
        }
        //----------
        while (num2!=num) {
            num2 = 1;
            while (pointer1.val != min) {
                pointer1 = round(pointer1);
            }

            //还要判断最小值连起来的长度最多
            while (pointer1.next.val == min) {
                pointer1 = round(pointer1);
                num2++;
            }
        }

        return pointer1;
    }
    //要判断是否有重复值
    public static ListNode round(ListNode listNode){
        ListNode head = listNode.next;
        ListNode pointer = listNode;
        while (pointer.next!=null){
            pointer = pointer.next;
        }
        pointer.next = listNode;
        listNode.next = null;
        return head;
    }
}

//备用
//import java.util.*;
//
///*
// * public class ListNode {
// *   int val;
// *   ListNode next = null;
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param S ListNode类 val表示权值，next指向下一个元素
//     * @return ListNode类
//     */
//    public ListNode solve (ListNode S) {
//        // write code here
//        if(S == null){return null;}
//        int min = S.val;
//        ListNode pointer = S;
//        while (pointer.next != null){
//            pointer = pointer.next;
//            min = (min > pointer.val?pointer.val:min);
//        }
//        while (S.val != min){
//            S = round(S);
//        }
//        while(S.next.val == min){
//            S = round(S);
//        }
//        return S;
//    }
//    //要判断是否有重复值
//    public static ListNode round(ListNode listNode){
//        ListNode head = listNode.next;
//        ListNode pointer = listNode;
//        while (pointer.next!=null){
//            pointer = pointer.next;
//        }
//        pointer.next = listNode;
//        listNode.next = null;
//        return head;
//    }
//}
