package leetcode;

import java.util.Arrays;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 19:51
 */
public class IsUnique01_01 {
    public static void main(String[] args) {
        String s = "aa";
        isUnique(s);
    }
    public static boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        if(chars.length > 26){
            return false;
        }
        Arrays.sort(chars);
        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                return false;
            }
        }
        return true;
    }
}
