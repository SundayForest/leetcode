package leetcode.hot;

import java.util.*;

/**
 * @author sunday
 * @create 2023 --- 03 --- 05 --- 21:29
 */
public class canPermutePalindrome0104 {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            count += entry.getValue() % 2;
        }
        return count <= 1;
    }
}
