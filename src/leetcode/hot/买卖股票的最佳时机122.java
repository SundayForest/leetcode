package leetcode.hot;

/**
 * @author sunday
 * @create 2023 --- 03 --- 11 --- 10:36
 */
public class 买卖股票的最佳时机122 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int dp[][] = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < dp.length ;i++){
            dp[i][0] = Math.max(dp[i - 1][0],dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][0] - prices[i]);
        }
        return dp[dp.length - 1][0];
    }
}
