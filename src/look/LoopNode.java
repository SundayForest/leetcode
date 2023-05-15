package look;

import java.util.jar.JarEntry;

/**
 * @author sunday
 * @create 2022 --- 11 --- 05 --- 20:32
 */
public class LoopNode {
//  寻找链表环 以及找到 入环点  先快慢指针走，走到相遇， 然后快指针回到开头，慢指针留在原地，一起一次一步，相遇即为入环点
    public static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public static Node getLoopNode(Node head){
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        Node n1 = head.next;
        Node n2 = head.next.next;
        while (n1 != n2){
            if(n2.next == null || n2.next.next == null){
                return null;
            }
            n2 = n2.next.next;
            n1 = n1.next;
        }
        n2 = head;
        while(n1 != n2){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }


}
