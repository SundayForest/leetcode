package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 02 --- 16:46
 */
public class MiddleNode876 {
//    给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//
//    如果有两个中间结点，则返回第二个中间结点
    public ListNode middleNode(ListNode head) {
        int num = 1;
        ListNode temp = head;
        while(temp.next != null){
            num++;
            temp = temp.next;
        }
        temp = head;
        int step;
        for(int i = 0;i < num / 2;i++){
            temp = temp.next;
        }
        return temp;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
