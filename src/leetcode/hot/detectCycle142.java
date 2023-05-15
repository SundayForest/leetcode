package leetcode.hot;

import leetcode.common.ListNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 20:31
 */
public class detectCycle142 {
//    给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (true){
            fast = fast.next;
            if(fast == null){
                return null;
            }
            fast = fast.next;
            if(fast == null){
                return null;
            }
            slow = slow.next;
            if(fast == slow){
                fast = head;
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
    }
}
