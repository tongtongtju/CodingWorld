package LeetCode;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 23:28
 */
/*
给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到
位置 right 的链表节点，返回 反转后的链表 。


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode guard = dummyHead;
        ListNode point = head;
        ListNode removed;
        //将两个指针移到指定位置,point指向最初的left位置的节点
        for (int i = 1; i < left; i++) {
            guard = guard.next;
            point = point.next;
        }
        //头插法
        for (int i = 0; i < (right - left); i++) {
            removed = point.next; //将要反转的节点表示出来
            point.next = removed.next; //删除节点

            //添加节点
            //先让removed指向guard的next，不然guard.next会被丢失，而removed,guard则不会丢失
            removed.next = guard.next;
            guard.next = removed;
        }
        //因为不知道head节点是否被反转了，所以应该用dummyHead.next来返回
        return dummyHead.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
