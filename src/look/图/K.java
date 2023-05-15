package look.图;

import java.util.*;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 15:52
 */
public class K {
//    最小生成树  k  算法
    public static class UnionFind{
        private HashMap<Node,Node> fatherMap;
        private HashMap<Node,Integer> sizeMap;
        public UnionFind(){
            fatherMap = new HashMap<>();
            sizeMap = new HashMap<>();
        }
        public void makeSets(Collection<Node> nodes){
            fatherMap.clear();
            sizeMap.clear();
            for(Node node : nodes){
                fatherMap.put(node,node);
                sizeMap.put(node,1);
            }
        }
        public Node findFather(Node node){
            Stack<Node> path = new Stack<>();
            while(node != fatherMap.get(node)){
                path.add(node);
                node = fatherMap.get(node);
            }
            while (!path.isEmpty()){
                fatherMap.put(path.pop(),node);
            }
            return node;
        }
        public boolean isSameSet(Node a,Node b){
            return findFather(a) == findFather(b);
        }
        public void union(Node a,Node b){
            if(a == null || b == null){
                return;
            }
            Node aDai = fatherMap.get(a);
            Node bDai = fatherMap.get(b);
            if(aDai != bDai){
                int aSetSize = sizeMap.get(aDai);
                int bSetSize = sizeMap.get(bDai);
                if(aSetSize <= bSetSize){
                    fatherMap.put(aDai,bDai);
                    sizeMap.put(bDai,aSetSize+bSetSize);
                    sizeMap.remove(aDai);
                }else{
                    fatherMap.put(bDai,aDai);
                    sizeMap.put(aDai,aSetSize+bSetSize);
                    sizeMap.remove(bDai);
                }
            }
        }
    }
    public static class EdgeCom implements Comparator<Edge>{

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }

    public static Set<Edge> kruskalMST(Graph graph){
        UnionFind unionFind = new UnionFind();
        unionFind.makeSets(graph.nodes.values());
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeCom());
        for(Edge edge : graph.edges){
            priorityQueue.add(edge);
        }
        Set<Edge> result =  new HashSet<>();
        while(!priorityQueue.isEmpty()){
            Edge edge = priorityQueue.poll();
            if(!unionFind.isSameSet(edge.from,edge.to)){
                result.add(edge);
                unionFind.union(edge.from,edge.to);
            }
        }
        return result;
    }
}
