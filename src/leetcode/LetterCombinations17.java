package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 19 --- 21:30
 */
//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
public class LetterCombinations17 {
    public static void main(String[] args) {
        letterCombinations("23");
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        HashMap<Character,String> hashMap = new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        getString(list,"",0,digits,hashMap);
        return list;
    }
    public static void getString(List<String> list,String str,int index,String digits,HashMap<Character,String> hashMap){
        if(index == digits.length()){
            list.add(str);
            return;
        }
        String s = hashMap.get(digits.charAt(index));
        index++;
        for(int i = 0; i < s.length();i++){
            getString(list,str+s.charAt(i),index,digits,hashMap);
        }
    }
}
