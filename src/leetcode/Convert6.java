package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunday
 * @create 2022 --- 11 --- 14 --- 16:54
 */
public class Convert6 {
//    将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//    之后，你的输出需要从左往右逐行读取，产生出一个新的字符串
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        char[] chars = s.toCharArray();
        String res = "";
        List<List<Character>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            list.add(new ArrayList<>());
        }
        int p = 0;
        int step = -1;
        for(int i = 0; i < chars.length; i++){
            if(p == numRows - 1 || p == 0){
                step = -step;
            }
            list.get(p).add(chars[i]);
            p += step;
        }
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < list.get(i).size(); j++){
                res += list.get(i).get(j);
            }
        }
        return res;
    }
}
