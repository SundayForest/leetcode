package leetcode.off;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 01 --- 01 --- 16:31
 */
public class ReversePrint06Off {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
    class Solution {
        public int[] reversePrint(ListNode head) {
            if(head == null){
                return new int[0];
            }
            Stack<Integer> stack = new Stack<>();
            ListNode node = head;
            while(node.next != null){
                stack.push(node.val);
                node = node.next;
            }
            if(node != null){
                stack.push(node.val);
            }
            int[] res = new int[stack.size()];
            int i = 0;
            while(!stack.isEmpty()){
                res[i++] = stack.pop();
            }
            return res;
        }
    }
}
