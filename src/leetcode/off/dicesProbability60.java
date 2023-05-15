package leetcode.off;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author sunday
 * @create 2023 --- 01 --- 29 --- 11:08
 */
public class dicesProbability60 {
    public static double[] dices(int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);
        map.put(5,1);
        map.put(6,1);
        for(int i = 1; i < n; i++){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            int[] a = new int[map.size()];
            int index = 0;
            for(Integer p : map.keySet()){
                a[index++] = p;
            }
            for(int j = 0; j < a.length; j++){
                for(int k = 1; k < 7; k++){
                    if(hashMap.containsKey(a[j] + k)){
                        hashMap.put(a[j] + k,hashMap.get(a[j] + k) + map.get(a[j]));
                    }else{
                        hashMap.put(a[j] + k, map.get(a[j]));
                    }
                }
            }
//            for(int j = 1; j < 7; j++){
//                for(int p : a){
//                    if(hashMap.containsKey(p + j)){
//                        if(map.containsKey(p + j)) {
//                            hashMap.put(p + j, hashMap.get(p + j) + map.get(p + j));
//                        }else{
//                            hashMap.put(p + j, hashMap.get(p + j) + 1);
//                        }
//                    }else{
//                        hashMap.put(p + j,1);
//                    }
//                }
//            }
            map.clear();
            map.putAll(hashMap);
        }
        double total = 0;
        for(Integer i : map.values()){
            total += i;
        }
        int index = 0;
        double[] key = new double[map.size()];
        for(Integer i : map.keySet()){
            key[index++] = map.get(i) / total;
        }
        return key;
    }

    public static void main(String[] args) {
        dices(2);
    }
}
