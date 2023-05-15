package look.图;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:19
 */
//图
public class Graph {
    public HashMap<Integer,Node> nodes;
    public HashSet<Edge> edges;
    public Graph(){
        nodes = new HashMap<>();
        edges = new HashSet<>();
    }
}
