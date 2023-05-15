package look.图;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 14:17
 */

//边
public class Edge {
    public int weight;
    public Node from;
    public Node to;
    public Edge(int weight,Node from,Node to){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
