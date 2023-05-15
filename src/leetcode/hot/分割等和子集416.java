package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 15 --- 19:35
 */
public class 分割等和子集416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if((sum & 1) == 1){
            return false;
        }
        sum >>= 1;
        boolean[][] dp = new boolean[nums.length + 1][sum + 1];
        for (int i = 0; i < dp.length; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = dp[i - 1][j];
                int p;
                if(!dp[i][j] &&(p = j - nums[i - 1]) >= 0){
                    dp[i][j] = dp[i- 1][p];
                }
            }
        }
        return dp[nums.length][sum];
    }
}
