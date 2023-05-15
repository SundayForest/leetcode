package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 02 --- 21 --- 18:24
 */
public class longestValidParentheses32 {
//    给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
    public static int longestValidParentheses(String s) {
        int count = 0;
        int max = 0;
        int pre = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                pre++;
            }else{
                if(pre == 0){
                    max = Math.max(max,count);
                    count = 0;
                }else{
                    count += 2;
                    pre--;
                }
            }
        }
        int temp = 0;
        if(pre != 0){
            int aft = 0;
            for(int i = s.length() - 1; i >= 0; i--){
                if(pre == 0){
                    break;
                }
                if(s.charAt(i) == ')'){
                    aft++;
                }else{
                    if (aft != 0){
                        aft--;
                        temp += 2;
                    }else{
                        pre--;
                        max = Math.max(max,temp);
//                        max = Math.max(max,count - temp);
                        count -= temp;
                        temp = 0;

                    }
                }
            }
            max = Math.max(max,temp);
            max = Math.max(max,count - temp);
        }else{
            max = Math.max(max,count);
        }
        return max;
//        int p = 0;
//        int c = 0;
//        for(int i = s.length() - 1; i >= 0; i--){
//            if(s.charAt(i) == ')'){
//                p++;
//            }else{
//                if(p == 0){
//                    break;
//                }else{
//                    c += 2;
//                    p--;
//                }
//            }
//        }
//        return pre == 0 ? Math.max(max,count) : Math.max(max,c);
    }

    public static void main(String[] args) {
        String s = "()(()(((";
        longestValidParentheses(s);
        System.out.println(longestValidParentheses(s));
    }
}
