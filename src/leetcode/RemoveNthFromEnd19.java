package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 02 --- 17:00
 */

//给你一个链表，删除链表的倒数第  n 个结点，并且返回链表的头结点。
public class RemoveNthFromEnd19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int num = 1;
        ListNode temp = head;
        while(temp.next != null){
            num++;
            temp = temp.next;
        }
        int place = num - n;
        temp = head;
        for(int i = 1; i < place;i++){
            temp = temp.next;
        }
        if(place == 0){
            return temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
