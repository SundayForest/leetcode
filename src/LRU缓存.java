

import java.util.HashMap;

/**
 * @author sunday
 * @create 2023 --- 03 --- 16 --- 21:25
 */
public class LRU缓存 {


    public static void main(String[] args) {
        LRUCach cache = new LRUCach(2);
        cache.put(2,1);
        cache.put(1,1);
//        System.out.println(cache.get(1));
        cache.put(2,3);
        cache.put(4,1);
        cache.get(1);
//        System.out.println(cache.get(1));
//        System.out.println(cache.get(2));

    }

}
class LRUCach{
    private HashMap<Integer,LRUNode> map;
    private int size;
    private int capacity;
    private LRUNode head,tail;
    public LRUCach(int capacity) {
        size = 0;
        this.capacity = capacity;
        map = new HashMap<>();
        head = new LRUNode();
        tail = new LRUNode();
        head.next = tail;
        tail.last = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        LRUNode node = map.get(key);
        removeNode(node);
        addNodeToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(!map.containsKey(key)){
            LRUNode node = new LRUNode(key,value);
            map.put(key,node);
            addNodeToHead(node);
            if(size > capacity){
                map.remove(tail.last.key);
                removeNode(tail.last);
            }
        }else{
            LRUNode node = map.get(key);
            node.value = value;
            removeNode(node);
            addNodeToHead(node);
        }

    }
    private void removeNode(LRUNode node){
        node.last.next = node.next;
        node.next.last = node.last;
        size--;
    }
    private void addNodeToHead(LRUNode node){
        node.next = head.next;
        node.last = head;
        head.next.last = node;
        head.next = node;
        size++;
    }
}
class LRUNode{
    int key;
    int value;
    LRUNode last;
    LRUNode next;

    public LRUNode() {
    }

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
