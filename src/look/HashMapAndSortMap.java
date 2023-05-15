package look;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * @author sunday
 * @create 2022 --- 10 --- 30 --- 19:18
 */
public class HashMapAndSortMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"i am 1");
        map.put(2,"i am 2");
        map.put(3,"i am 3");
        map.put(4,"i am 4");
        map.put(5,"i am 5");
        map.put(6,"i am 6");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(10));
        System.out.println(map.get(4));
        System.out.println(map.get(12));
        map.remove(4);


        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.contains("abc");
        set.remove("abc");

//        哈希表增删改查  o（1）！！！！！！！！！！！
        System.out.println("===========有序表===========");
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"i am 2");
        treeMap.put(1,"i am 1");
        treeMap.put(3,"i am 3");
        treeMap.put(5,"i am 5");
        treeMap.put(8,"i am 8");
        treeMap.put(4,"i am 4");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
//        <=5 并且和 5 最近
        System.out.println(treeMap.floorKey(5));
//        >=6 并且和 6 最近
        System.out.println(treeMap.ceilingKey(6));
    }
}
