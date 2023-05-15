package leetcode.off;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 18:05
 */
public class GetIntersectionNode52 {
//    输入两个链表，找出它们的第一个公共节点
//    俩个链表，分别往后走，如果相同，则返回
//    当一个走到头，则取另一个链表的开始，因为俩链表之和相同，总会走到一起，要么结束为null，要么相遇
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
    ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != null || node2 != null){
            if(node1 == null){
                node1 = headB;
            }
            if(node2 == null){
                node2 = headA;
            }
            if(node1 == node2){
                return node1;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return null;
    }
}
