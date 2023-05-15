package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 14 --- 22:34
 */
public class StrStr28 {
//    给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
//    如果needle 不是 haystack 的一部分，则返回 -1 。
    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        int n = 0;
        int h = 0;
        for(int i = 0; i < needle.length(); i++){
            n ^= needle.charAt(i);
            h ^= haystack.charAt(i);
        }
        int i = 0;
        while(i + needle.length() < haystack.length()){
            if(n == h){
                boolean b = true;
                for(int j = 0; j < needle.length(); j++){
                    if(needle.charAt(j) != haystack.charAt(j + i)){
                        b = false;
                        break;
                    }
                }
                if(b){
                    return i;
                }
            }
            h ^= haystack.charAt(i);
            h ^= haystack.charAt(i + needle.length());
            i++;
        }
        if(h == n){
            boolean b = true;
            for(int j = 0; j < needle.length(); j++){
                if(needle.charAt(j) != haystack.charAt(j + i)){
                    b = false;
                    break;
                }
            }
            if(b){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "a";
        String h = "a";
        strStr(s,h);
    }
}
