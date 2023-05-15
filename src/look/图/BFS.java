package look.图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:27
 */
public class BFS {
//    宽度优先遍历
    public static void bfs(Node node){
        if(node == null){
            return;
        }
//        队列
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> hashSet = new HashSet<>();
        queue.add(node);
        hashSet.add(node);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur);
            for(Node n : cur.nexts){
                if(!hashSet.contains(n)){
                    hashSet.add(n);
                    queue.add(n);
                }
            }
        }
    }
}
