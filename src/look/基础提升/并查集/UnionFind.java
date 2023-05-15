package look.基础提升.并查集;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 01 --- 18 --- 11:11
 */
public class UnionFind {
//    样本包一层
    public static class Element<V>{
        public V value;
        public Element(V value) {
            this.value = value;
        }
    }
    public static class UnionFindSet<V>{
//        key 值 value 值对应的封装后元素
        public HashMap<V,Element<V>> elementHashMap;
//        key 某个元素 value 该元素的父
        public HashMap<Element<V>,Element<V>> fatherMap;
//        key 某个集合的代表元素 value 该集合的大小
        public HashMap<Element<V>,Integer> sizeMap;
        public UnionFindSet(List<V> list){
            elementHashMap = new HashMap<>();
            fatherMap = new HashMap<>();
            sizeMap = new HashMap<>();
            for(V value :list){
                Element<V> element = new Element<>(value);
                elementHashMap.put(value,element);
                fatherMap.put(element,element);
                sizeMap.put(element,1);
            }
        }
//        查看俩个值是否在同一集合内
        public boolean isSameSet(V a,V b){
            if(elementHashMap.containsKey(a) && elementHashMap.containsKey(b)){
                return findHead(elementHashMap.get(a)) == findHead(elementHashMap.get(b));
            }
            return false;
        }
//      找到元素的 father ，并且将结构扁平化，即把路径上所有元素的上一个都指向头
        private Element<V> findHead(Element<V> element) {
            Stack<Element<V>> path = new Stack<>();
            while(element != fatherMap.get(element)){
                path.push(element);
                element = fatherMap.get(element);
            }
            while(!path.isEmpty()){
//
                fatherMap.put(path.pop(),element);
            }
            return element;
        }
//        将俩个元素所在集合合并
        public void union(V a,V b){
            if (elementHashMap.containsKey(a) && elementHashMap.containsKey(b)) {
                Element<V> af = findHead(elementHashMap.get(a));
                Element<V> bf = findHead(elementHashMap.get(b));
                if(af != bf){
//                    寻找数量较少的那个，把小的那个的 father 挂在大的那个的 father
                    Element<V> big = sizeMap.get(af) > sizeMap.get(bf) ? af : bf;
                    Element<V> small = big == af ? bf : af;
                    fatherMap.put(small,big);
                    sizeMap.put(big, sizeMap.get(af) + sizeMap.get(bf));
                    sizeMap.remove(small);
                }
            }
        }
    }
}
