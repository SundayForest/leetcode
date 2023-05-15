package leetcode.off;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author sunday
 * @create 2023 --- 01 --- 05 --- 14:49
 */
public class FirstUniqChar50Off {
//    在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    public static char firstUniqChar(String s) {
        Map<Character,Boolean> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),false);
            }else{
                map.put(s.charAt(i),true);
            }
        }
        for(Map.Entry<Character,Boolean> entry:map.entrySet()){
            System.out.println(entry.getKey());
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}
