package Nowcoder;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-05 22:53
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
