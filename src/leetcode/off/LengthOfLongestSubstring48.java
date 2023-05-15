package leetcode.off;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author sunday
 * @create 2023 --- 01 --- 19 --- 17:13
 */
public class LengthOfLongestSubstring48 {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int max = 1;
        int p = 1;
        int head = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(chars[0],0);
        for(int i = 1; i < s.length(); i++){
            if(!map.containsKey(chars[i]) || head > map.get(chars[i])){
                p++;
            }else{
                p = i - map.get(chars[i]);
                head = map.get(chars[i]);
            }
            max = Math.max(max,p);
            map.put(chars[i],i);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abba";
        lengthOfLongestSubstring(s);
        System.out.println(lengthOfLongestSubstring(s));
    }
}
