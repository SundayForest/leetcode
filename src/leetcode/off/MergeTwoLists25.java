package leetcode.off;

import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 17:55
 */
public class MergeTwoLists25 {
//    输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (node1 != null && node2 != null){
            if(node1.val <= node2.val){
                node.next = node1;
                node1 = node1.next;
                node = node.next;
            }else{
                node.next = node2;
                node2 = node2.next;
                node = node.next;
            }
        }
        while(node1 != null){
            node.next = node1;
            node1 = node1.next;
            node = node.next;
        }
        while(node2 != null){
            node.next = node2;
            node2 = node2.next;
            node = node.next;
        }
        return head.next;

    }
}
