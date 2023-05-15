package look;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2022 --- 11 --- 05 --- 20:21
 */
public class CopyListWithRand {
    public static class Node{
        public int value;
        public Node next;
        public Node Rand;

        public Node(int value){
            this.value = value;
        }
    }

    public static Node copyListWithRand(Node head){
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null){
            map.put(cur,new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = cur.next;
            map.get(cur).Rand = cur.Rand;
            cur = cur.next;
        }
        return map.get(head);
    }
}
