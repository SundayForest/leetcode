package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 22 --- 14:41
 */
public class minWindow76 {
//    给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
//    如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
    public static String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        int step = -1;
        int cur = 0;
        int curLength = 0;
        int[] countT = new int[60];
        int[] countS = new int[60];
        for (int i = 0; i < t.length(); i++){
            countT[t.charAt(i) - 'A']++;
        }
        for(int i = 0; i < s.length(); ){
            boolean flag = true;
            for (int j = 0; j < 60; j++){
                if(countS[j] < countT[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(curLength < minLength){
                    minLength = curLength;
                    step = cur;
                }
                countS[s.charAt(cur++) - 'A']--;
                curLength--;
            }else{
                if(i == s.length()){
                    continue;
                }
                countS[s.charAt(i) - 'A']++;
                i++;
                curLength++;
            }
        }
        for (int i = cur; i < s.length(); i++){
            boolean flag = true;
            for (int j = 0; j < 60; j++){
                if(countS[j] < countT[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(curLength < minLength){
                    minLength = curLength;
                    step = cur;
                }
                countS[s.charAt(cur++) - 'A']--;
                curLength--;
            }else{
                break;
            }
        }
        return step == -1 ? "" : s.substring(step,step + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        minWindow(s,t);
        System.out.println(minWindow(s,t));
    }
}
