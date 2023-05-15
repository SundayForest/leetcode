package look.图;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author sunday
 * @create 2022 --- 11 --- 12 --- 14:41
 */
public class Dijkstra {
    public static HashMap<Node,Integer> dijkstra(Node from){
        HashMap<Node,Integer> distanceMap = new HashMap<>();
        distanceMap.put(from,0);
//        已经求过的点，锁住
        HashSet<Node> selectedNodes = new HashSet<>();
        Node minNode = getMinDistanceAndUnselected(distanceMap,selectedNodes);
        while(minNode!=null){
            int distance = distanceMap.get(minNode);
            for(Edge edge : minNode.edges){
                Node toNode = edge.to;
                if(!distanceMap.containsKey(toNode)){
                    distanceMap.put(toNode,distance+edge.weight);
                }else{
                    distanceMap.put(toNode,Math.min(distanceMap.get(toNode),distance+edge.weight));
                }
            }
//            锁住
            selectedNodes.add(minNode);
//            重新找一个最小的
            minNode = getMinDistanceAndUnselected(distanceMap,selectedNodes);
        }
        return distanceMap;
    }

    public static Node getMinDistanceAndUnselected(HashMap<Node,Integer> distance, HashSet<Node> touchedNodes){
        Node minNode = null;
        int min = Integer.MAX_VALUE;
//        map.entrySet() 获取map中所有键值对的集合
        for(Map.Entry<Node,Integer> entry : distance.entrySet()){
            Node node = entry.getKey();
            int dis = entry.getValue();
            if(!touchedNodes.contains(node) && dis < min){
                min = dis;
                minNode = node;
            }
        }
        return minNode;
    }
}
