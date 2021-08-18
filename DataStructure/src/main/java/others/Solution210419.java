package others;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-19 17:34
 * 京东大数据面试
 */
//两个有序链表合成一个有序链表
public class Solution210419 {

    public Node merge(Node n1, Node n2){
        Node p1 = n1;
        Node p2 = n2;
        Node head;
        if(p1.val>p2.val){
            head = new Node(p2.val);
            p2 = p2.next;
        }else{
            head = new Node(p1.val);
            p1 = p1.next;
        }
        Node p3 = head;
        while(p1 != null || p2 != null){
            if(p1 != null & p2 != null){
                if(p1.val>p2.val){
                    p3.next = p2;
                    p3 = p3.next;
                    p2 = p2.next;
                }else{
                    p3.next = p1;
                    p3 = p3.next;
                    p1 = p1.next;
                }
            }
            if(p1 == null){
                p3 = p2;
                p3 = p3.next;
                p2 = p2.next;
            }
            if(p2 == null){
                p3 = p1;
                p3 = p3.next;
                p1 = p1.next;
            }
        }
        return head;

    }
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
