package leetcode;

/**
 * @author sunday
 * @create 2022 --- 11 --- 01 --- 23:52
 */
public class ReverseString344 {
    public static void reverseString(char[] s) {
        if(s == null || s.length < 2){
            return;
        }
        int low = 0;
        int high = s.length - 1;
        char temp;
        while(low < high){
            temp = s[low];
            s[low++] = s[high];
            s[high--] = temp;
        }
    }
}
