package look;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author sunday
 * @create 2022 --- 11 --- 10 --- 17:48
 */
public class UnionFind {
    public static class Node<V>{
        V v;
        public Node(V v){
            this.v = v;
        }
    }
//    并查集   用较小代价找到 一个节点的   所在集合， 以及 合并俩个节点所在的集合
    public static class UnionSet<V>{
//        v --> 节点
        public HashMap<V,Node<V>> nodes;
//        记录节点往上指的节点是谁
        public HashMap<Node<V>,Node<V>> parents;
//       代表点（头节点）的大小
        public HashMap<Node<V>,Integer> sizes;
        public UnionSet(List<V> values){
            for (V value : values){
                Node<V> node = new Node<>(value);
                nodes.put(value,node);
                parents.put(node,node);
                sizes.put(node,1);
            }
        }
//        判断是否为同样一集合
        public boolean isSameSet(V a,V b){
            if(!nodes.containsKey(a) || !nodes.containsKey(b)){
                return false;
            }
            return findFather(nodes.get(a)) == findFather(nodes.get(b));
        }
//         整合
        public void union(V a,V b){
            if(!nodes.containsKey(a) || !nodes.containsKey(b)){
                return;
            }
            Node<V> ahead = findFather(nodes.get(a));
            Node<V> bhead = findFather(nodes.get(b));
            if(ahead != bhead){
                int aSetSize = sizes.get(a);
                int bSetSize = sizes.get(b);
                if(aSetSize >= bSetSize){
//                    小集合的父节点直接改成大集合的头节点
                    parents.put(bhead,ahead);
                    sizes.put(ahead,aSetSize + bSetSize);
                    sizes.remove(bhead);
                }else{
                    parents.put(ahead,bhead);
                    sizes.put(bhead,aSetSize + bSetSize);
                    sizes.remove(ahead);
                }
            }
        }
//      找到父节点
        public Node<V> findFather(Node<V> cur){
            Stack<Node<V>> path = new Stack<>();
            while(cur != parents.get(cur)){
                path.push(cur);
                cur = parents.get(cur);
            }
            while(!path.isEmpty()){
                parents.put(path.pop(),cur);
            }
            return cur;
        }
    }
}
