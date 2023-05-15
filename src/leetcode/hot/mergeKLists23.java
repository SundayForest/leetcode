package leetcode.hot;

import java.util.List;
import java.util.PriorityQueue;

/**
 * @author sunday
 * @create 2023 --- 02 --- 18 --- 20:38
 */
public class mergeKLists23 {
//    给你一个链表数组，每个链表都已经按升序排列。
//
//请你将所有链表合并到一个升序链表中，返回合并后的链表。
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode node : lists){
            if(node != null) queue.add(node);
        }
        ListNode head = new ListNode();
        ListNode tail = head;
        while (!queue.isEmpty()){
            ListNode node = queue.poll();
            tail.next = node;
            tail = tail.next;
            if(node.next != null){
                queue.add(node.next);
            }
        }
        return head.next;
    }
}
