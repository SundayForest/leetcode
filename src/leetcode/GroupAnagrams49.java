package leetcode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author sunday
 * @create 2022 --- 11 --- 20 --- 20:12
 */
//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
//
//字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。

public class GroupAnagrams49 {
//  此题看了题解， 采用 将字符串先排序 再看 map 里面有没有的方法来确认是否有重复
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
//            获得一个字符串用这个方式，用toString（）方法会得到地址的字符串
            if(!hashMap.containsKey(key)){
                List<String> nl = new ArrayList<>();
                nl.add(s);
                hashMap.put(key,nl);
            }else{
                List<String> nl = hashMap.get(key);
                nl.add(s);
                hashMap.put(key, nl);
            }
        }
        return new ArrayList<List<String>>(hashMap.values());
//        超时啦
//        List<List<String>> list = new ArrayList<>();
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i = 0; i < strs.length; i++){
//            if(hashSet.contains(i)) {
//                continue;
//            }
//            hashSet.add(i);
//            List<String> l = new ArrayList<>();
//            HashMap<Character,Integer> hashMap = new HashMap<>();
//            for(int k = 0; k < strs[i].length(); k++){
//                if(!hashMap.containsKey(strs[i].charAt(k))){
//                    hashMap.put(strs[i].charAt(k),1);
//                }else{
//                    hashMap.put(strs[i].charAt(k),hashMap.get(strs[i].charAt(k)) + 1);
//                }
//            }
//            l.add(strs[i]);
//            for(int j = i + 1; j < strs.length; j++){
//                if(hashSet.contains(j)){
//                    continue;
//                }
//                HashMap<Character,Integer> hash = new HashMap<>();
//                for(int k = 0; k < strs[j].length(); k++){
//                    if(!hash.containsKey(strs[j].charAt(k))){
//                        hash.put(strs[j].charAt(k),1);
//                    }else{
//                        hash.put(strs[j].charAt(k),hash.get(strs[j].charAt(k)) + 1);
//                    }
//                }
//                if (hash.equals(hashMap)){
//                    hashSet.add(j);
//                    l.add(strs[j]);
//                }
//            }
//            list.add(l);
//        }
//        return list;
    }
}
