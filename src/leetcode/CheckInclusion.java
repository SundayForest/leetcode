package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author sunday
 * @create 2022 --- 11 --- 03 --- 14:07
 */

//给你两个字符串s1和s2 ，写一个函数来判断 s2 是否包含 s1的排列。如果是，返回 true ；否则，返回 false 。
//
//换句话说，s1 的排列之一是 s2 的 子串 。

public class CheckInclusion {
    public static void main(String[] args) {
        char[] s = {'s','s'};
        char b = 's';
        int i = s[0];
        System.out.println(i);
//        System.out.println(s^b);
    }
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int i1 = c1[0];
        int i2 = c2[0];
        HashMap<Character,Integer> map1 = new HashMap();
        for(int i = 1; i < c1.length; i++){
            i1 ^= c1[i];
            i2 ^= c2[i];
            if(map1.containsKey(c1[i])){
                map1.put(c1[i],1);
            }else{
                Integer t = map1.get(c1[i]);
                int temp = t + 1;
                map1.put(c1[i],temp);
            }
        }
        for(int i = c1.length; i < c2.length; i++){
            if(i1 == i2){
                HashMap<Character,Integer> map2 = new HashMap();
                for(int j = 0; j < c1.length; j++){
                    if(map2.containsKey(c2[i + j])){
                        map2.put(c1[i + j],1);
                    }else{
                        int t = map2.get(c1[i + j]) + 1;
                        map2.put(c1[i + j],t);
                    }
                }
                Set<Character> set = map2.keySet();
                Object[] keys = set.toArray();
                boolean flag = true;
                for(int k = 0; k < keys.length; k++){
                    if(map1.get(keys[k]) != map2.get(keys[k])){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return flag;
                }
            }
            i2 ^= c2[i - c1.length];
            i2 ^= c2[i];
        }
        HashMap<Character,Integer> map2 = new HashMap();
        for(int j = 0; j < c1.length; j++){
            if(map2.containsKey(c2[c2.length - c1.length + 1 + j])){
                map2.put(c1[c2.length - c1.length + 1 + j],1);
            }else{
                map2.put(c1[c2.length - c1.length + 1 + j],map1.get(c1[c2.length - c1.length + 1 + j]) + 1);
            }
        }
        Set<Character> set = map2.keySet();
        Object[] keys = set.toArray();
        boolean flag = true;
        for(int k = 0; k < keys.length; k++){
            if(map1.get(keys[k]) != map2.get(keys[k])){
                flag = false;
                break;
            }
        }
        if(flag){
            return flag;
        }
        return false;
    }
}
