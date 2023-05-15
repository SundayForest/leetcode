package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 11 --- 10:58
 */
public class 最长回文字串 {
    public static String longestPalindrome(String s) {
        char[] chars = new char[s.length() * 2 + 1];
        int index = 0;
        for(int i = 0; i < chars.length; i++){
            if((i&1)==0){
                chars[i] = '-';
            }else{
                chars[i] = s.charAt(index++);
            }
        }
        int dp[] = new int[chars.length];
        int center = 0;
        int right = 0;
        int begin = 0;
        int max = 1;
        for(int i = 0; i < dp.length; i++){
            if(i < right){
                dp[i] = Math.min(dp[2 * center - i],right - i);
            }
            int l = i - dp[i] - 1;
            int r = i + dp[i] + 1;
            while (l >= 0 && r < dp.length && chars[l] == chars[r]){
                l--;
                r++;
                dp[i]++;
            }
            if(i + dp[i] > right){
                right = i + dp[i];
                center = i;
            }
            if(dp[i] > max){
                max = dp[i];
                begin = (i - max) >> 1;
            }
        }
        return s.substring(begin,begin + max);
    }

    public static void main(String[] args) {
        longestPalindrome("aacabdkacaa");
//        longestPalindrome("hhh");
    }
}
