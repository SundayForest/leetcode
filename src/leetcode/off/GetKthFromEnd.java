package leetcode.off;


import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 17:46
 */
public class GetKthFromEnd {
//    输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，
//   即链表的尾节点是倒数第1个节点。
//例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。
// 这个链表的倒数第 3 个节点是值为 4 的节点
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            list.add(node);
            node = node.next;
        }
        if(list.size() - k >= 0){
            return list.get(list.size() - k);
        }else{
            return null;
        }
    }
}
