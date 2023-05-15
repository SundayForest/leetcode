package leetcode.off;

import java.util.List;
import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 01 --- 01 --- 16:38
 */
public class ReverseList24Off {
//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }


    public ListNode reverseList(ListNode head) {
            if(head == null){
                return head;
            }
            Stack<Integer> stack = new Stack<>();
            ListNode node = head;
            while(node != null){
                stack.push(node.val);
                node = node.next;
            }
            ListNode res = new ListNode(stack.pop());
            node = res;
            while(!stack.isEmpty()){
                ListNode listNode = new ListNode(stack.pop());
                node.next = listNode;
                node = listNode;
            }
            return res;
    }
}
