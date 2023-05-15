package look.图;

import java.util.ArrayList;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:13
 */
//点
public class Node {
//    点的表述
    public int value;
//    入度
    public int in;
//    出度
    public int out;
//    出去的直接邻居点
    public ArrayList<Node> nexts;
//      出去的边
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }
}
