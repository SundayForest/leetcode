package look;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 14:58
 */
public class ReverseList {
    public static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class DoubleNode{
        public int value;
        public DoubleNode next;
        public DoubleNode last;
    }
//反转单连表
    public static Node reverseLinkedList(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
//    反转双向链表
    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.last = next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
//  删除链表中的所有某个值的节点
    public static Node removeValue(Node head,int value){
        while(head != null){
            if(head.value != value){
                break;
            }
            head = head.next;
        }
//        删去前面所有该被删去的连续value = value节点
        Node pre = head;
        Node cur = head;
        while (cur != null){
            if (cur.value == value){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
