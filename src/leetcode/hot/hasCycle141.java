package leetcode.hot;

import leetcode.common.ListNode;

import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 10:01
 */
public class hasCycle141 {
//    给你一个链表的头节点 head ，判断链表中是否有环。
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next;
            if(fast == slow){
                return true;
            }
            fast = fast.next;
            if(fast == slow){
                return true;
            }
            slow = slow.next;
        }
        return false;
    }
}
