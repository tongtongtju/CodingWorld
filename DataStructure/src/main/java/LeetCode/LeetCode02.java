package LeetCode;

import org.junit.Test;
import org.w3c.dom.ls.LSException;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-02 11:29
 */
/*
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode02 {
    @Test
    public void test(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        LeetCode02 leetCode02 = new LeetCode02();
        ListNode listNode = leetCode02.addTwoNumbers(l1, l2);
        System.out.println(listNode.toString());

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while (l1!=null||l2!=null){

            int n1 = (l1 != null ? l1.val : 0);
            int n2 = (l2 != null ? l2.val : 0);
            int num = n1 + n2 + carry;
            if(head==null){
                head = new ListNode(num%10);
                tail = head;
            }else{
                tail.next = new ListNode(num%10);
                tail = tail.next;
            }
            carry = num/10;
            if(l1!=null){l1 = l1.next;}
            if(l2!=null){l2 = l2.next;}

        }
        if(carry!=0){
            tail.next = new ListNode(carry);
            tail = tail.next;
        }


        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
