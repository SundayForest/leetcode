package look.图;

import javax.management.Query;
import java.util.*;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:44
 */
public class TopologySort {
//    图的拓扑排序
    public static List<Node> sorted(Graph graph){
//        key : node
//        value : 剩余的入度
        HashMap<Node,Integer> inmap = new HashMap<>();
//        入度为 0 的点进入该队列
        Queue<Node> queue = new LinkedList<>();
        for(Node node : graph.nodes.values()){
            inmap.put(node,node.in);
            if(node.in == 0){
                queue.add(node);
            }
        }
        List<Node> result = new ArrayList<>();
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            result.add(cur);
            for(Node n : cur.nexts){
                inmap.put(n , inmap.get(n) - 1);
                if(inmap.get(n) == 0){
                    queue.add(n);
                }
            }
        }
        return result;
    }
}
