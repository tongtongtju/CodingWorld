package Nowcoder;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-05 23:57
 */
//题目描述
//输入一个链表，反转链表后，输出新链表的表头。
//https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
public class NewCoder02 {
    public ListNode ReverseList(ListNode head) {
        if (head==null){return null;}
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pointer = head;
        ListNode removed;
        while (pointer.next!=null){
            removed = pointer.next;
            pointer.next = removed.next;

            removed.next = fakeHead.next;
            fakeHead.next = removed;
        }

        return fakeHead.next;
    }
}
