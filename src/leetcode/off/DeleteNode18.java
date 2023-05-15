package leetcode.off;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 17:40
 */
public class DeleteNode18 {
//    给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
//      返回删除后的链表的头节点。
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(val == head.val){
            return head.next;
        }
        ListNode node = head.next;
        ListNode before = head;
        while(node != null){
            if(node.val == val){
                before.next = node.next;
                break;
            }
            node = node.next;
            before = before.next;
        }
        return head;
    }
}
