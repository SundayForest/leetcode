package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 09 --- 15:50
 */
public class 一次编辑0105 {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        if (first.length() == second.length()) {
            int count = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                    if (count == 2) {
                        return false;
                    }
                }
            }
            return count < 2;
        } else {
            int pre = 0;
            for (; pre < first.length() && pre < second.length(); pre++) {
                if (first.charAt(pre) != second.charAt(pre)) break;
            }
            int count = Math.min(first.length(), second.length()) - pre;
            for (int j = 0; j < count; j++) {
                if (first.charAt(first.length() - j - 1) != second.charAt(second.length() - j - 1)) return false;
            }
            return true;
        }
    }
//        // first的第i个字符 变成 second 的前 j个字符 所需的次数
//        int length;
//        int[] dp = new int[length = Math.min(second.length(),first.length()) + 1];
//        int[] fun = new int[length];  // 0 本位置不需要操作，1 添加,2 修改
//        for(int i = 1; i < dp.length; i++){
//            if(first.charAt(i - 1) == second.charAt(i - 1)){
//                dp[i] = dp[i - 1];
//                fun[i] = 0;
//            }else{
//                if(i - 2 >= 0 && (first.charAt(i - 1) == second.charAt(i - 2))){
//
//                }
//            }
//        }
//    }
}
