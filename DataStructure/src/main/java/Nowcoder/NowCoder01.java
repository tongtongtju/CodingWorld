package Nowcoder;

import java.util.HashSet;
import java.util.List;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-05 22:54
 */
/*
题目描述
判断给定的链表中是否有环。如果有环则返回true，否则返回false。
你能给出空间复杂度O(1)的解法么？
https://www.nowcoder.com/practice/650474f313294468a4ded3ce0f7898b9?tab=answerKey
https://leetcode-cn.com/problems/linked-list-cycle-lcci/solution/
 */

public class NowCoder01 {
    //快慢指针 O(1)空间复杂度
    public boolean hasCycle(ListNode head) {
        if (head == null){return false;}
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null){
            slow = slow.next;
            if(fast.next!=null){
                fast = fast.next.next;
            }else{
                return false;
            }
            if(slow == fast){
                return true;
            }
        }
        return false;


    }
    //返回入环节点
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            //返回入环节点
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/linked-list-cycle-lcci/solution/huan-lu-jian-ce-by-leetcode-solution-s2la/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


    //哈希表
    public boolean hasCycle1(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode pos = head;
        while (pos!=null){
            if (hashSet.contains(pos)){
                return true;
            }
            hashSet.add(pos);
            pos = pos.next;
        }
        return false;


    }
}
