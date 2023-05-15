package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 17 --- 21:06
 */
public class mergeTwoLists21 {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//  将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode node = head;
        while (t1 != null && t2 != null){
            if(t1.val < t2.val){
                node.next = t1;
                t1 = t1.next;
            }else{
                node.next = t2;
                t2 = t2.next;
            }
            node = node.next;
        }
        if(t1 == null){
            node.next = t2;
        }else{
            node.next = t1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        mergeTwoLists(node1,node4);
    }
}
