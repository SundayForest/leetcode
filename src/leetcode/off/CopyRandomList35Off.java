package leetcode.off;

import java.util.HashMap;

/**
 * @author sunday
 * @create 2023 --- 01 --- 01 --- 16:44
 */
public class CopyRandomList35Off {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashMap = new HashMap<>();
        if(head == null){
            return head;
        }
        Node node = head;
        while(node != null){
            Node newNode = new Node(node.val);
            hashMap.put(node,newNode);
            node = node.next;
        }
        node = head;
        while(node != null){
            hashMap.get(node).random = hashMap.get(node.random);
            hashMap.get(node).next = hashMap.get(node.next);
            node = node.next;
        }
        return hashMap.get(head);
    }
    }
}
