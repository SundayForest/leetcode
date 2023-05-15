package leetcode.hot;

import leetcode.common.ListNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 20:21
 */
public class reverseList206 {
//    给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode next = head.next;
        ListNode aft;
        node.next = null;
        while (next != null){
            aft = next.next;
            next.next = node;
            node = next;
            next = aft;
        }
        return node;
    }
}
