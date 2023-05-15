package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 11 --- 19:22
 */
public class IsPalindrome9 {
    public boolean isPalindrome(int x) {
        String s = "" + x;
        char[] chars = s.toCharArray();
        int head = 0;
        int tail = chars.length - 1;
        while(head < tail){
            if(chars[head++] != chars[tail--]){
                return false;
            }
        }
        return true;
    }
}
