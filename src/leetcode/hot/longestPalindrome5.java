package leetcode.hot;

import java.util.Stack;

/**
 * @author sunday
 * @create 2023 --- 02 --- 13 --- 11:39
 */
public class longestPalindrome5 {
//    给你一个字符串 s，找到 s 中最长的回文子串。
//    如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
    public static String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        char[] chars = new char[s.length() * 2 + 1];
        int index = 0;
        for(int i = 0; i < chars.length; i++){
            if((i & 1) == 0){
                chars[i] = '#';
            }else{
                chars[i] = s.charAt(index++);
            }
        }
        String ns = new String(chars);
        int[] help = new int[ns.length()];
        int c = -1;
        int r = -1;
        int max = Integer.MIN_VALUE;
        int place = 0;
        for (int i = 0; i < help.length; i++){
            help[i] = c > r ? Math.min(help[c * 2 - i],r - i) : 1;
            while (i + help[i] < help.length && i - help[i] > -1){
                if(chars[i + help[i]] == chars[i - help[i]]){
                    help[i]++;
                }else {
                    break;
                }
            }
            if(i + help[i] > r){
                r = i + help[i];
                c = i;
            }
            if(help[i] > max){
                max = help[i];
                place = i;
            }
        }
//        if((max - 1) % 2 == 0){
//            return s.substring(place - help[place] / 2 + 1,place + help[place] / 2 + 1);
//        }
        return s.substring(place / 2 - (max - 1) / 2,place / 2 - (max - 1) / 2 + max - 1);
    }

    public static void main(String[] args) {
        longestPalindrome("babad");
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("afa"));
        System.out.println(longestPalindrome("cbbd"));
    }
}
