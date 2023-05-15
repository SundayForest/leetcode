package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 13 --- 23:35
 */
public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] s = {"flower","flss","flaaa"};
        longestCommonPrefix(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String res = "";
        List<char[]> list = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            list.add(strs[i].toCharArray());
        }
        for(int i = 0; ; i++){
            char temp ='s';
            if(i >= list.get(0).length){
                return res;
            }else{
                temp = list.get(0)[i];
            }
            for(int j = 0; j < strs.length;j++){
                if(i >= list.get(j).length){
                    return res;
                }
                if(temp != list.get(j)[i]){
                    return res;
                }
            }
            res += temp;
        }
    }
}
