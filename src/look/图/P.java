package look.图;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 16:17
 */
public class P {
//    图的最小生成树之 P 算法
    public static class EdgeCom implements Comparator<Edge> {

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }
    public static Set<Edge> primMST(Graph graph){
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeCom());
        HashSet<Node> set = new HashSet<>();
        Set<Edge> result = new HashSet<>();
        for(Node node : graph.nodes.values()){
            if(!set.contains(node)){
                set.add(node);
            }
            for(Edge edge : node.edges){  //由一个点解锁一批边
                priorityQueue.add(edge);
            }
            while(!priorityQueue.isEmpty()){
                Edge edge = priorityQueue.poll();
                Node toNode = edge.to;
                if(!set.contains(toNode)){
                    set.add(toNode);
                    result.add(edge);
                    for(Edge next : toNode.edges){
                        priorityQueue.add(next);
                    }
                }
            }
        }
        return result;
    }
}
