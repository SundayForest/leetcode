package leetcode.hot;

import leetcode.common.ListNode;

/**
 * @author sunday
 * @create 2023 --- 03 --- 06 --- 10:37
 */
public class getIntersectionNode160 {
//    给你两个单链表的头节点 headA 和 headB ，
//    请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
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
